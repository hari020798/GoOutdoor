@Scenario1
Feature: Ordering dress in GoOutdoor web application
Scenario: User Login In The Web Application
Given user launch the web application
When user accepting the cookies
Then user login in the gooutdoor

@Scenario2
Scenario: User adding the dress in Add to cart
Given user Selecting the Jacket section in the Men's Section and it's navigated to Mens dress section
When user clicked the jacket
And user selecting the Size of the jacket
And user selecting the Quantity of the jacket
Then user adding the Item and checking Out

@Scenario3
Scenario: User placing the order
Given user adding one more quantity
When user Selecting the Delivery options
Then user chekingout

