$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("outdoor.feature");
formatter.feature({
  "line": 2,
  "name": "Ordering dress in GoOutdoor web application",
  "description": "",
  "id": "ordering-dress-in-gooutdoor-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Scenario1"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "ordering-dress-in-gooutdoor-web-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user accepting the cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user login in the gooutdoor",
  "keyword": "Then "
});
formatter.match({
  "location": "OutdoorStep.userLaunchTheWebApplication()"
});
formatter.result({
  "duration": 88763622000,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userAcceptingTheCookies()"
});
formatter.result({
  "duration": 243198900,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userLoginInTheGooutdoor()"
});
formatter.result({
  "duration": 10837549900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User adding the dress in Add to cart",
  "description": "",
  "id": "ordering-dress-in-gooutdoor-web-application;user-adding-the-dress-in-add-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user Selecting the Jacket section in the Men\u0027s Section and it\u0027s navigated to Mens dress section",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user clicked the jacket",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user selecting the Size of the jacket",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user selecting the Quantity of the jacket",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user adding the Item and checking Out",
  "keyword": "Then "
});
formatter.match({
  "location": "OutdoorStep.userSelectingTheJacketSectionInTheMenSSectionAndItSNavigatedToMensDressSection()"
});
formatter.result({
  "duration": 5073812500,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userClickedTheJacket()"
});
formatter.result({
  "duration": 4874867800,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userSelectingTheSizeOfTheJacket()"
});
formatter.result({
  "duration": 561524900,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userSelectingTheQuantityOfTheJacket()"
});
formatter.result({
  "duration": 272880100,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userAddingTheItemAndCheckingOut()"
});
formatter.result({
  "duration": 5154400600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User placing the order",
  "description": "",
  "id": "ordering-dress-in-gooutdoor-web-application;user-placing-the-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user adding one more quantity",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user Selecting the Delivery options",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user chekingout",
  "keyword": "Then "
});
formatter.match({
  "location": "OutdoorStep.userAddingOneMoreQuantity()"
});
formatter.result({
  "duration": 2634809600,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userSelectingTheDeliveryOptions()"
});
formatter.result({
  "duration": 307087500,
  "status": "passed"
});
formatter.match({
  "location": "OutdoorStep.userChekingout()"
});
formatter.result({
  "duration": 188729200,
  "status": "passed"
});
});