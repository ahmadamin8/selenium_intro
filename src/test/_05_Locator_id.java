package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));

        if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("Logo validation FAILED!!!");

        WebElement companyName = driver.findElement(By.id("comp-kuiqjidf"));

        if (companyName.isDisplayed()) System.out.println("The company name validation PASSED");
        else System.out.println("Company name validation FAILED!!!");

        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf1"));

        if (companyQuote.isDisplayed()) System.out.println("The company quote validation PASSED");
        else System.out.println("Company quote validation FAILED!!!");

        Driver.quitDriver();

    }
}


