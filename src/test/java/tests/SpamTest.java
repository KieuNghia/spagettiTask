package tests;

import com.epam.kiieu.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;

/**
 * Created by nghia on 28.06.2015.
 */
public class SpamTest extends BaseTest {

    @Test
    public void Login1User(){

        gmailLoginSteps.logIn(USER1_LOGIN, USER1_PASS).createLetter(USER2_LOGIN, LETTER_THEME, LETTER_BODY)
                .logOut();

    }

    @Test(dependsOnMethods = "Login1User")
    public void Login2User(){
        gmailLoginSteps.logIn(USER2_LOGIN,USER2_PASS).markLetterAsSpam().logOut().logIn(USER1_LOGIN, USER1_PASS)
                .createLetter(USER2_LOGIN, LETTER_THEME,LETTER_BODY).logOut().logIn(USER2_LOGIN, USER2_PASS)
                .goToSpamFolder();
        Assert.assertTrue(gmailInboxSteps.verifyLetterPresent());
    }
}
