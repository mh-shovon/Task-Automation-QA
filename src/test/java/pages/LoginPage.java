package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement userPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String name, String password){
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
    }
}
