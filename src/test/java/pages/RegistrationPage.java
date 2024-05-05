package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegistrationPage {
    @FindBy(className = "ico-register")
    WebElement registerButton;

    @FindBy(id = "gender-male")
    WebElement genderMaleRadioButton;

    @FindBy(id = "gender-female")
    WebElement genderFemaleRadioButton;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dobDate;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dobMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dobYear;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Company")
    WebElement companyField;

    @FindBy(id = "NewsLetter")
    WebElement newsLetterRadioButton;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    WebElement registrationSubmitButton;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doRegistration(String firstName, String lastName, String date, String month, String year, String email, String company, String password, String confirmPassword) throws InterruptedException {
        registerButton.click();
        Thread.sleep(200);
        genderMaleRadioButton.click();
        Thread.sleep(200);
        firstNameField.sendKeys(firstName);
        Thread.sleep(200);
        lastNameField.sendKeys(lastName);
        Thread.sleep(200);
        dobDate.sendKeys(date);
        Thread.sleep(200);
        dobMonth.sendKeys(month);
        Thread.sleep(200);
        dobYear.sendKeys(year);
        Thread.sleep(200);
        emailField.sendKeys(email);
        Thread.sleep(200);
        companyField.sendKeys(company);
        Thread.sleep(200);
//        newsLetterRadioButton.click();
//        Thread.sleep(200);
        passwordField.sendKeys(password);
        Thread.sleep(200);
        confirmPasswordField.sendKeys(confirmPassword);
        Thread.sleep(200);
        registrationSubmitButton.click();
    }
}
