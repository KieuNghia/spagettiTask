package com.epam.kiieu.steps;

import com.epam.kiieu.pages.GmailThemePage;
import com.epam.kiieu.utils.steps.BaseStep;
import com.epam.kiieu.utils.waiters.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;


public class GmailThemeSteps extends BaseStep {

    public GmailThemeSteps (WebDriver driver){
        super(driver);
    }

    public GmailThemeSteps changeTheme(){
        Waiters.waitForElementIsVisible(gmailThemePage.getDarkTheme(), driver);
        gmailThemePage.getDarkTheme().click();
        return this;
     }

    public void verifySuccessMessage(){
        Assert.assertTrue(gmailThemePage.getThemeChangedPopup().isDisplayed(), "Successful message doesnt displayed");
    }



}
