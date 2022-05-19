package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _14_Form_Exercise_2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement firstNameInputBox = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInputBox = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailNameInputBox = driver.findElement(By.id("input_comp-khwb0zsz"));

        String name = "John";
        String lName = "Doe";
        String email = "johndoe@gmail.com";

        firstNameInputBox.sendKeys(name);
        lastNameInputBox.sendKeys(lName);
        emailNameInputBox.sendKeys(email);

        System.out.println(firstNameInputBox.getAttribute("value").equals(name));
        System.out.println(lastNameInputBox.getAttribute("value").equals(lName));
        System.out.println(emailNameInputBox.getAttribute("value").equals(email));

        Driver.quitDriver();
    }
}
