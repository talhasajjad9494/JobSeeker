package WebTestCase;

import BaseTest.BaseTest;
import Helpers.Helper;
import WebPages.SignUpWebPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTestCases extends BaseTest {
    SignUpWebPage signUpWebPage;

    void initObj() throws IOException {
        signUpWebPage = new SignUpWebPage(Helper.driver);
    }

    @Test(priority = 1)
    void withoutEmailTestCase() throws IOException {
        initObj();
        signUpWebPage.signUpWithoutEmail();
    }

    @Test(priority = 2)
    void withoutPasswordTestCase() throws IOException {
        initObj();
        signUpWebPage.signUpWithoutPassword();
    }

    @Test(priority = 3)
    void withoutTermsCheckTestCase() throws IOException {
        initObj();
        signUpWebPage.signUpWithoutTermsCheckBox();
    }

    @Test(priority = 4)
    void withoutDataTestCase() throws IOException {
        initObj();
        signUpWebPage.withoutData();
    }

    @Test(priority = 5)
    void inValidEmailTestCase() throws IOException {
        initObj();
        signUpWebPage.invalidEmailFormat();
    }

    @Test(priority = 6)
    void signUpSuccessfully() throws IOException {
        initObj();
        signUpWebPage.verifySignUp();
    }
}
