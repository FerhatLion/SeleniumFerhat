package com.cydeo.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_task1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.  Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com/");

        // 3. Verify URL contains(Expected: cydeo)
        String expectedURL = "cydeo";
        String currentURL = driver.getCurrentUrl();
            if (currentURL.contains(expectedURL)){
                System.out.println("Verification of URL passed.");
            }else{
                System.out.println("Verification of URL failed.");
            }

        // 4. Verify title: (Expected: Practice)
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
            if(actualTitle.equals(expectedTitle)){
                System.out.println("Verification of title passed.");
            }else{
                System.out.println("Verification of title failed.");
            }

        driver.close();


    }


}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
 */