package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.web.test.utils.CommonUtils.clickOnElement;
import static com.web.test.utils.DriverUtils.getDriver;


public class CheckoutPage {
    public CheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"blog\"]/div[3]/div[1]/div/div/div[3]/div[1]/div/div/a/i")
    private WebElement cart;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div/div/article/div/div/div[1]/div/div[2]/div/table/tbody/tr[2]/td")
    private WebElement total;

    public void verifyCart(String val) throws InterruptedException {

        clickOnElement(cart);
        if (total.getText().contains(val)) {
            System.out.println("lowest price item added to the cart");
        } else {
            System.out.println("lowest price item NOT added to the cart");
        }
    }
}

