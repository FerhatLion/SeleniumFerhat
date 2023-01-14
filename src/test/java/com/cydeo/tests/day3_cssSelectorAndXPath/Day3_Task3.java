package com.cydeo.tests.day3_cssSelectorAndXPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task3 {



        public static void main(String[] args) {

            // 1- Open a chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            // 2- Go to: https://login1.nextbasecrm.com/
            driver.get("https://login1.nextbasecrm.com/ ");

            // 3- Verify “Log in” button text is as expected .  Expected: Log In
            WebElement LoginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
            String expectedLoginButtonText = "Log In";
            String actualLoginButtonText = LoginButton.getAttribute("value");

            System.out.println("actualLoginButtonText = " + actualLoginButtonText);


            if(actualLoginButtonText.equals(expectedLoginButtonText)){
                System.out.println("Verification of login button text PASSED!");
            }else{
                System.out.println("Verification of login button text FAILED!");
            }

            driver.close();



            /*

PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
             */

    }
}
