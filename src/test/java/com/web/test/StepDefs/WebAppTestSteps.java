package com.web.test.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ShopPage;
import pages.WishlistPage;

public class WebAppTestSteps {
    HomePage homepage = new HomePage();
    ShopPage shoppage = new ShopPage();
    WishlistPage wishlistPage = new WishlistPage();
    CheckoutPage checkoutpage = new CheckoutPage();
    public String val;

    @Given("^User is on Homepage of the application$")
    public void userIsOnHomepage() {
        homepage.verifyUserOnHomepage();
    }

    @When("^I add four different products to my wish list$")
    public void I_ADD_No_Of_Items_Different_Products_To_My_Wish_list() throws InterruptedException {
        shoppage.selectItemFromShopPage();
    }
    @And("^I view my wishlist table$")
    public void I_View_My_Wishlist_Table() throws InterruptedException {
        wishlistPage.navigateToMyWishList();
    }
    @Then("^I find total four products in my Wishlist$")
    public void I_Find_Total_Four_Products_In_My_Wishlist() throws InterruptedException {
        wishlistPage.countofWishlistItems();
    }

    @When("^I Search for lowest price product$")
    public void I_Search_For_Lowest_Price_Product() throws InterruptedException {
       val = shoppage.searchLowestPriceItem();
    }
    @And("^I am able to add the lowest price item to my cart$")
    public void I_Am_Able_To_Add_The_Lowest_Price_Item_To_My_Cart() throws InterruptedException {
        shoppage.addLowestPriceItemToCart();
    }
    @Then("^I am able to verify the item in my cart$")
    public void I_Am_Able_To_Verify_The_Item_In_My_Cart() throws InterruptedException {
        checkoutpage.verifyCart(val);
    }

}
