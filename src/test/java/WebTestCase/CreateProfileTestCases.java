package WebTestCase;

import BaseTest.BaseTest;
import Helpers.Helper;
import Helpers.Utility;
import WebPages.LogInWebPage;
import WebPages.CreateProfileWebPage;
import WebPages.SignUpWebPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateProfileTestCases extends BaseTest {
    CreateProfileWebPage createProfileWebPage;
    SignUpWebPage signUpWebPage;
    public void initObj() throws IOException {
        createProfileWebPage = new CreateProfileWebPage(Helper.driver);
        signUpWebPage = new SignUpWebPage(Helper.driver);
    }

    @Test(priority = 1)
    void createProfileTestCase() throws Exception {
        initObj();
        SignUpWebPage.signUpForCreateProfile();
        createProfileWebPage.createProfile();
    }
}
