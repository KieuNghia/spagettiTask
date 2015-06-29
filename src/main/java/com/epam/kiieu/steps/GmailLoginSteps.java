package com.epam.kiieu.steps;

import com.epam.kiieu.pages.GmailLoginPage;
import com.epam.kiieu.utils.steps.BaseStep;
import com.epam.kiieu.utils.waiters.Waiters;
import org.openqa.selenium.WebDriver;

/**
 * Created by nghia on 28.06.2015.
 */
public class GmailLoginSteps extends BaseStep {

    public GmailLoginSteps(WebDriver driver)
    {
     super(driver);

    }

    public GmailInboxSteps logIn(String userName, String password){

        Waiters.waitForElementIsVisible(gmailLoginPage.getLoginField(),driver);
        gmailLoginPage.getLoginField().sendKeys(userName);
        gmailLoginPage.getNextButton().click();
        Waiters.waitForElementIsVisible(gmailLoginPage.getPasswordField(),driver);
        gmailLoginPage.getPasswordField().sendKeys(password);
        gmailLoginPage.getOkButton().click();

        return new GmailInboxSteps(driver);

    }


}
