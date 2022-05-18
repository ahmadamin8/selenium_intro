package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com");

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));

        if(gmailLink.isEnabled() && gmailLink.isDisplayed()) System.out.println("Gmail link is enabled and displayed!");
        else System.out.println("Gmail link is not enabled and displayed");

        if(imagesLink.isEnabled() && imagesLink.isDisplayed()) System.out.println("Images link is enabled and displayed!");
        else System.out.println("Images link is not enabled and displayed");

        if(aboutLink.isEnabled() && aboutLink.isDisplayed()) System.out.println("About link is enabled and displayed!");
        else System.out.println("About link is not enabled and displayed");

        if(storeLink.isEnabled() && storeLink.isDisplayed()) System.out.println("Store link is enabled and displayed!");
        else System.out.println("Store link is not enabled and displayed");

        Driver.quitDriver();



    }
}
