package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.web.test.utils.AssertionUtils.assertPageTitle;
import static com.web.test.utils.ConfigUtils.getPropertyByKey;
import static com.web.test.utils.DriverUtils.getDriver;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }


    @FindBy(id = "header_logo")
    private WebElement logoImage;

    public void verifyUserOnHomepage() {
        assertPageTitle(getPropertyByKey("homepage.title"));
    }


}
