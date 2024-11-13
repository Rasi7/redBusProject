Feature: busTicket
Scenario: Validate user is able to login 
Given Browser will be lunched and url should be navigated
When  user click on Account
And user click on login/signup 
And user enter phone number
When click on generate otp
And click on verify otp
Then user is able to click on bus ticket