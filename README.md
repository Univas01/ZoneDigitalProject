# zonedigitalproject

**Tools used for carrying out the task**

Manual testing - Excel

Automated testing - Selenium WebDriver with Page Object Model Approach (Maven Project with TestNG). This includes Path to ExtentReport: /com.zonedigital.qa/test-output/ExtentReportsTestNG.html


**Demonstrate what types of testing would you conduct**
1. Exploratory test, which includes trying to Navigate to EastEnders Landing Page via various links
2. Cross Browser testing to ensure same results

**Demonstrate an understanding of the permutations and variations would you test**
1. Verifying EastEnders next episode via search box
2. Verifying EastEnders next episode via All programs


**Demonstrate edge or corner cases would consider**

Scenario: Searching for next episode before the Start Time
Given today is next available episode
When user searches before the start time
Then next Episode's date and time is displayed as of today

Scenario: Searching for next episode within the Start Time
Given today is next available episode
When user searches while the program has already began
Then next Episode's date and time should not be as of today

**Demonstrate how bugs would be raised if found**

Regardless of defect tracking tool being used (eg JIRA, Bugzilla, HP ALM/Quality Center, excel etc), we should try to follow similar pattern while raising bugs.
1. Create a ticket and provide steps to replicate the bug, also include the following
* Screen shots
* Browsers and their versions
* Devices
* Actual result Vs Expected result
2. Assign ticket to product owner so he/she can replicate and re-assign to a developer


