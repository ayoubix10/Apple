Feature: User is able to search product using keyword
Scenario Outline: Positive search result
Given The user is on Apple homepage
When the user looks up <keyword>
And enters search button 
Then the user is able to view product info

Examples:

|keyword|
|mac|
|air pods|