Feature: Login page of OrangeHRM
 
Scenario: Validate Login Page for valid values
 
Given Open browser and Launch URL
When Enter below credentials
|Admin |admin123|
And click Login button
Then you are in home page

