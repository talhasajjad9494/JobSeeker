package WebPages;

import Helpers.Helper;
import Helpers.Utility;
import Helpers.Waits;
import WebElementPaths.LogInElements;
import WebElementPaths.SignUpElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInWebPage extends Helper {
    public LogInWebPage(WebDriver localDriver) {
        driver = localDriver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = LogInElements.landingLoginButton)
    static WebElement landingLoginButton;
    @FindBy(css = LogInElements.JBLogInButton)
    static WebElement JBLogInButton;
    @FindBy(css = LogInElements.emailField)
    static WebElement emailField;
    @FindBy(css = LogInElements.passwordField)
    static WebElement passwordField;
    @FindBy(css = LogInElements.continueButton)
    static WebElement continueButton;
    @FindBy(css = LogInElements.loadingIcon)
    static WebElement loadingIcon;
    @FindBy(css = SignUpElements.acceptCookie)
    static WebElement acceptCookie;
    public static void login(String email, String password) {
        Waits.clickButton(driver, landingLoginButton, 30);
        Waits.clickButton(driver, JBLogInButton, 30);
        Waits.sendKeys(driver, emailField, email, 30);
        Waits.sendKeys(driver, passwordField, password, 30);
        Waits.clickButton(driver, continueButton, 30);
        Waits.waitForElementUntilInvisibility(driver, loadingIcon);
        Waits.clickButton(driver, acceptCookie, 30);
    }
}
