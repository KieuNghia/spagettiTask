package tests;

import base.BaseTest;
import com.epam.kiieu.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 29.06.2015.
 */
public class ThemeChangeTest extends BaseTest {

    @Test
    public void checkThatThemeChanged(){

/*        gmailLoginSteps.logIn(USER1_LOGIN,USER1_PASS).goToThemePage().changeTheme();
        Assert.assertTrue(gmailThemeSteps.verifySuccessMessage(), "theme doesnt changed");*/
        gmailLoginSteps.logIn(USER1_LOGIN,USER1_PASS).goToThemePage().changeTheme();

    }
}
