package com.epam.kiieu.pages;

import com.epam.kiieu.utils.Constants;
import com.epam.kiieu.utils.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

/**
 * Created by nghia on 28.06.2015.
 */
public class GmailInboxPage extends BasePage {


    public GmailInboxPage(WebDriver driver) {
        super(driver);
    }

    public final String LETTER_TO_FIELD = "//textarea[@aria-label  = 'Кому']";
    public final String LETTER_SUBJECT_FIELD = "//input[@placeholder = 'Тема']";
    public final String LETTER_BODY_FIELD = "//div[@aria-label = 'Тело письма']";
    public final String LETTER_SEND_BUTTON = "//div[text() = 'Отправить']";
    public final String LETTER_ADD_FILE_BUTTON = "//div[@command='Files']//div[@id]";
    public final String LETTER_SENT_MESSAGE = "//div[@class = 'vh']";
    public final By LETTER_FILE_UPLOAD_PROGRESS_BAR = xpath("//div[@role='progressbar']");


    public final String CREATE_MAIL_BUTTON = "(//div[@role='button'])[6]";
    public final String MORE_BUTTON = "//span[@role='button']/span[1]";
    public final String SPAM_FOLDER = "(//div[@id]/div/div[1]/span/a)[8]";
    public final String POPUP_MENU = "(//a[@aria-haspopup='true'])[3]";
    public final String EXIT_BUTTON = "//div[2]/div[3]/div[2]/a";
    public final String SETTINGS_BUTTON = "//div[contains(@role,'button') and (@title='Настройки')]";
    public final String THEME_BUTTON = "//div[@id and @role='menu']//div[9]/div";
    public final String SEND_TO_SPAM = "(//div[2]/div[1]/div/div[2]/div[2]/div/div)[1]";
    public final String STARRED_BUTTON = "(//span/a)[2]";


    @FindBy(xpath = LETTER_SENT_MESSAGE)
    private WebElement messageSentPopUp;

    @FindBy(xpath = STARRED_BUTTON)
    private WebElement starredButton;

    @FindBy(xpath = SEND_TO_SPAM)
    private  WebElement sendToSpamButton;

    @FindBy (xpath = SETTINGS_BUTTON)
    private WebElement settingsButoon;

    @FindBy (xpath = THEME_BUTTON)
    private WebElement themeButton;

    @FindBy(xpath = LETTER_TO_FIELD)
    private WebElement letterToField;

    @FindBy(xpath = LETTER_SUBJECT_FIELD)
    private WebElement letterSubjectField;

    @FindBy(xpath = LETTER_BODY_FIELD)
    private WebElement letterBodyField;

    @FindBy(xpath = LETTER_SEND_BUTTON)
    private WebElement letterSendButton;

    @FindBy(xpath = LETTER_ADD_FILE_BUTTON)
    private WebElement letterAddFileButton;


    @FindBy(xpath = CREATE_MAIL_BUTTON)
    private WebElement createMailButton;

    @FindBy(xpath = MORE_BUTTON)
    private WebElement moreButton;

    @FindBy(xpath = SPAM_FOLDER)
    private WebElement spamFolder;

    @FindBy(xpath = POPUP_MENU)
    private WebElement popUpMenu;

    @FindBy(xpath = EXIT_BUTTON)
    private WebElement exitButton;

    public WebElement getMessageSentPopUp() {
        return messageSentPopUp;
    }

    public WebElement getStarredButton() {
        return starredButton;
    }

    public WebElement getSendToSpamButton() {
        return sendToSpamButton;
    }

    public WebElement getThemeButton() {
        return themeButton;
    }

    public WebElement getSettingsButoon() {
        return settingsButoon;
    }

    public WebElement getLetterToField() {
        return letterToField;
    }

    public WebElement getLetterSubjectField() {
        return letterSubjectField;
    }

    public WebElement getLetterBodyField() {
        return letterBodyField;
    }

    public WebElement getLetterSendButton() {
        return letterSendButton;
    }

    public WebElement getLetterAddFileButton() {
        return letterAddFileButton;
    }

    public WebElement getCreateMailButton() {
        return createMailButton;
    }

    public WebElement getMoreButton() {
        return moreButton;
    }

    public WebElement getSpamFolder() {
        return spamFolder;
    }

    public WebElement getPopUpMenu() {
        return popUpMenu;
    }

    public WebElement getExitButton() {
        return exitButton;
    }
    public By findLetterInSpamFolder() {
        return xpath("//span[text()='" + Constants.LETTER_THEME + "']");
    }


}
