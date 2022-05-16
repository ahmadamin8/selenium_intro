package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Name_Locator {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement searchBox =  driver.findElement(By.name("q"));
        if(searchBox.isDisplayed()) System.out.println("Search box is there");
        else System.out.println("Search box isn't there");

        Driver.quitDriver();
    }
}
