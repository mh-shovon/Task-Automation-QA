package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.PlaceOrderPage;

public class PlaceOrderTestRunner extends Setup {
    PlaceOrderPage placeOrderPage;

    @Test(description = "Placing a new order as a guest user")
    public void placeOrderTest() throws InterruptedException {
        placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.orderPlace();
        Thread.sleep(200);
        WebElement orderPlaceMessage = driver.findElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']"));
        orderPlaceMessage.isDisplayed();
    }
}
