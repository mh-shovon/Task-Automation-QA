package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhoneMenu;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")
    WebElement nokiaLumia1200;

    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement productEnteredQuantity;

    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement shoppingCart;

    @FindBy(xpath = "//*[@id=\"termsofservice\"]")
    WebElement termsOfServiceCheckbox;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutAsGuestButton;

    @FindBy(id="BillingNewAddress_FirstName")
    WebElement txtFirstName;

    @FindBy(id="BillingNewAddress_LastName")
    WebElement txtLastName;

    @FindBy(id="BillingNewAddress_Email")
    WebElement txtEmail;

    @FindBy(id="BillingNewAddress_Company")
    WebElement txtCompanyName;

    @FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]/option[20]")
    WebElement txtCountryName;

    @FindBy(id="BillingNewAddress_City")
    WebElement txtCityName;

    @FindBy(id="BillingNewAddress_Address1")
    WebElement txtAddress1;

    @FindBy(id="BillingNewAddress_Address2")
    WebElement txtAddress2;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement txtZipCode;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement txtPhoneNumber;

    @FindBy(name="BillingNewAddress.FaxNumber")
    WebElement txtFaxNumber;

    @FindBy(xpath = "//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']")
    WebElement continueButton;

    @FindBy(xpath = "//label[normalize-space()='Next Day Air ($0.00)']")
    WebElement nextDayAirRadioButton;

    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement nextStepContinueButton;

    @FindBy(xpath = "//label[normalize-space()='Credit Card']")
    WebElement creditCardRadioButton;

    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement nextButtonAfterCardSelection;

    @FindBy(xpath = "//*[@id=\"CreditCardType\"]/option[1]")
    WebElement txtCreditCardTypeSelection;

    @FindBy(id="CardholderName")
    WebElement txtCardholderName;

    @FindBy(id="CardNumber")
    WebElement txtCardNumber;

    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement txtExpireMonth;

    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement txtExpireYear;

    @FindBy(id="CardCode")
    WebElement txtCardCode;

    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueForOrder;

    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmOrderButton;

    public PlaceOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void orderPlace() throws InterruptedException {
        cellPhoneMenu.click();
        Thread.sleep(200);
        nokiaLumia1200.click();
        Thread.sleep(200);
        productEnteredQuantity.click();
        Thread.sleep(200);
        productEnteredQuantity.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(200);
        productEnteredQuantity.sendKeys("2");
        Thread.sleep(200);
        addToCartButton.click();
        //Thread.sleep(500);
        shoppingCart.click();
        Thread.sleep(200);
        termsOfServiceCheckbox.click();
        Thread.sleep(200);
        checkoutButton.click();
        Thread.sleep(200);
        checkoutAsGuestButton.click();
        Thread.sleep(200);
        txtFirstName.sendKeys("Mehedi Hasan");
        Thread.sleep(200);
        txtLastName.sendKeys("Shovon");
        Thread.sleep(200);
        txtEmail.sendKeys("shovon33266@gmail.com");
        Thread.sleep(200);
        txtCompanyName.sendKeys("Jatri");
        Thread.sleep(200);
        txtCountryName.click();
        Thread.sleep(200);
        txtCityName.sendKeys("Dhaka");
        Thread.sleep(200);
        txtAddress1.sendKeys("Kochukhet");
        Thread.sleep(200);
        txtAddress2.sendKeys("Dhaka Cantonment");
        Thread.sleep(200);
        txtZipCode.sendKeys("1216");
        Thread.sleep(200);
        txtPhoneNumber.sendKeys("01983285059");
        Thread.sleep(200);
        txtFaxNumber.sendKeys("25456585");
        Thread.sleep(200);
        continueButton.click();
        Thread.sleep(200);
        nextDayAirRadioButton.click();
        Thread.sleep(200);
        nextStepContinueButton.click();
        Thread.sleep(200);
        creditCardRadioButton.click();
        Thread.sleep(200);
        nextButtonAfterCardSelection.click();
        Thread.sleep(200);
        txtCreditCardTypeSelection.click();
        Thread.sleep(200);
        txtCardholderName.sendKeys("Shoovn");
        Thread.sleep(200);
        txtCardNumber.sendKeys("4136360102259733");
        Thread.sleep(200);
        txtExpireMonth.sendKeys("06");
        Thread.sleep(200);
        txtExpireYear.sendKeys("2027");
        Thread.sleep(200);
        txtCardCode.sendKeys("2525");
        Thread.sleep(200);
        continueForOrder.click();
        Thread.sleep(200);
        confirmOrderButton.click();
        Thread.sleep(200);
    }
}
