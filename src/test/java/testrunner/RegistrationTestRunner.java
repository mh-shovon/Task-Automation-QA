package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import java.util.Random;

public class RegistrationTestRunner extends Setup {
    RegistrationPage registrationPage;

    public static String generateRandomNumber(int len) {
        String chars = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    @Test()
    public void registrationTest() throws InterruptedException {
        registrationPage = new RegistrationPage(driver);
        registrationPage.doRegistration("Mehedi Hasan", "Shovon", "1", "November", "1996", "shovon"+generateRandomNumber(3)+"@gmail.com", "Jatri Services Ltd", "shovon0001", "shovon0001");
        Thread.sleep(200);
        WebElement newAccountRegistrationMessage = driver.findElement(By.xpath("//div[@class='result']"));
        newAccountRegistrationMessage.isDisplayed();

//        String successMessageActual = driver.findElement(By.xpath("//div[@class='result']")).getText();
//        String successMessageExpected = "Your registration completed";
//        Assert.assertEquals(successMessageActual, successMessageExpected);
    }
}
