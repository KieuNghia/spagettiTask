package com.epam.kiieu.pages;

import com.epam.kiieu.utils.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class GmailThemePage extends BasePage {

    public GmailThemePage(WebDriver driver) {
        super(driver);
    }

    public final String DARK_THEME = "//div/img[@src = '//ssl.gstatic.com/ui/v1/icons/mail/themes/basicblack/preview.png']";
    public final String LIGHT_THEME = "//div/img[@src = '//ssl.gstatic.com/ui/v1/icons/mail/themes/softgray/preview.png']";
    public final String THEME_CHANGED_POPUP = "//div[@role='alert']/div/div[2]";

    @FindBy(xpath = DARK_THEME)
    private WebElement darkTheme;

    @FindBy(xpath = LIGHT_THEME)
    private WebElement lightTheme;

    @FindBy(xpath = THEME_CHANGED_POPUP)
    private WebElement themeChangedPopup;


    public WebElement getDarkTheme() {
        return darkTheme;
    }

    public WebElement getLightTheme() {
        return lightTheme;
    }

    public WebElement getThemeChangedPopup() {
        return themeChangedPopup;
    }
}
