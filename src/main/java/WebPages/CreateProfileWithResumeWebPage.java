package WebPages;

import Helpers.Helper;
import Helpers.Waits;
import WebElementPaths.CreateProfileElements;
import WebElementPaths.CreateProfileWithResumeElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProfileWithResumeWebPage extends Helper {
    public CreateProfileWithResumeWebPage (WebDriver localDriver) {
        driver = localDriver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = CreateProfileWithResumeElements.addResumeButton)
    WebElement addResumeButton;
    @FindBy(css = CreateProfileWithResumeElements.uploadButton)
    WebElement uploadButton;
    @FindBy(xpath = CreateProfileWithResumeElements.saveResumeButton)
    WebElement saveResumeButton;
    @FindBy(xpath = CreateProfileWithResumeElements.popUpYesButton)
    WebElement popUpYesButton;
    @FindBy(css = CreateProfileWithResumeElements.toastMessage)
    WebElement toastMessage;
    @FindBy(css = CreateProfileWithResumeElements.downloadButton)
    WebElement downloadButton;
    public void createProfileWithResume() throws InterruptedException {
        CreateProfileWebPage.introVideo();
        Waits.clickButton(driver, addResumeButton, 30);
        String userName = System.getProperty("user.name");
        String cvPath = "/Users/" + userName + "/IdeaProjects/JobSeeker/Attachments/CV-Test.pdf";
        uploadButton.sendKeys(cvPath);
        Waits.clickButton(driver, saveResumeButton, 30);
        Waits.clickButton(driver, popUpYesButton, 30);
        Waits.waitForElementUntilVisibility(driver, downloadButton, 30);
        Waits.waitForElementUntilVisibility(driver, toastMessage, 30);
        System.out.println("Toast Message is: "+toastMessage.getText());
        CreateProfileWebPage.fillPersonalSummary();
        CreateProfileWebPage.licenseFilling();
        CreateProfileWebPage.fillAimingDetails();
    }
}
