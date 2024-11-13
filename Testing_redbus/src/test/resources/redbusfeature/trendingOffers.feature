Feature: trendingOffers
Scenario: Validate user able to see the relavent bus offers
Given Browser should be launch and navigate to url
When user should click on Bus Ticket
And user should  click on ViewAll link
And user should navigate to Offer page
Then user should get bus Offers
And user should come back from bus offers