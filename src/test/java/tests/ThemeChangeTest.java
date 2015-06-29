package tests;

import base.BaseTest;

import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;

public class ThemeChangeTest extends BaseTest {

    @Test
    public void checkThatThemeChanged(){

        gmailLoginSteps.logIn(USER1_LOGIN,USER1_PASS).goToThemePage().changeTheme().verifySuccessMessage();

    }
}
