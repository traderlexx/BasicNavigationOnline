package test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class EnterTestPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputBox = driver.findElement(By.name ("email"));
        // we enter the text
        inputBox.sendKeys("renavatio1985@gmail.com");
        WebElement button = driver.findElement(By.id("form_submit"));
        button.click();
        BrowserUtils.wait(5);
        String expectedUrl= "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Test Passed");

        }else {
            System.out.println("Test Failed");
        }
        driver.close();

    }
}
