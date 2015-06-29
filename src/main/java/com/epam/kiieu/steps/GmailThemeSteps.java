package com.epam.kiieu.steps;

import com.epam.kiieu.pages.GmailThemePage;
import com.epam.kiieu.utils.steps.BaseStep;
import com.epam.kiieu.utils.waiters.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

/**
 * Created by nghia on 28.06.2015.
 */
public class GmailThemeSteps extends BaseStep {

    public GmailThemeSteps (WebDriver driver){
        super(driver);
    }

    public GmailThemeSteps changeTheme(){
        gmailThemePage.getDarkTheme().click();
        gmailThemePage.getLightTheme().click();
        return this;
     }

    public boolean verifySuccessMessage(){
        return gmailThemePage.getThemeChangedPopup().isDisplayed();
    }



}
