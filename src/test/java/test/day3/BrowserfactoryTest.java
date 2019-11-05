package test.day3;


import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class BrowserfactoryTest {

    public static void main(String[] args) {
        /*
        now we can get webdriver like this
        getDriver () method will return webdriver object
        and we can use reference variable  to work that object
         */



        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        // how we can print source code of the page
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}