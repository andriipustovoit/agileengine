# AgileEngine backend-XML java snippets

Test task implementation for https://agileengine.bitbucket.io/beKIvpUlPMtzhfAy/

To run application:

'''
java -jar ae-backend-xml-java-snippets-0.0.1-all.jar <input_origin_file_path> <input_other_sample_file_path> <target-element-id>
'''

Where:

* <input_origin_file_path> - origin sample path to find the element with attribute id="make-everything-ok-button" and collect all the required information;
* <input_other_sample_file_path> - path to diff-case HTML file to search a similar element;
* <target-element-id> - optional target element id for collecting the initial information.