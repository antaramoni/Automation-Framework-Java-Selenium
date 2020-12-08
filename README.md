# Automation-Framework-Java-Selenium
This is a maven automation framework built with Java, Selenium web driver and testng followed by page object model.

Purpose
========
The framework is to automate the test scenarios of the Search module on https://frontend.nopcommerce.com/ 

Project Structure
=================

Source Folder: <Project_folder>/src

Test folder: <Project_folder>/src/test

Test Scripts path : src/test/seleniumtest

seleniumtest.SearchTest is the main Test class which has all the test methods(These test methods are configured with testng.xml. Test-method wise scenarios are listed into Automated Scenarios section at the bottom):

Test Initializa path (Hook): <Project_folder>/src/test/seleniumtest/TestInitialize.java

Page Objects
============
Page Objects of Home Page are designed on HomePage.java (path : <Project_folder>/src/test/testelements/pages)


Global and Test data configuration
===================================
Global Config file path (GlobalConfig.properties has the required test env params) : src/com/automation/framework/config (file: GlobalConfig.properties)

Test data config file path (TestConfig.properties has all the test data params) : src/com/automation/framework/config (file: TestConfig.properties)

ConfigReader.java (This class helps to read data from GlobalConfig.properties and TestConfig.properties)


Test Run
========

Clone the repo and let pom.xml to import all the libraries . Then open the testng.xml (testng.xml has been configure to run all the test methods of seleniumtest.SearchTest) .
Right clicking on the testng.xml and select "Run" would start running all the test methods. After the test run is done, the extent test report would be found in <Project_folder>/ TestReports/index.html

Test Reporting
==============
Test Report path: <Project_folder>/ TestReports/index.html


Automated Scenarios:
===================
Test Class: SearchTest.java  (path: <Project_folder>/test-> seleniumtest). SearchTest.java has all the test methods

Scenario-1: Validating Search Textbox and warning message by entering single character (Test method: SearchScenario01)

Scenario-2:Validating Search Textbox and warning message by entering double character (Test method: SearchScenario02)

Scenario-3:Validating Search Textbox and warning message by entering invalid 3 characters (Test method: SearchScenario03)

Scenario-4: Validating all the fields and lebels of Advanced Search" (Test method: SearchScenario04)

Scenario-5: Validating all list items of Category drop-down (Test method: SearchScenario05)

Scenario-6: Validating all the list items of Manufacturer drop-down (Test method: SearchScenario06)

Scenario-7: Validating search result after searching with a full valid search key, result should return correct product result (Test method: SearchScenario07)

Scenario-8: Validating search result after searching with a partial valid search key, result should return correct product result (Test method: SearchScenario08)

Scenario-9: Validating search result after searching with a lowercase valid search key with all advanced search parameter used, result should return correct product result (Test method: SearchScenario09)


Another way to implement tests: 
all the same above test methods can be declared in separate classes as well as follows (following classes are configured with another testng file testng1.xml):
SearchScenario01
SearchScenario02
SearchScenario03
SearchScenario04
SearchScenario05
SearchScenario06
SearchScenario07
SearchScenario08
SearchScenario09
And test data can be read from resource file (<Project_folder>/test/resources/validsearchkey.json). Test reporting can be handled with reporting utility.


