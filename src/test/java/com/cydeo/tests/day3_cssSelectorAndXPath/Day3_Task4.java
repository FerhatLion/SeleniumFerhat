package com.cydeo.tests.day3_cssSelectorAndXPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task4 {


    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Verify “Reset password” button text is as expected: Expected: Reset password

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedresetPassword = "Reset password";
        String actualresetPassword = resetPassword.getText();

        if(actualresetPassword.equals(expectedresetPassword)){
            System.out.println("Verification of Reset Button Text PASSED!");
        }else{
            System.out.println("Verification of Reset Button Text FAILED");
        }






    }


}
