package WebPages;

import Helpers.Helper;
import Helpers.Utility;
import Helpers.Waits;
import WebElementPaths.CreateProfileElements;
import WebElementPaths.SignUpElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SignUpWebPage extends Helper {
    public SignUpWebPage(WebDriver localDriver) throws IOException {
        driver = localDriver;
        PageFactory.initElements(driver, this);
    }

    String password = Utility.getValue("Credentials", "Password");
    public static String signUpEmail;

    @FindBy(css = SignUpElements.signUpButton)
    static WebElement signUpButton;
    @FindBy(css = SignUpElements.JBSignUpButton)
    static WebElement JBSignUpButton;
    @FindBy(css = SignUpElements.emailField)
    static WebElement emailField;
    @FindBy(css = SignUpElements.passwordField)
    static WebElement passwordField;
    @FindBy(css = SignUpElements.termsCheckBox)
    static WebElement termsCheckBox;
    @FindBy(css = SignUpElements.closePopUpButton)
    WebElement closePopUpButton;
    @FindBy(xpath = SignUpElements.popUpSignUpButton)
    static WebElement popUpSignUpButton;
    @FindBy(css = SignUpElements.emailErrorMessage)
    WebElement emailErrorMessage;
    @FindBy(css = SignUpElements.passwordErrorMessage)
    WebElement passwordErrorMessage;
    @FindBy(css = SignUpElements.termsCheckBoxErrorMessage)
    WebElement termsCheckBoxErrorMessage;
    @FindBy(css = SignUpElements.loadingIcon)
    static WebElement loadingIcon;
    @FindBy(css = SignUpElements.acceptCookie)
    static WebElement acceptCookie;
    @FindBy(css = SignUpElements.profileIcon)
    static WebElement profileIcon;
    @FindBy(css = SignUpElements.logoutButton)
    static WebElement logoutButton;

    public static void signUpButtonFunc() {
        Waits.clickButton(driver, signUpButton, 30);
        Waits.clickButton(driver, JBSignUpButton, 30);
    }

    public void closePopUp() {
        Waits.clickButton(driver, closePopUpButton, 30);
    }

    public void signUpWithoutEmail() {
        signUpButtonFunc();
        Waits.sendKeys(driver, passwordField, "123123123", 30);
        Waits.clickButton(driver, termsCheckBox, 30);
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilVisibility(driver, emailErrorMessage, 30);
        System.out.println("Email error: " + emailErrorMessage.getText());
        closePopUp();
    }

    public void signUpWithoutPassword() {
        signUpButtonFunc();
        String fakeEmail = fakerObj.internet().emailAddress();
        Waits.sendKeys(driver, emailField, fakeEmail, 30);
        Waits.clickButton(driver, termsCheckBox, 30);
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilVisibility(driver, passwordErrorMessage, 30);
        System.out.println("Password error: " + passwordErrorMessage.getText());
        closePopUp();
    }

    public void signUpWithoutTermsCheckBox() {
        signUpButtonFunc();
        String fakeEmail = fakerObj.internet().emailAddress();
        Waits.sendKeys(driver, emailField, fakeEmail, 30);
        Waits.sendKeys(driver, passwordField, password, 30);
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilVisibility(driver, termsCheckBoxErrorMessage, 30);
        System.out.println("Terms error: " + termsCheckBoxErrorMessage.getText());
        closePopUp();
    }

    public void withoutData() {
        signUpButtonFunc();
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilVisibility(driver, emailErrorMessage, 30);
        System.out.println("Email error: " + emailErrorMessage.getText());
        Waits.waitForElementUntilVisibility(driver, passwordErrorMessage, 30);
        System.out.println("Password error: " + passwordErrorMessage.getText());
        Waits.waitForElementUntilVisibility(driver, termsCheckBoxErrorMessage, 30);
        System.out.println("Terms error: " + termsCheckBoxErrorMessage.getText());
        closePopUp();
    }

    public void invalidEmailFormat() {
        signUpButtonFunc();
        Waits.sendKeys(driver, emailField, "invalidEmail", 30);
        Waits.sendKeys(driver, passwordField, password, 30);
        Waits.clickButton(driver, termsCheckBox, 30);
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilVisibility(driver, emailErrorMessage, 30);
        System.out.println("Email Invalid error: " + emailErrorMessage.getText());
        closePopUp();
    }

    public void verifySignUp() throws IOException {
        signUpButtonFunc();
        signUpEmail = fakerObj.internet().emailAddress();
        Waits.sendKeys(driver, emailField, signUpEmail, 30);
        String password = Utility.getValue("Credentials", "Password");
        Waits.sendKeys(driver, passwordField, password, 30);
        Waits.clickButton(driver, termsCheckBox, 30);
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilInvisibility(driver, loadingIcon);
        Waits.clickButton(driver, profileIcon, 30);
        Waits.clickButton(driver, logoutButton, 30);
    }
    public static void signUpForCreateProfile() throws IOException {
        signUpButtonFunc();
        signUpEmail = localeFakerObj.internet().emailAddress();
        Waits.sendKeys(driver, emailField, signUpEmail, 30);
        String password = Utility.getValue("Credentials", "Password");
        Waits.sendKeys(driver, passwordField, password, 30);
        Waits.clickButton(driver, termsCheckBox, 30);
        Waits.clickButton(driver, popUpSignUpButton, 30);
        Waits.waitForElementUntilInvisibility(driver, loadingIcon);
        Waits.clickButton(driver, acceptCookie, 30);
    }
}
