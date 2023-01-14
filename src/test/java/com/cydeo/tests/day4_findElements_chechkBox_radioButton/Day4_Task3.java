package com.cydeo.tests.day4_findElements_chechkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day4_Task3 {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[text()='Button 1']"));
        button1.click();

        WebElement message = driver.findElement(By.xpath("//p[text()='Clicked on button one!']"));

        String expectedText = "Clicked on button one!";
        String actualText = message.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Verification of message text PASSED!");
        }else{
            System.out.println("Verification of message text FAILED!");
        }



    }

}
/*
TC #6:  XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cydeo.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”

USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */