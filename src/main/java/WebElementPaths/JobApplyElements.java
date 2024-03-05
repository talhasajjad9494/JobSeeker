package WebElementPaths;

public interface JobApplyElements {
    String jobTitleField = "div> header > div > div > div > form > section > div:nth-child(1) > div > input";
    String searchButton = "div > header > div > div > div > form > section > section > div > button:nth-child(2)";
    String applyButton = "#detail-card-wrapper-id > section > section:nth-child(7) > div > section > div > button:nth-child(1)";
    String cvOptions = "div> section > main > section > div:nth-child(1) > div:nth-child(2) > div > div > div > select";
    String continueButton = "//button[contains(text(), 'Continue')]";
}
