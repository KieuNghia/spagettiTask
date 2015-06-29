package com.epam.kiieu.pages;

import com.epam.kiieu.utils.page.BasePage;
import com.google.common.base.FinalizablePhantomReference;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by nghia on 28.06.2015.
 */
public class GmailLoginPage extends BasePage {

    public final String LOGIN_FIELD = "//input[@id = 'Email']";
    public final String PASSWORD_FIELD = "//input[@id = 'Passwd']";
    public final String OK_BUTTON = "//input[@id='signIn']";
    public final String NEXT_BUTTON = "//input[@id='next']";
    public final String SWITCH_ACCOUNT = "//a[@id = 'account-chooser-link']";
    public final String ADD_ACCOUNT = "//a[@id = 'account-chooser-add-account']";

    public GmailLoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = SWITCH_ACCOUNT)
    private WebElement switchAccount;

    @FindBy(xpath = ADD_ACCOUNT)
    private WebElement addAcoountButoon;

    @FindBy(xpath = LOGIN_FIELD)
    private WebElement loginField;

    @FindBy(xpath = PASSWORD_FIELD)
    private WebElement passwordField;

    @FindBy(xpath = OK_BUTTON)
    private WebElement okButton;

    @FindBy(xpath = NEXT_BUTTON)
    private WebElement nextButton;

    public WebElement getSwitchAccount() {
        return switchAccount;
    }

    public WebElement getAddAcoountButoon() {
        return addAcoountButoon;
    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getOkButton() {
        return okButton;
    }

    public WebElement getNextButton() {
        return nextButton;
    }



}
