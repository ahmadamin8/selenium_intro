package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator_className {
    public static void main(String[] args) {

        //1. Set driver
        WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.google.com/");

        //Make sure image is displayed
        WebElement googleImage = driver.findElement(By.className("lnXdpd"));

        if(googleImage.isDisplayed()) System.out.println("Google image validation is PASSED");
        else System.out.println("Google image validation is FAILED!!!");

        //3. Teardown
        Driver.quitDriver();
    }
}
