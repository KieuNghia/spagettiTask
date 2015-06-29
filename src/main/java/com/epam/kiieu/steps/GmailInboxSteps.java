package com.epam.kiieu.steps;

import com.epam.kiieu.pages.GmailInboxPage;
import com.epam.kiieu.pages.GmailThemePage;
import com.epam.kiieu.utils.Constants;
import com.epam.kiieu.utils.VerifyHelpers;
import com.epam.kiieu.utils.handlers.FilePathRobot;
import com.epam.kiieu.utils.steps.BaseStep;
import com.epam.kiieu.utils.waiters.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.By.xpath;

/**
 * Created by nghia on 28.06.2015.
 */
public class GmailInboxSteps extends BaseStep {

    public GmailInboxSteps(WebDriver driver) {
        super(driver);
    }

    public GmailInboxSteps createLetter(String recepient, String subject, String body) {
        Waiters.waitForElementIsVisible(gmailInboxPage.getCreateMailButton(), driver);
        gmailInboxPage.getCreateMailButton().click();
        Waiters.waitForElementIsVisible(gmailInboxPage.getLetterToField(), driver);
        gmailInboxPage.getLetterToField().sendKeys(recepient);
        gmailInboxPage.getLetterSubjectField().sendKeys(subject);
        gmailInboxPage.getLetterBodyField().sendKeys(body);
        gmailInboxPage.getLetterSendButton().click();
        return this;
    }

    public GmailInboxSteps createLetterWithFile(String recepient, String subject, String body) {
        gmailInboxPage.getCreateMailButton().click();
        gmailInboxPage.getLetterToField().sendKeys(recepient);
        gmailInboxPage.getLetterSubjectField().sendKeys(subject);
        gmailInboxPage.getLetterBodyField().sendKeys(body);
        gmailInboxPage.getLetterAddFileButton().click();
        FilePathRobot.filePathHandling();
        FilePathRobot.actionExecutor();
        gmailInboxPage.getLetterSendButton().click();
        return this;
    }

    public GmailLoginSteps logOut() {
        gmailInboxPage.getPopUpMenu().click();
        gmailInboxPage.getExitButton().click();
        return new GmailLoginSteps(driver);
    }

    public GmailThemeSteps goToThemePage() {
        gmailInboxPage.getSettingsButoon().click();
        gmailInboxPage.getThemeButton().click();
        return new GmailThemeSteps(driver);
    }

    public GmailInboxSteps markLetterAsSpam() {
        driver.findElement(xpath("//span/b[text()='" + Constants.LETTER_THEME + "']")).click();
        gmailInboxPage.getSendToSpamButton().click();
        return this;
    }

    public GmailInboxSteps goToSpamFolder() {
        gmailInboxPage.getMoreButton().click();
        gmailInboxPage.getSpamFolder().click();
        return this;
    }

    public GmailInboxSteps dragLetterToStarred() {
        WebElement element = driver.findElement(xpath("//span/b[text()='" + Constants.LETTER_THEME + "']"));
        (new Actions(driver)).dragAndDrop(element, gmailInboxPage.getStarredButton()).perform();
        return this;
    }

    public GmailInboxSteps goToStarredFolder() {
        gmailInboxPage.getStarredButton().click();
        return this;
    }

    public boolean verifyLetterPresent() {
        return VerifyHelpers.isElementPresent(By.xpath("//span/b[text()='" + Constants.LETTER_THEME + "']"), driver);
    }


}
