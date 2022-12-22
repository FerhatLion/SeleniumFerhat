package com.cydeo.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_task2 {

    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://practice.cydeo.com

        driver.navigate().to("https://practice.cydeo.com");

        // 3- Click to A/B Testing from top of the list.

        driver.findElement(By.linkText("A/B Testing")).click();

        // 4- Verify title is:  Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed.");
        }else{
            System.out.println("Title verification failed.");
        }

        //  5- Go back to home page by using the .back();

        driver.navigate().back();

        // 6- Verify title equals   Expected: Practice

        String actualTitleHome = driver.getTitle();
        String expectedTitleHome = "Practice";

        if (actualTitleHome.equals(expectedTitleHome)){
            System.out.println("Home title verification passed.");
        }else{
            System.out.println("Home title verification failed.");
        }

        driver.close();



    }


}

/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice

 */