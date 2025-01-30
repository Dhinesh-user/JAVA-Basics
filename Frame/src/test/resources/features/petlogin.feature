Feature: Login page of jpetstore
 
Scenario Outline: Validate Login Page for valid values
 
Given Open application
When Click on enter the store link
And Click on signon button
Then Navigate to login page
When Enter username <username> and password <password>
And Click Login button
Then Navigate to Home page

Examples:
|username|password|
|j2ee|j2ee|
|Sunil|Sunil|