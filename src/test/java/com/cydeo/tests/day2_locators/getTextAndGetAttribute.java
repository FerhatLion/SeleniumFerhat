package com.cydeo.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextAndGetAttribute {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3- Verify header text is as expected:   Expected: Registration form
        WebElement header = driver.findElement(By.tagName("h2"));
            String expectedHeaderText = "Registration form";
            String actualHeaderText = header.getText();
            if(actualHeaderText.equals(expectedHeaderText)){
                System.out.println("Header verification PASSED!");
            }else{
                System.out.println("Header verification FAILED!!!");
            }

            // 4- Locate “First name” input box
            WebElement inputBox = driver.findElement(By.name("firstname"));

            // 5- Verify placeholder attribute’s value is as expected: Expected: first name
            String expectedPlaceHolder = "first name";
            String actualPlaceHolder = inputBox.getAttribute("placeholder");

            if(actualPlaceHolder.equals(expectedPlaceHolder)){
                System.out.println("placeHolder PASSED!");
            }else{
                System.out.println("placeholder FAILED");
            }
            driver.close();


        /*

1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
         */




    }
}
