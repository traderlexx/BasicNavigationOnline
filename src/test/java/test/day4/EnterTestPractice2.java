package test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class EnterTestPractice2 {
    public static void main(String[] args) {
       // as ususllly we start with driver set up
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input = driver.findElement(By.name("email"));
       // keys. ENTER  will simulate  ENTER button  press
        input.sendKeys("random@gmail.com", Keys.ENTER);
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expedtedMessage = "Your e-mail's been sent!";
       // to get the text from element
        String actualMessage =  confirmationMessage.getText();
        if (expedtedMessage.equals(actualMessage)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed ");
        }
         driver.close();
    }
}
