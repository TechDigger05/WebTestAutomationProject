package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.web.test.utils.CommonUtils.clickOnElement;
import static com.web.test.utils.DriverUtils.getDriver;
//import static com.web.test.utils.WebElementUtils.createDynamicLocator;

public class ShopPage {
    public ShopPage() {
        PageFactory.initElements(getDriver(), this);
    }

    String lowest_item_price;

    @FindBy(css = "#menu-item-310 > a")
    private WebElement shopBtn;

    @FindBy(xpath = "//*[@id='site-content']/div/div/article/ul/li[1]/div/div[2]/div/div/a/span")
    private WebElement item1;

    @FindBy(xpath = "//*[@id='site-content']/div/div/article/ul/li[4]/div/div[2]/div/div/a/span")
    private WebElement item2;

    @FindBy(xpath = "//*[@id='site-content']/div/div/article/ul/li[6]/div/div[2]/div/div/a/span")
    private WebElement item3;

    @FindBy(xpath = "//*[@id='site-content']/div/div/article/ul/li[12]/div/div[2]/div/div/a/span")
    private WebElement item4;

    @FindBy(xpath = "//*[@id=\"cc-window\"]/div[5]/a[2]")
    private WebElement cookiesPopUp;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div/div/article/ul")
    private WebElement itemsCatalogue;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div/div/article/ul/li")
    List<WebElement> liElements;

    public void selectItemFromShopPage() throws InterruptedException {
        clickOnElement(shopBtn);
        clickOnElement(cookiesPopUp);
        clickOnElement(item1);
        clickOnElement(item2);
        clickOnElement(item3);
        clickOnElement(item4);
    }

    public String searchLowestPriceItem() throws InterruptedException {
        clickOnElement(cookiesPopUp);
        clickOnElement(shopBtn);
        List<WebElement> li_All = itemsCatalogue.findElements(By.tagName("bdi"));
        System.out.println(li_All.size());
        List<String> Original_price_lst = new ArrayList<String>();

        for (int i = 0; i < li_All.size(); i++) {
            Original_price_lst.add(li_All.get(i).getText().toString());
            System.out.println(li_All.get(i).getText());
        }
        Collections.sort(Original_price_lst);
        lowest_item_price = Original_price_lst.get(0);
        System.out.println("lowest item of the catalogue " + lowest_item_price);
        return (lowest_item_price);
    }

    public void addLowestPriceItemToCart() throws InterruptedException {
        clickOnElement(shopBtn);
        for (int i = 1; i <= liElements.size(); i++) {
            WebElement linkElement = getDriver().findElement(By.xpath("//*[@id=\"site-content\"]/div/div/article/ul/li[" + i + "]"));
            if (linkElement.getText().contains(lowest_item_price)) {
                System.out.println("item to be selected " + linkElement);
                WebElement finalitem = getDriver().findElement(By.xpath("//*[@id=\"site-content\"]/div/div/article/ul/li[" + i + "]/a[2]"));
                System.out.println("xpath of lowest price item " + finalitem);
                if (finalitem.getText().contains("Add to cart") || finalitem.getText().contains("Select options")) {
                    clickOnElement(finalitem);
                }
            }
        }
    }


}

