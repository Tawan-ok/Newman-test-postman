Running Tests Without Specifying Environment:

Command: newman run [collection name].json
Description: This command runs the tests in your [collection name].json collection without using any specific environment settings.

Running Tests With a Specific Environment:

Command: newman run [collection name].json -e [enviroment name].json
Description: Use this command to execute the tests in the [collection name].json collection while applying environment settings from the [enviroment name].json file. It's useful for testing with predefined variables that match a local environment setup.

Running Tests With Environment and Generating HTML Report:

Command: newman run [collection name].json -e [enviroment name].json -r htmlextra  or newman run [collection name].json -r htmlextra

Description: This command not only runs the tests using the [enviroment name].json environment settings but also generates a detailed HTML report. The -r htmlextra option enables the creation of a more comprehensive and visually appealing report compared to the default HTML reporter.
These rephrased instructions provide a clearer understanding of what each Newman command does and when to use them. They differentiate between running tests without environment settings, with environment settings, and with both environment settings and HTML report generation. 📝🔍