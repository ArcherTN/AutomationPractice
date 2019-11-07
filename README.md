# AutomationPractice

When planning and designing the tests, the first thing I had in mind was ensuring that I had all the appropriate tools. 
My choice of tools is Java, Selenium, and jUnit, this set of tools provides me with everything I need for the job. 

The versions that I used were: Maven Compiler version 3.51, Selenium version 3.141.59, jUnit version 4.12.

The requirements were that registration, login, buying the most expensive dress and signing out and checking if the dress was still in the basket afterwards. 

My approach to structuring the tests was to intially create a base page for code I would consistently reuse. 

The base page included the web driver, the webdriver wait, and a few actions that I was going to be using consistently throughout the tests, selecting drop downs,waiting and clicking an element, ensuring elements are visible, typing into an element and an email generator so my tests are repeatable. 

Then I went about designing the tests that I wanted to perform, I created the outcome I wanted to see and then created PageObjects for them to execute. This included creating many static fields to input the css selectors for all the elements of the page and methods that use them to perform actions, e.g. selecting entering email and pressing the button. The tests would then be arranged in a way where each test only needs a method call from the PageObjects to execute, which increases the reusability of the code, as shown in most of the classes where multiple page objects are instatiated to reuse specific functions e.g. logging in before each test. 

There were a few issues in the process, there were a few website bugs that prevented ordering the dresses by the price, and the shopping cart didn't manage to keep the dresses in them. This would normally be reported as a bug for fixing, however due to the context of the situation I wrote the code I would need for those actions and commented out the bits that caused bugs. 

Test can be run with mvn -Dtest=TestSuite test

Hello this is a change.


