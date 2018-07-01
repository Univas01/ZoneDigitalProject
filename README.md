# Zone Digital Project

**Tools used for carrying out the task**
1. Microsoft Excel for Manual test
2. Selenium WebDriver with Page Object Model Approach for Automated test - This includes Path to ExtentReport: /com.zonedigital.qa/test-output/ExtentReportsTestNG.html

**Types of testing conducted are as follows;**
1. Exploratory test, which includes trying to Navigate to EastEnders Landing Page via various links
2. Cross Browser testing to ensure same results

**Permutations and variations of test carried out include;**
1. Verifying EastEnders next episode via *search box*
2. Verifying EastEnders next episode via *All programs*


**Edge test cases considered for the tests**

**Feature:** Finding out when the next episode of EastEnders occurs

**Scenario**: Searching for next episode before the Start Time
* Given today is next available episode
* When user searches before the start time
* Then next Episode's date and time is displayed as of today

**Scenario**: Searching for next episode within the Start Time
* Given today is next available episode
* When user searches while the program has already began
* Then next Episode's date and time should not be as of today

**Process of raising a bug**

Regardless of defect tracking tool being used (eg JIRA, Bugzilla, HP ALM/Quality Center, excel etc), we should try to follow similar pattern while raising bugs.
1. Create a ticket and provide steps to replicate the bug, also include the following
* Screen shots
* Browsers and their versions
* Devices
* Actual result Vs Expected result
2. Assign ticket to product owner so he/she can replicate and re-assign to a developer


