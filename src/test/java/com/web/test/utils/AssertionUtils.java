package com.web.test.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.web.test.utils.DriverUtils.getDriver;

public class AssertionUtils {
    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s should be displayed !!!", element.getText()), element.isDisplayed());
    }
    private static void waitForVisible(WebElement element) {
    }

    public static void assertPageTitle(String expected) {
        String actualTitle = getDriver().getTitle();
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actualTitle  , expected), actualTitle.contains(expected));
    }
}
