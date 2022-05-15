package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        //1. Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/ahmadamin/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2. Maximize driver
        driver.manage().window().maximize();

        //3. Define implicit wait
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //4. Navigate to Google website
        driver.get("https://www.google.com/");

        //5. Validate the title is Google
        System.out.println("The title of the page is = " + driver.getTitle());

        if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");

        System.out.println("End of the program");




    }
}
