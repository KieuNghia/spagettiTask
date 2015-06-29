package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;

/**
 * Created by nghia on 28.06.2015.
 */
public class SpamTest extends BaseTest {

    @Test
    public void checkSpamTest() {

        gmailLoginSteps.logIn(USER1_LOGIN, USER1_PASS).createLetter(USER2_LOGIN, LETTER_THEME, LETTER_BODY).logOut()
                .switchAndAddNewUser().logIn(USER2_LOGIN, USER2_PASS).markLetterAsSpam().logOut().addUser().logIn(USER1_LOGIN, USER1_PASS)
                .createLetter(USER2_LOGIN, LETTER_THEME, LETTER_BODY).logOut().addUser().logIn(USER2_LOGIN, USER2_PASS).goToSpamFolder()
        .verifyLetterPresent();

    }
}
