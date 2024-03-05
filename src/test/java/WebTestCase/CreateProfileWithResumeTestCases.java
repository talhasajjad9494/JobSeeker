package WebTestCase;

import BaseTest.BaseTest;
import Helpers.Helper;
import WebPages.CreateProfileWebPage;
import WebPages.CreateProfileWithResumeWebPage;
import WebPages.SignUpWebPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateProfileWithResumeTestCases extends BaseTest {
    CreateProfileWebPage createProfileWebPage;
    SignUpWebPage signUpWebPage;
    CreateProfileWithResumeWebPage createProfileWithResumeWebPage;
    public void initObj() throws IOException {
        signUpWebPage = new SignUpWebPage(Helper.driver);
        createProfileWebPage = new CreateProfileWebPage(Helper.driver);
        createProfileWithResumeWebPage = new CreateProfileWithResumeWebPage(Helper.driver);
    }
    @Test(priority = 1)
    void profileWithResume() throws Exception {
        initObj();
        SignUpWebPage.signUpForCreateProfile();
        CreateProfileWebPage.fillPersonalDetails();
        createProfileWithResumeWebPage.createProfileWithResume();
    }
}
