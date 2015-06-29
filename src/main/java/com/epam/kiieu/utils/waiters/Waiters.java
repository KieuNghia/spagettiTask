package com.epam.kiieu.utils.waiters;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by nghia on 28.06.2015.
 */
public class Waiters {



    public static void delay(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementIsVisible(WebElement webElement, WebDriver driver) {
        Wait wait = new FluentWait(driver)
                .pollingEvery(2, TimeUnit.SECONDS)
                .withTimeout(25, TimeUnit.SECONDS)
                .ignoring(WebDriverException.class);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementNotVisible(By locator, WebDriver driver) {
        delay(1000);
        Wait wait = new FluentWait(driver)
                .pollingEvery(2, TimeUnit.SECONDS)
                .withTimeout(25, TimeUnit.SECONDS)
                .ignoring(WebDriverException.class);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }


    public static void waitForPageLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
}
