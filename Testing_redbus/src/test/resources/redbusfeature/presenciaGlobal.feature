Feature: presenciaGlobal
Background:
Given Browser should be launched and url will be navigated
And user click on bus ticket button
And user click on Hindi language 

Scenario: Validate that the user is  able to see main bus route in colombia
When user click on Colombia 
And colombia page should be displayed
Then user click on main bus route in colombia
And user should get the relavent information

Scenario: Validate that the user is able to get the answer for the FAQs
When user click on Indonesia 
Then user click on FAQs 
And user should get relavent answer for that question

Scenario: Validate that the user is able to get the top bus operators
When user click on Malaysia 
And user  click english language
Then user click on top operators 
And user should get relavent information

Scenario: Validate that the user is able to know how  much is a bus ride in Singapore and knowing about Booking 
When user click on Singapore 
And user click on bus ride 
Then user should see the relavent data
And user click on Booking
Then user click on the process of booking
And user should get relavent information about booking




