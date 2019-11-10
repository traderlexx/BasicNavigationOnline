package test.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class TestForNameLocator {
    public static void main(String[] args) {
       // for Mac user we do not need to use Webdriver manager  Safari has his  embedded Webdriver Support .
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
       // enter full name
        WebElement fullName = driver.findElement(By.name("full_name"));
       fullName .sendKeys("Test User");
       // Enter email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test_email@email.com");
       // click to sign up
        BrowserUtils.wait(2);
        driver.findElement(By.name("wooden_spoon")).click();
        BrowserUtils.wait(2);
        driver.quit();


    }
}
