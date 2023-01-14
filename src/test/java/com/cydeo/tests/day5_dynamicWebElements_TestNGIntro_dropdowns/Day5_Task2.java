package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day5_Task2 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockey = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockey.click();

        if(hockey.isSelected()){
            System.out.println("Verification test of hockey button is selected PASSED!");
        }else{
            System.out.println("Verification test of hockey button is selected FAILED!");
        }

    }


}

/*
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */