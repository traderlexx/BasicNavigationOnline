package test.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigation {

    public static void main (String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        // to miximize browser
        driver.manage().window().maximize();
        driver.get("http://google.com");
     // if we want to navigate , to different browser code is
        // we not gonna open new browser or new tab
        // URl  can be passed as an object or as string ,  we used string
        driver. navigate().to("http://amazon.com");
        // if i want to come back to previous  page
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
}


}
