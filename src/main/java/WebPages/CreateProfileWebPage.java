package WebPages;

import Helpers.Helper;
import Helpers.Waits;
import WebElementPaths.CreateProfileElements;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateProfileWebPage extends Helper {
    public CreateProfileWebPage(WebDriver localDriver) {
        driver = localDriver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = CreateProfileElements.profileIcon)
    static WebElement profileIcon;
    @FindBy(xpath = CreateProfileElements.profileButton)
    static WebElement profileButton;
    @FindBy(css = CreateProfileElements.progressBar)
    static WebElement progressBar;
    @FindBy(css = CreateProfileElements.personalDetailEditButton)
    static WebElement personalDetailEditButton;
    @FindBy(css = CreateProfileElements.firstNameField)
    static WebElement firstNameField;
    @FindBy(css = CreateProfileElements.lastNameField)
    static WebElement lastNameField;
    @FindBy(css = CreateProfileElements.uploadButton)
    WebElement uploadButton;
    @FindBy(css = CreateProfileElements.uploadPicField)
    static WebElement uploadPicField;
    @FindBy(css = CreateProfileElements.livesInField)
    static WebElement livesInField;
    @FindBy(xpath = CreateProfileElements.suburbUL)
    static WebElement suburbUL;
    @FindBy(xpath = CreateProfileElements.pleaseWaitSpan)
    static WebElement pleaseWaitSpan;
    @FindBy(css = CreateProfileElements.phoneNumberField)
    static WebElement phoneNumberField;
    @FindBy(css = CreateProfileElements.saveButton)
    static WebElement saveButton;
    @FindBy(css = CreateProfileElements.introVideoAddButton)
    static WebElement introVideoAddButton;
    @FindBy(css = CreateProfileElements.videoUpload)
    static WebElement videoUpload;
    @FindBy(css = CreateProfileElements.saveVideo)
    static WebElement saveVideo;
    @FindBy(css = CreateProfileElements.videoPlayer)
    static WebElement videoPlayer;
    @FindBy(css = CreateProfileElements.addSummaryButton)
    static WebElement addSummaryButton;
    @FindBy(css = CreateProfileElements.summaryTextArea)
    static WebElement summaryTextArea;
    @FindBy(xpath = CreateProfileElements.saveSummaryButton)
    static WebElement saveSummaryButton;
    @FindBy(css = CreateProfileElements.addRoleButton)
    WebElement addRoleButton;
    @FindBy(css = CreateProfileElements.jobTitleField)
    WebElement jobTitleField;
    @FindBy(css = CreateProfileElements.companyNameField)
    WebElement companyNameField;
    @FindBy(css = CreateProfileElements.addRoleStartDateButton)
    WebElement addRoleStartDateButton;
    @FindBy(css = CreateProfileElements.roleStartDateMonth)
    WebElement roleStartDateMonth;
    @FindBy(css = CreateProfileElements.roleStartDateYear)
    WebElement roleStartDateYear;
    @FindBy(css = CreateProfileElements.clickRoleStartDate)
    WebElement clickRoleStartDate;
    @FindBy(css = CreateProfileElements.addRoleEndDateButton)
    WebElement addRoleEndDateButton;
    @FindBy(css = CreateProfileElements.roleEndDateMonth)
    WebElement roleEndDateMonth;
    @FindBy(css = CreateProfileElements.roleEndDateYear)
    WebElement roleEndDateYear;
    @FindBy(css = CreateProfileElements.clickRoleEndDate)
    WebElement clickRoleEndDate;
    @FindBy(css = CreateProfileElements.jobDescriptionTextArea)
    WebElement jobDescriptionTextArea;
    @FindBy(xpath = CreateProfileElements.saveRoleButton)
    WebElement saveRoleButton;
    @FindBy(css = CreateProfileElements.addEducationButton)
    WebElement addEducationButton;
    @FindBy(css = CreateProfileElements.instituteField)
    WebElement instituteField;
    @FindBy(css = CreateProfileElements.courseField)
    WebElement courseField;
    @FindBy(css = CreateProfileElements.completeCheckbox)
    WebElement completeCheckbox;
    @FindBy(css = CreateProfileElements.finishedEducationButton)
    WebElement finishedEducationButton;
    @FindBy(css = CreateProfileElements.finishedEducationYear)
    WebElement finishedEducationYear;
    @FindBy(css = CreateProfileElements.courseDescription)
    WebElement courseDescription;
    @FindBy(xpath = CreateProfileElements.saveCourseButton)
    WebElement saveCourseButton;
    @FindBy(css = CreateProfileElements.addLicenseButton)
    static WebElement addLicenseButton;
    @FindBy(css = CreateProfileElements.licenseNameField)
    static WebElement licenseNameField;
    @FindBy(css = CreateProfileElements.organizationField)
    static WebElement organizationField;
    @FindBy(css = CreateProfileElements.licenseIssueDateButton)
    static WebElement licenseIssueDateButton;
    @FindBy(css = CreateProfileElements.issueLicenseMonth)
    static WebElement issueLicenseMonth;
    @FindBy(css = CreateProfileElements.issueLicenseYear)
    static WebElement issueLicenseYear;
    @FindBy(css = CreateProfileElements.clickIssueStartDate)
    static WebElement clickIssueStartDate;
    @FindBy(css = CreateProfileElements.licenseExpiryDateButton)
    static WebElement licenseExpiryDateButton;
    @FindBy(css = CreateProfileElements.expiryLicenseMonth)
    static WebElement expiryLicenseMonth;
    @FindBy(css = CreateProfileElements.expiryLicenseYear)
    static WebElement expiryLicenseYear;
    @FindBy(css = CreateProfileElements.clickExpiryEndDate)
    static WebElement clickExpiryEndDate;
    @FindBy(css = CreateProfileElements.licenseDescriptionField)
    static WebElement licenseDescriptionField;
    @FindBy(xpath = CreateProfileElements.saveLicenseButton)
    static WebElement saveLicenseButton;
    @FindBy(css = CreateProfileElements.addSkillsButton)
    WebElement addSkillsButton;
    @FindBy(css = CreateProfileElements.clickNewSkill)
    WebElement clickNewSkill;
    @FindBy(xpath = CreateProfileElements.listOfSkills)
    WebElement listOfSkills;
    @FindBy(xpath = CreateProfileElements.saveSkillsButton)
    WebElement saveSkillsButton;
    @FindBy(css = CreateProfileElements.addLanguageButton)
    static WebElement addLanguageButton;
    @FindBy(css = CreateProfileElements.clickAddLanguage)
    static WebElement clickAddLanguage;
    @FindBy(xpath = CreateProfileElements.listOfLanguages)
    static WebElement listOfLanguages;
    @FindBy(xpath = CreateProfileElements.saveLanguageButton)
    static WebElement saveLanguageButton;
    @FindBy(css = CreateProfileElements.editButtonAvailability)
    static WebElement editButtonAvailability;
    @FindBy(xpath = CreateProfileElements.selectWeekForAvailabilityElements)
    static WebElement selectWeekForAvailabilityElements;
    @FindBy(css = CreateProfileElements.saveButtonAiming)
    static WebElement saveButtonAiming;
    @FindBy(css = CreateProfileElements.waitForSection)
    static WebElement waitForSection;
    @FindBy(css = CreateProfileElements.editButtonWorkType)
    static WebElement editButtonWorkType;
    @FindBy(xpath = CreateProfileElements.selectPreferredWorkTypeElements)
    static WebElement selectPreferredWorkTypeElements;
    @FindBy(css = CreateProfileElements.editButtonSalary)
    static WebElement editButtonSalary;
    @FindBy(xpath = CreateProfileElements.amountField)
    static WebElement amountField;
    @FindBy(css = CreateProfileElements.clickSalaryType)
    static WebElement clickSalaryType;
    @FindBy(css = CreateProfileElements.salaryTypeList)
    static WebElement salaryTypeList;
    @FindBy(css = CreateProfileElements.editButtonWorkInAus)
    static WebElement editButtonWorkInAus;
    @FindBy(css = CreateProfileElements.clickWorkInAus)
    static WebElement clickWorkInAus;
    @FindBy(css = CreateProfileElements.workInAusList)
    static WebElement workInAusList;
    @FindBy(css = CreateProfileElements.clickSaveButton)
    static WebElement clickSaveButton;
    @FindBy(css = CreateProfileElements.editButtonLocated)
    static WebElement editButtonLocated;
    @FindBy(css = CreateProfileElements.clickCurrentCountry)
    static WebElement clickCurrentCountry;
    @FindBy(css = CreateProfileElements.currentCountryList)
    static WebElement currentCountryList;
    @FindBy(css = CreateProfileElements.editButtonWorkLocation)
    static WebElement editButtonWorkLocation;
    @FindBy(css = CreateProfileElements.workLocationField)
    static WebElement workLocationField;
    @FindBy(css = CreateProfileElements.workLocationUL)
    static WebElement workLocationUL;
    @FindBy(xpath = CreateProfileElements.pleaseWaitSpanWork)
    static WebElement pleaseWaitSpanWork;
    @FindBy(css = CreateProfileElements.editButtonPassport)
    static WebElement editButtonPassport;
    @FindBy(css = CreateProfileElements.clickPassportCountry)
    static WebElement clickPassportCountry;
    @FindBy(css = CreateProfileElements.passportCountryList)
    static WebElement passportCountryList;
    @FindBy(css = CreateProfileElements.editButtonWorkRight)
    static WebElement editButtonWorkRight;
    @FindBy(css = CreateProfileElements.clickWorkRightCountry)
    static WebElement clickWorkRightCountry;
    @FindBy(css = CreateProfileElements.workRightCountryList)
    static WebElement workRightCountryList;


    public void createProfile() throws Exception {
        fillPersonalDetails();
        introVideo();
        fillPersonalSummary();
        Waits.clickButton(driver, addRoleButton, 30);
        String fakeCompanyName = fakerObj.company().name();
        Waits.sendKeys(driver, companyNameField, fakeCompanyName, 30);
        Waits.waitForElementUntilVisibility(driver, jobTitleField, 30);
        String fakeJobTitle = fakerObj.job().title();
        Waits.sendKeys(driver, jobTitleField, fakeJobTitle, 30);
        loopRepeaterForText(driver, jobDescriptionTextArea, 30, 2);
        Waits.clickButton(driver, addRoleStartDateButton, 30);
        selectMonthOrYear(roleStartDateMonth);
        selectMonthOrYear(roleStartDateYear);
        Waits.clickButton(driver, clickRoleStartDate, 30);
        Waits.clickButton(driver, addRoleEndDateButton, 30);
        selectMonthOrYear(roleEndDateMonth);
        selectMonthOrYear(roleEndDateYear);
        Waits.clickButton(driver, clickRoleEndDate, 30);
        Waits.clickButton(driver, saveRoleButton, 30);
        Waits.clickButton(driver, addEducationButton, 30);
        String fakeInstitute = fakerObj.company().industry();
        Waits.sendKeys(driver, instituteField, fakeInstitute, 30);
        String fakeCourse = fakerObj.educator().course();
        Waits.sendKeys(driver, courseField, fakeCourse, 30);
        Waits.clickButton(driver, completeCheckbox, 30);
        Waits.clickButton(driver, finishedEducationButton, 30);
        Waits.waitForElementUntilVisibility(driver, finishedEducationYear, 30);
        List<WebElement> finishedYearList = finishedEducationYear.findElements(By.tagName("div"));
        finishedYearList.get(2).click();
        loopRepeaterForText(driver, courseDescription, 30, 2);
        Waits.clickButton(driver, saveCourseButton, 30);
        licenseFilling();
        Waits.clickButton(driver, addSkillsButton, 30);
        for (int i = 0; i < 2; i++) {
            Waits.clickButton(driver, clickNewSkill, 30);
            selectMultipleSkills(listOfSkills, CreateProfileElements.listOfSkills);
        }
        Waits.clickButton(driver, saveSkillsButton, 30);
        Waits.clickButton(driver, addLanguageButton, 30);
        for (int i = 0; i < 2; i++) {
            Waits.clickButton(driver, clickAddLanguage, 30);
            selectMultipleSkills(listOfLanguages, CreateProfileElements.listOfLanguages);
        }
        Waits.clickButton(driver, saveLanguageButton, 30);
        fillAimingDetails();
    }

    public static void fillPersonalDetails() throws InterruptedException {
        Waits.clickButton(driver, profileIcon, 30);
        Waits.clickButton(driver, profileButton, 30);
        Waits.waitForElementUntilInvisibility(driver, progressBar);
        Waits.clickButton(driver, personalDetailEditButton, 30);
        clearField(driver, firstNameField, 30);
        String fakeFirstName = localeFakerObj.name().firstName();
        Waits.sendKeys(driver, firstNameField, fakeFirstName, 30);
        String fakeLastName = localeFakerObj.name().lastName();
        clearField(driver, lastNameField, 30);
        Waits.sendKeys(driver, lastNameField, fakeLastName, 30);
        String userName = System.getProperty("user.name");
        String ppPath = "/Users/" + userName + "/IdeaProjects/JobSeeker/Attachments/PP.jpeg";
        uploadPicField.sendKeys(ppPath);
        clearField(driver, livesInField, 30);
        Waits.sendKeys(driver, livesInField, "new", 30);
        Waits.waitForElementUntilVisibility(driver, suburbUL, 30);
        Waits.waitForElementUntilInvisibility(driver, pleaseWaitSpan);
        selectRandomIndexOnBaseOfTagName(suburbUL, "li");
        removeDigits(10, 2, phoneNumberField, Keys.BACK_SPACE);
        String fakePhoneNumber = localeFakerObj.phoneNumber().cellPhone();
        Waits.sendKeys(driver, phoneNumberField, fakePhoneNumber, 30);
        Waits.clickButton(driver, saveButton, 30);
    }
    public static void introVideo() throws InterruptedException {
        System.out.println("In Intro Video Function");
        Waits.clickButton(driver, introVideoAddButton, 30);
        String userName = System.getProperty("user.name");
        String videoPath = "/Users/" + userName + "/IdeaProjects/JobSeeker/Attachments/introVideo.mp4";
        pause(1, 750);
        videoUpload.sendKeys(videoPath);
        Waits.waitForElementUntilVisibility(driver, videoPlayer, 60);
        pause(1, 2500);
        Waits.clickButton(driver, saveVideo, 30);
        pause(1, 5000);
    }
    public static void fillPersonalSummary() {
        javaScriptExecutor(driver, moveToElementScript, addSummaryButton);
        Waits.clickButton(driver, addSummaryButton, 30);
        loopRepeaterForText(driver, summaryTextArea, 30, 2);
        Waits.clickButton(driver, saveSummaryButton, 30);
    }
    public static void licenseFilling() {
        Waits.clickButton(driver, addLicenseButton, 30);
        String fakeLicenseName = fakerObj.educator().course();
        Waits.sendKeys(driver, licenseNameField, fakeLicenseName, 30);
        String fakeOrganisation = fakerObj.educator().university();
        Waits.sendKeys(driver, organizationField, fakeOrganisation, 30);
        Waits.clickButton(driver, licenseIssueDateButton, 30);
        selectMonthOrYear(issueLicenseMonth);
        selectMonthOrYear(issueLicenseYear);
        Waits.clickButton(driver, clickIssueStartDate, 30);
        Waits.clickButton(driver, licenseExpiryDateButton, 30);
        selectMonthOrYear(expiryLicenseMonth);
        selectMonthOrYear(expiryLicenseYear);
        Waits.clickButton(driver, clickExpiryEndDate, 30);
        loopRepeaterForText(driver, licenseDescriptionField, 30, 2);
        Waits.clickButton(driver, saveLicenseButton, 30);
    }
    public static void fillAimingDetails() throws InterruptedException {
        Waits.clickButton(driver, addLanguageButton, 30);
        for (int i = 0; i < 2; i++) {
            Waits.clickButton(driver, clickAddLanguage, 30);
            selectMultipleSkills(listOfLanguages, CreateProfileElements.listOfLanguages);
        }
        Waits.clickButton(driver, saveLanguageButton, 30);
        Waits.clickButton(driver, editButtonAvailability, 30);
        selectRandomIndexOnBaseOfTagName(selectWeekForAvailabilityElements, "div");
        Waits.clickButton(driver, saveButtonAiming, 30);
        Waits.waitForElementUntilInvisibility(driver, waitForSection);
        Waits.clickButton(driver, editButtonWorkType, 30);
        Waits.waitForElementUntilVisibility(driver, selectPreferredWorkTypeElements, 30);
        selectRandomIndexOnBaseOfTagName(selectPreferredWorkTypeElements, "input");
        Waits.clickButton(driver, saveButtonAiming, 30);
        Waits.waitForElementUntilInvisibility(driver, waitForSection);
        Waits.clickButton(driver, editButtonSalary, 30);
        String fakeAmount = fakerObj.number().digits(7);
        Waits.sendKeys(driver, amountField, fakeAmount, 30);
        Waits.clickButton(driver, clickSalaryType, 30);
        selectRandomListElement(salaryTypeList, CreateProfileElements.salaryTypeList);
        Waits.clickButton(driver, saveButtonAiming, 30);
        Waits.waitForElementUntilInvisibility(driver, waitForSection);;
        Waits.clickButton(driver, editButtonWorkInAus, 30);
        Waits.clickButton(driver, clickWorkInAus, 30);
        selectRandomIndexOnBaseOfTagName(workInAusList, "div");
        Waits.clickButton(driver, clickSaveButton, 30);
        Waits.waitForElementUntilInvisibility(driver, clickWorkInAus);
        Waits.clickButton(driver, editButtonLocated, 30);
        Waits.clickButton(driver, clickCurrentCountry, 30);
        selectRandomIndexOnBaseOfTagName(currentCountryList, "div");
        Waits.clickButton(driver, clickSaveButton, 30);
        Waits.waitForElementUntilInvisibility(driver, clickCurrentCountry);
        Waits.clickButton(driver, editButtonWorkLocation, 30);
        clearField(driver, workLocationField, 30);
        Waits.sendKeys(driver, workLocationField, "new", 30);
        Waits.waitForElementUntilVisibility(driver, workLocationUL, 30);
        Waits.waitForElementUntilInvisibility(driver, pleaseWaitSpanWork);
        pause(2, 300);
        selectRandomIndexOnBaseOfTagName(workLocationUL, "li");
        Waits.clickButton(driver, clickSaveButton, 30);
        Waits.waitForElementUntilInvisibility(driver, workLocationField);
        Waits.clickButton(driver, editButtonPassport, 30);
        Waits.clickButton(driver, clickPassportCountry, 30);
        selectRandomIndexOnBaseOfTagName(passportCountryList, "div");
        Waits.clickButton(driver, clickSaveButton, 30);
        Waits.waitForElementUntilInvisibility(driver, clickPassportCountry);
        Waits.clickButton(driver, editButtonWorkRight, 30);
        Waits.clickButton(driver, clickWorkRightCountry, 30);
        selectRandomIndexOnBaseOfTagName(workRightCountryList, "div");
        Waits.clickButton(driver, clickSaveButton, 30);
    }
}
