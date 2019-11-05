package test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class ReadAttribute {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input= driver.findElement(By.name("email"));
        // to read value of attribute
        // name= "email" name its an attribute , email it's value of attribute
        System.out.println(input.getAttribute("pattern"));

        input.sendKeys("random@gmail.com");
        // how to read  entered text ?
        // its gonna be inside attribute
        System.out.println(input.getAttribute("value"));
        // if button has a type "submit "
        // we can use.submit .method instead of click as well
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.submit();
        driver.close();
    }
}
