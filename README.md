# Introduction 
This Junit 5 / TestNG Framework is designed for use in IntelliJ and includes source code for testing Mobile & Web 
front-end and service back-end. This solution utilizes the latest in functional programming using Junit 5 and TestNG.
It includes:
 - SOLID design principles applied
 - Parallelization support
 - Driver Management
 - Context switching
 - Config Management
 - Implementation abstraction
 - wired for execution using Selenium Grid and Browserstack
 - RestAssured

# Getting Started
TODO: Guide users through getting your code up and running on their own system. In this section you can talk about:
1. Install IntelliJ
2. Install Java SDK version 11 and set environment variables
3. Install Maven and set environment variables

### Documentation
If you want to learn more refer the following:
- [Cypress Official Docs](https://docs.cypress.io/guides/)

# Install Dependencies
On the commandline at the base of the project, perform:
_mvn clean install_

Alternative: Just open the project and let it sync. Then run a rebuild.

# Build and Test
1. Just open the project and let it sync. Then run a rebuild.
2. To run individual tests, just select the test and click run.
3. You can run the tests from the testng.xml files as well.

# Configurations
The solution is wired for different test configurations under _src/tests/resources_, and it uses
the following config classes to set their values at runtime:
 - ApiConfig
 - BrowserStackConfig
 - FrameworkConfig

# Contribute
If you would like to contribute to the source, please reach out to Director of Quality Engineering, Antwan Maddox,
or the Automation Team within the Quality Guild.
