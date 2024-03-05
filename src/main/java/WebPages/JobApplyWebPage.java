package WebPages;

import Helpers.Helper;
import Helpers.Waits;
import WebElementPaths.JobApplyElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JobApplyWebPage extends Helper {
    public JobApplyWebPage(WebDriver localDriver) {
        driver = localDriver;
        PageFactory.initElements(driver, this);
    }

    public String fakeJobTitle;
    public static String email;
    @FindBy(css = JobApplyElements.jobTitleField)
    WebElement jobTitleField;
    @FindBy(css = JobApplyElements.searchButton)
    WebElement searchButton;
    @FindBy(css = JobApplyElements.applyButton)
    WebElement applyButton;
    @FindBy(css = JobApplyElements.cvOptions)
    WebElement cvOptions;
    @FindBy(xpath = JobApplyElements.continueButton)
    WebElement continueButton;

    public void connectDB() {
        final String databaseURL = "jdbc:postgresql://wia-stage-db-new.cnimxvtbpoyy.ap-southeast-2.rds.amazonaws.com:5432/app";
        final String userName = "postgres";
        final String password = "6YQLfy2dTLzAGdUf";
        try {
            Connection connection = DriverManager.getConnection(databaseURL, userName, password);
            Statement statement = connection.createStatement();
            String sqlQuery = "Select * From seekers Where id = 9897";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                email = resultSet.getString("email");
                System.out.println("Email fetched from database: " + email);
            }
        } catch (Exception e) {
            System.out.println("Database Connection Error: " + e.getMessage());
        }
    }

    public void applyForJob() {
        fakeJobTitle();
        Waits.sendKeys(driver, jobTitleField, fakeJobTitle, 30);
        Waits.clickButton(driver, searchButton, 30);
        Waits.clickButton(driver, applyButton, 30);
        Waits.waitForElementUntilVisibility(driver, cvOptions, 30);
        selectCV(cvOptions);
        Waits.clickButton(driver, continueButton, 30);
    }

    public void fakeJobTitle() {
        fakeJobTitle = localeFakerObj.job().position();
        if (fakeJobTitle.equalsIgnoreCase("Producer") || fakeJobTitle.equalsIgnoreCase("Executive")
                || fakeJobTitle.equalsIgnoreCase("Liaison") || fakeJobTitle.equalsIgnoreCase("Engineer")
                || fakeJobTitle.equalsIgnoreCase("Architect") || fakeJobTitle.equalsIgnoreCase("Designer")
                || fakeJobTitle.equalsIgnoreCase("Planner") || fakeJobTitle.equalsIgnoreCase("Orchestrator")
                || fakeJobTitle.equalsIgnoreCase("Facilitator") || fakeJobTitle.equalsIgnoreCase("Agent")
                || fakeJobTitle.equalsIgnoreCase("Strategist")) {
            fakeJobTitle();
        }
    }
}
