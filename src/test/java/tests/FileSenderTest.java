package tests;

import base.BaseTest;
import com.epam.kiieu.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 29.06.2015.
 */
public class FileSenderTest extends BaseTest {

    @Test
    public void fileSenderTest() {

        gmailLoginSteps.logIn(USER1_LOGIN, USER1_PASS).createLetterWithFile(USER2_LOGIN,LETTER_THEME,LETTER_BODY).logOut()
                .switchAndAddNewUser().logIn(USER2_LOGIN,USER2_PASS);
        Assert.assertTrue(driver.getPageSource().contains(Constants.FILE_NAME), "page dont contain file name");


    }
}
