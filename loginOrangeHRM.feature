Feature: Verify login feature in Orange HRM
Scenario: Login Scenario
Given user is in login page
When User enter valid username and valid password
And User clicks the login button
Then User should be navigated to home page