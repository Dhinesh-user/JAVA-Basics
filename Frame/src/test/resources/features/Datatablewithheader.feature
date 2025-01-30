Feature: Login functionality with Datatable header

Scenario: OrangeHRM Login - DataTable with Header

Given Open browser and Launch OrangeHRM URL
When user enter below credentials
|username|password|
|Admin| admin123 |
|dk|dkja|
And user click Login button
Then user is in home page