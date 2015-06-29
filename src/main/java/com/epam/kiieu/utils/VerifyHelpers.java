package com.epam.kiieu.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyHelpers{

    public static boolean isElementPresent(By by, WebDriver driver) {
        return !driver.findElements(by).isEmpty();
    }

}