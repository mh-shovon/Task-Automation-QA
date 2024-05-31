package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Objects;

public class PlaceOrder {
    @FindBy(className = "btn")
    List<WebElement> addToCartBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement navigateToCartPageBtn;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutBtn;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueBtn;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishBtn;

    public PlaceOrder (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public  void placeOrder() throws InterruptedException {
        addToCartBtn.get(0).click();
        addToCartBtn.get(1).click();
        navigateToCartPageBtn.click();
        checkoutBtn.click();
        firstName.sendKeys("Mehedi");
        lastName.sendKeys("Hasan");
        postalCode.sendKeys("1216");
        continueBtn.click();
        finishBtn.click();
    }
}
