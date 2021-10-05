package com.web.test.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.web.test.utils.DriverUtils.getDriver;
import static com.web.test.utils.WebElementUtils.waitForVisible;


public class CommonUtils {
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void clickOnElement(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        waitForVisible(element);
        element.click();
    }

    public static void sendKeysTo(WebElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }

}
