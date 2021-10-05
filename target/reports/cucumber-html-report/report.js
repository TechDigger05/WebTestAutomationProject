$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Shopping.feature");
formatter.feature({
  "line": 2,
  "name": "To verify the Wishlist and Shopping cart functionality of shopping site.",
  "description": "",
  "id": "to-verify-the-wishlist-and-shopping-cart-functionality-of-shopping-site.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 12672191200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "1. Verify the Wishlist page",
  "description": "",
  "id": "to-verify-the-wishlist-and-shopping-cart-functionality-of-shopping-site.;1.-verify-the-wishlist-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add four different products to my wish list",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I view my wishlist table",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I find total four products in my Wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 445014100,
  "status": "passed"
});
formatter.match({
  "location": "WebAppTestSteps.I_ADD_No_Of_Items_Different_Products_To_My_Wish_list()"
});
formatter.result({
  "duration": 33907656800,
  "status": "passed"
});
formatter.match({
  "location": "WebAppTestSteps.I_View_My_Wishlist_Table()"
});
formatter.result({
  "duration": 6503704400,
  "status": "passed"
});
formatter.match({
  "location": "WebAppTestSteps.I_Find_Total_Four_Products_In_My_Wishlist()"
});
formatter.result({
  "duration": 80377600,
  "status": "passed"
});
formatter.after({
  "duration": 899469800,
  "status": "passed"
});
formatter.before({
  "duration": 7880466400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "2. Add and verify lowest price item to the cart",
  "description": "",
  "id": "to-verify-the-wishlist-and-shopping-cart-functionality-of-shopping-site.;2.-add-and-verify-lowest-price-item-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I Search for lowest price product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I am able to add the lowest price item to my cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I am able to verify the item in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "WebAppTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 12110800,
  "status": "passed"
});
formatter.match({
  "location": "WebAppTestSteps.I_Search_For_Lowest_Price_Product()"
});
formatter.result({
  "duration": 13605500200,
  "status": "passed"
});
formatter.match({
  "location": "WebAppTestSteps.I_Am_Able_To_Add_The_Lowest_Price_Item_To_My_Cart()"
});
formatter.result({
  "duration": 13414501200,
  "status": "passed"
});
formatter.match({
  "location": "WebAppTestSteps.I_Am_Able_To_Verify_The_Item_In_My_Cart()"
});
formatter.result({
  "duration": 7268217800,
  "status": "passed"
});
formatter.after({
  "duration": 882577800,
  "status": "passed"
});
});