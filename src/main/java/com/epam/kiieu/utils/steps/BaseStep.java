package com.epam.kiieu.utils.steps;

import com.epam.kiieu.pages.GmailInboxPage;
import com.epam.kiieu.pages.GmailLoginPage;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.WebDriver;

/**
 * Created by nghia on 28.06.2015.
 */
public abstract class BaseStep {

    protected WebDriver driver;
    protected GmailInboxPage gmailInboxPage;
    protected GmailLoginPage gmailLoginPage;

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

    }

}
