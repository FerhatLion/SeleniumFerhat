package com.cydeo.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_homework3 {

    public static void main(String[] args) {

      // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      // 2- Go to: https://google.com
      driver.get("https://google.com ");

      // 3- Click to Gmail from top right.
        WebElement gmailLink = driver.findElement(By.className("gb_j"));
        gmailLink.click();

      // 4- Verify title contains:  Expected: Gmail
        String starter ="Gmail";
        String actualTitle = driver.getTitle();

            if(actualTitle.startsWith(starter)){
                System.out.println("Title verification PASSED!");
            }else{
                System.out.println("Title verification FAILED!!!");
            }

        // 5- Go back to Google by using the .back();
            driver.navigate().back();


        // 6- Verify title equals:   Expected: Google
        String actualHome = driver.getTitle();
        String expectedHome ="Google";


        if(actualHome.equals(expectedHome)){
            System.out.println("Home verification PASSED!");
        }else{
            System.out.println("Home verification FAILED!!!");
        }





    }


}
/*
        TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
 */