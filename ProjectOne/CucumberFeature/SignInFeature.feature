Feature: Amazon login functionality test
Scenario: positive scenario with valid registration
Given user is on Amazon homepage
 When user able to click sign in button
 And user is able to enter email 
 And user is able to click continue
 And user is able to input password
 And user is able to click signin button
 Then the user is able to view his account successfully
 