package WebTestCase;

import BaseTest.BaseTest;
import Helpers.Helper;
import WebPages.JobApplyWebPage;
import WebPages.LogInWebPage;
import org.testng.annotations.Test;

public class ApplyJobTestCases extends BaseTest {
    LogInWebPage logInWebPage;
    JobApplyWebPage jobApplyWebPage;
    void initObj() {
        logInWebPage = new LogInWebPage(Helper.driver);
        jobApplyWebPage = new JobApplyWebPage(Helper.driver);
    }
    @Test(priority = 1)
    void connectDb() {
        initObj();
        jobApplyWebPage.connectDB();
    }
    @Test(priority = 2)
    void verifyApplyForJob() {
        LogInWebPage.login(JobApplyWebPage.email, "123123123");
        jobApplyWebPage.applyForJob();
    }
}
