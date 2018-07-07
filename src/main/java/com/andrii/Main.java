package com.andrii;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class Main {

    private static String CHARSET_NAME = "utf8";
    private static String DEFAULT_TARGET_ELEMENT_ID = "make-everything-ok-button";
    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        String originalHtmlFilePath = args[0];
        String modifiedHtmlFilePath = args[1];
        String targetElementId = args.length >= 3 ? args[2] : DEFAULT_TARGET_ELEMENT_ID;
        LOGGER.info("Using {} as target element ID.", targetElementId);
        doWork(new File(originalHtmlFilePath), new File(modifiedHtmlFilePath), targetElementId);
    }

    public static void doWork(File originalHtmlFile, File modifiedHtmlFile, String targetElementId) throws IOException {
        Element targetElement = findElementById(originalHtmlFile, targetElementId);
        Elements candidates = findCandidates(modifiedHtmlFile, targetElement);
        Optional<Element> bestCandidate = findBestCandidate(targetElement, candidates);
        if (bestCandidate.isPresent()) {
            System.out.println(bestCandidate.get().cssSelector());
        } else {
            System.out.println("Couldn't find a match.");
        }
    }

    private static Optional<Element> findBestCandidate(Element targetElement, Elements candidates) {
        Element bestCandidate = null;
        int highestSimilarity = 0;
        for(Element candidateElement: candidates) {
            int similarity = countSimilarity(targetElement, candidateElement);
            LOGGER.info("Similarity {}%, cssSelector {}", similarity, candidateElement.cssSelector());
            if (bestCandidate == null || similarity > highestSimilarity) {
                highestSimilarity = similarity;
                bestCandidate = candidateElement;
            }
        }
        LOGGER.info("Highest similarity {}%, cssSelector: {}", highestSimilarity, bestCandidate.cssSelector());
        return Optional.of(bestCandidate);
    }

    private static Element findElementById(File htmlFile, String targetElementId) throws IOException {
        Document doc = Jsoup.parse(
                htmlFile,
                CHARSET_NAME,
                htmlFile.getAbsolutePath());

        Element element = doc.getElementById(targetElementId);
        if (element != null) {
            return element;
        } else {
            throw new IllegalArgumentException(String.format("Element with ID '%s' is not found", targetElementId));
        }
    }

    private static int countSimilarity(Element template, Element candidate) {
        int similarity = 0;
        int maxSimilarity = 1 + template.attributes().size() * 2;
        if (template.tagName().equals(candidate.tagName())) {
            similarity++;
        }
        for (Attribute attribute: template.attributes()) {
            if (candidate.hasAttr(attribute.getKey())) {
                similarity++;
                if (candidate.attr(attribute.getKey()).equals(attribute.getValue())) {
                    similarity++;
                }
            }
        }
        return (similarity * 100) / maxSimilarity;
    }

    private static Elements findCandidates(File htmlFile, Element targetElement) throws IOException {
            Document doc = Jsoup.parse(
                    htmlFile,
                    CHARSET_NAME,
                    htmlFile.getAbsolutePath());
        Element targetAncestorElement = targetElement.parent();
        Elements candidates = new Elements();
        while (candidates.isEmpty() && targetAncestorElement.parent() != null) {
            targetAncestorElement = targetAncestorElement.parent();
            Element searchScope = doc.selectFirst(targetAncestorElement.cssSelector());
            if (searchScope != null) {
                candidates = searchScope.getElementsMatchingOwnText("..*");
            }
        }
        LOGGER.info("Found {} candidates within the scope element {}", candidates.size(), targetAncestorElement.cssSelector());
        return candidates;
    }
}


