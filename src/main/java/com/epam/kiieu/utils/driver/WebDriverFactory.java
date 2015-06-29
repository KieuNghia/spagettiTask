package com.epam.kiieu.utils.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    private WebDriver driver;

    public WebDriver getDriver(String parameter) {
        switch (parameter) {
            case "firefox":
                driver = new FirefoxDriver();
                return driver;
            case "ie":
                System.setProperty("webdriver.ie.driver", "libdrivers\\IEDriverServer32.exe");
                driver = new InternetExplorerDriver();
                return driver;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "libdrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                return driver;
            case "opera":
                System.setProperty("webdriver.chrome.driver", "libdrivers\\operadriver64.exe");
                driver = new OperaDriver();
                return driver;
            default:
                throw new IllegalArgumentException("This browser is undefined!");
        }
    }
}