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

import java.awt.event.WindowAdapter;

import static com.epam.kiieu.utils.waiters.Waiters.*;
import static org.openqa.selenium.By.xpath;

/**
 * Created by nghia on 28.06.2015.
 */
public class GmailInboxSteps extends BaseStep {

    public GmailInboxSteps(WebDriver driver) {
        super(driver);
    }

    public GmailInboxSteps createLetter(String recepient, String subject, String body) {
        waitForElementIsVisible(gmailInboxPage.getCreateMailButton(), driver);
        gmailInboxPage.getCreateMailButton().click();
        waitForElementIsVisible(gmailInboxPage.getLetterToField(), driver);
        gmailInboxPage.getLetterToField().sendKeys(recepient);
        gmailInboxPage.getLetterSubjectField().sendKeys(subject);
        gmailInboxPage.getLetterBodyField().sendKeys(body);
        gmailInboxPage.getLetterSendButton().click();
        delay(2500);
        return this;
    }

    public GmailInboxSteps createLetterWithFile(String recepient, String subject, String body) {
        waitForElementIsVisible(gmailInboxPage.getCreateMailButton(), driver);
        gmailInboxPage.getCreateMailButton().click();
        waitForElementIsVisible(gmailInboxPage.getLetterToField(), driver);
        gmailInboxPage.getLetterToField().sendKeys(recepient);
        gmailInboxPage.getLetterSubjectField().sendKeys(subject);
        gmailInboxPage.getLetterBodyField().sendKeys(body);
        gmailInboxPage.getLetterAddFileButton().click();
        FilePathRobot.filePathHandling();
        FilePathRobot.actionExecutor();
        waitForElementNotVisible(gmailInboxPage.LETTER_FILE_UPLOAD_PROGRESS_BAR, driver);
        gmailInboxPage.getLetterSendButton().click();
        delay(2500);
        return this;
    }

    public GmailLoginSteps logOut() {
        waitForElementIsVisible(gmailInboxPage.getPopUpMenu(), driver);
        gmailInboxPage.getPopUpMenu().click();
        waitForElementIsVisible(gmailInboxPage.getExitButton(), driver);
        gmailInboxPage.getExitButton().click();
        delay(1000);
        FilePathRobot.actionExecutor();
        return new GmailLoginSteps(driver);
    }

    public GmailThemeSteps goToThemePage() {
        Waiters.waitForElementIsVisible(gmailInboxPage.getCreateMailButton(),driver);
        gmailInboxPage.getSettingsButoon().click();
        gmailInboxPage.getThemeButton().click();
        delay(5000);
        return new GmailThemeSteps(driver);
    }

    public GmailInboxSteps markLetterAsSpam() {
        waitForElementIsVisible(gmailInboxPage.getCreateMailButton(), driver);
        driver.findElement(xpath("//span/b[text()='" + Constants.LETTER_THEME + "']")).click();
        gmailInboxPage.getSendToSpamButton().click();
        return this;
    }

    public GmailInboxSteps goToSpamFolder() {

        waitForElementIsVisible(gmailInboxPage.getMoreButton(), driver);
        gmailInboxPage.getMoreButton().click();
        gmailInboxPage.getSpamFolder().click();
        return this;
    }

    public GmailInboxSteps dragLetterToStarred() {
        waitForElementIsVisible(gmailInboxPage.getCreateMailButton(), driver);
        WebElement element = driver.findElement(xpath("//span/b[text()='" + Constants.LETTER_THEME + "']"));
        (new Actions(driver)).dragAndDrop(element, gmailInboxPage.getStarredButton()).perform();
        delay(500);
        return this;
    }

    public GmailInboxSteps goToStarredFolder() {
        waitForElementIsVisible(gmailInboxPage.getStarredButton(), driver);
        gmailInboxPage.getStarredButton().click();
        return this;
    }

    public boolean verifyLetterPresent() {
        return VerifyHelpers.isElementPresent(By.xpath("//span/b[text()='" + Constants.LETTER_THEME + "']"), driver);
    }


}
