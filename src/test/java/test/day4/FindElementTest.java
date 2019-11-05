package test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;
import utilities.BrowserUtils;

public class FindElementTest {


    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver( "chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle = driver.getTitle();

        // Step 1  open inspector in chrome and find locator for the element
        // Step 2  Create object of element
        // Step 3 Use Web element

        WebElement button =  driver.findElement(By.id("form_submit"));
        // to click on the element
        button.click();
        String ActualTitle = driver.getTitle();
        if (ActualTitle.equals(expectedTitle)){
            System.out.println("Test passed ");
        } else{
            System.out.println("Test Failed ");
            System.out.println("Expected Title:"+expectedTitle);
            System.out.println("Actual Title "+ ActualTitle);
        }
        BrowserUtils.wait(2);
        driver.close();

    }
}
