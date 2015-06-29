package tests;


import base.BaseTest;
import com.epam.kiieu.utils.waiters.Waiters;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.kiieu.utils.Constants.*;


public class DragAndDropTest extends BaseTest {

    @Test
    public void checkDragAndDropTest(){

        gmailLoginSteps.logIn(USER1_LOGIN, USER1_PASS).createLetter(USER2_LOGIN, LETTER_THEME, LETTER_BODY )
                .logOut().switchAndAddNewUser().logIn(USER2_LOGIN,USER2_PASS).dragLetterToStarred().goToStarredFolder()
                .verifyLetterPresent();

    }

}
