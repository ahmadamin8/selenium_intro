package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "/Users/ahmadamin/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        if(driver.getTitle().equals("Apple")) System.out.println("Apple title validated!");
        else System.out.println("Apple title failed!");

        driver.quit();
    }
}
