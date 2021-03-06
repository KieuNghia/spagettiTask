package com.epam.kiieu.utils.steps;

import com.epam.kiieu.pages.GmailInboxPage;
import com.epam.kiieu.pages.GmailLoginPage;
import com.epam.kiieu.pages.GmailThemePage;
import com.epam.kiieu.steps.GmailThemeSteps;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.WebDriver;


public abstract class BaseStep {

    protected WebDriver driver;
    protected GmailInboxPage gmailInboxPage;
    protected GmailLoginPage gmailLoginPage;
    protected GmailThemePage gmailThemePage;

    public GmailLoginPage getGmailLoginPage() {
        return gmailLoginPage;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public GmailInboxPage getGmailInboxPage() {
        return gmailInboxPage;
    }

    public BaseStep(WebDriver driver){
        this.driver = driver;
        this.gmailInboxPage = new GmailInboxPage(driver);
        this.gmailLoginPage = new GmailLoginPage(driver);
        this.gmailThemePage = new GmailThemePage(driver);

    }

}
