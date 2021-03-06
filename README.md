# AgileEngine backend-XML java snippets

Test task implementation for https://agileengine.bitbucket.io/beKIvpUlPMtzhfAy/

To run pre-build application:

```
java -jar ae-backend-xml-java-snippets-0.0.1-all.jar <input_origin_file_path> <input_other_sample_file_path> <target-element-id>
```

To build and run application:

```
gradlew shadowJar
java -jar build\libs\ae-backend-xml-java-snippets-0.0.1-all.jar <input_origin_file_path> <input_other_sample_file_path> <target-element-id>
```

Where:

* <input_origin_file_path> - origin sample path to find the element with attribute id="make-everything-ok-button" and collect all the required information;
* <input_other_sample_file_path> - path to diff-case HTML file to search a similar element;
* <target-element-id> - optional target element id for collecting the initial information.


Output for **sample-1-evil-gemini.html** file:

```
Using make-everything-ok-button as target element ID.
Found 8 candidates within the scope element #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > button.btn.btn-default.btn-xs.dropdown-toggle
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(1) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(2) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(3) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(5) > a
Similarity 53%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > a.btn.btn-danger
Similarity 69%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > a.btn.btn-success
Highest similarity 69%, cssSelector: #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > a.btn.btn-success

#page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > a.btn.btn-success
```

Output for **sample-2-container-and-clone.html** file:

```
Using make-everything-ok-button as target element ID.
Found 7 candidates within the scope element #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > button.btn.btn-default.btn-xs.dropdown-toggle
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(1) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(2) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(3) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(5) > a
Similarity 69%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > div.some-container > a.btn.test-link-ok
Highest similarity 69%, cssSelector: #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > div.some-container > a.btn.test-link-ok

#page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > div.some-container > a.btn.test-link-ok
```

Output for **sample-3-the-escape.html** file:

```
Using make-everything-ok-button as target element ID.
Found 8 candidates within the scope element #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > button.btn.btn-default.btn-xs.dropdown-toggle
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(1) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(2) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(3) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(5) > a
Similarity 53%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > a.btn.btn-warning
Similarity 76%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success
Highest similarity 76%, cssSelector: #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success

#page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success
```

Output for **sample-4-the-mash.html** file:

```
Using make-everything-ok-button as target element ID.
Found 8 candidates within the scope element #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading
Similarity 7%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > button.btn.btn-default.btn-xs.dropdown-toggle
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(1) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(2) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(3) > a
Similarity 15%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-heading > div.pull-right > div.btn-group > ul.dropdown-menu.pull-right > li:nth-child(5) > a
Similarity 23%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > button.btn.btn-success
Similarity 76%, cssSelector #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success
Highest similarity 76%, cssSelector: #page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success

#page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success
```



