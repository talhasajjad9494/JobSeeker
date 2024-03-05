package WebElementPaths;

public interface SignUpElements {
    String signUpButton = "div >div > div > div > div > span.btn-signup";
    String JBSignUpButton = "body > div:nth-child(4) > div > div > div > div > div:nth-child(1)";
    String emailField = "#email";
    String passwordField = "#password";
    String termsCheckBox = "#terms";
    String closePopUpButton = "body > div:nth-child(4) > div > div > button";
    String popUpSignUpButton = "//button[@type='submit']";
    String emailErrorMessage = "form > div.mb-8 > div:nth-child(2)";
    String passwordErrorMessage = "form > div.mb-8 > div:nth-child(5)";
    String termsCheckBoxErrorMessage = "form > div.font-poppin";
    String loadingIcon = "body > div:nth-child(4) > div > div > div:nth-child(3) > svg";
    String acceptCookie = "div > div.wrapper-cookies.border.card-shadow > div > div > button";
    String profileIcon = "div > div > div > div > div > div > div:nth-child(3) > div > button";
    String logoutButton = "div:nth-child(3) > div > div > div > button:last-child";
}
