package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.web.test.utils.AssertionUtils.assertPageTitle;
import static com.web.test.utils.CommonUtils.clickOnElement;
import static com.web.test.utils.ConfigUtils.getPropertyByKey;
import static com.web.test.utils.DriverUtils.getDriver;

public class WishlistPage {

    public WishlistPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "header-wishlist")
    private WebElement Wishlist;


    @FindBy(xpath = "//*[@id=\"yith-wcwl-form\"]")
    private WebElement summarytable;


    public void navigateToMyWishList() throws InterruptedException {
        clickOnElement(Wishlist);
        assertPageTitle(getPropertyByKey("wishlist.title"));
    }

    public void countofWishlistItems() throws InterruptedException {
        List<WebElement> listOfRows = summarytable.findElements(By.tagName("tr"));

        int count = listOfRows.size() - 1;
        System.out.println("Rows: " + count);
        if (count == 4) {
            System.out.println("Wishlist total no.of.items matched with expected no.of.items");
        } else {
            System.out.println("Wishlist total no.of.items NOT matched with expected no.of.items");
        }

    }
}

