package tests;


import base.BaseTest;
import com.epam.kiieu.utils.waiters.Waiters;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 29.06.2015.
 */
public class DragAndDropTest extends BaseTest {

    @Test
    public void checkDragAndDropTest(){

        gmailLoginSteps.logIn(USER1_LOGIN, USER1_PASS).createLetter(USER2_LOGIN, LETTER_THEME, LETTER_BODY ).logOut().switchAndAddNewUser().logIn(USER2_LOGIN,USER2_PASS).dragLetterToStarred().goToStarredFolder();
        Waiters.delay(2000);
        Assert.assertTrue(gmailInboxSteps.verifyLetterPresent(), "there arent message in starred folder");


    }

}
