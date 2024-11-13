Feature: language
Scenario Outline: validate user should able to get data in relavent language
Given Brower should be lunched and url be navigated
When user is able to click on  <language> in the language dropdown
Then user should able to see the information in relavent language


Examples:
|language|
|1|
|2|
|3|

