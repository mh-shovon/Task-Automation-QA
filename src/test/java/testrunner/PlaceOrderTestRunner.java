package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PlaceOrder;

public class PlaceOrderTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1, description = "User can login with valid credentials")
    public void testUserLogin() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("standard_user", "secret_sauce");
        WebElement logoDisplayed = driver.findElement(By.xpath("//div[@class='app_logo']"));
        Thread.sleep(1000);
        logoDisplayed.isDisplayed();
    }
PlaceOrder placeOrder;
    @Test(priority = 2, description = "Placing a new order of multiple item")
    public void placeOrderTest() throws InterruptedException {
        placeOrder = new PlaceOrder(driver);
        placeOrder.placeOrder();
        Thread.sleep(200);
        String confirmationMessageActual = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']")).getText();
        String confirmationMessageExpected = "Thank you for your order!";
        Assert.assertEquals(confirmationMessageActual, confirmationMessageExpected);
    }
}
