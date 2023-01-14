package com.cydeo.tests.day3_cssSelectorAndXPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task2 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Open a chrome browser
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer

        WebElement rememberMeLabel= driver.findElement(By.className("login-item-checkbox-label"));
        String expectedLabelText = "Remember me on this computer";
        String actualLabelText = rememberMeLabel.getText();
        if(actualLabelText.equals(expectedLabelText)){
            System.out.println("Verification of label text PASSED!");
        }else{
            System.out.println("Verification of label text FAILED!");
        }

        // 4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        Thread.sleep(3000);
        WebElement forgotPasswordLinkText = driver.findElement(By.className("login-link-forgot-pass"));
        // WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String actualforgotPasswordLinkText = forgotPasswordLinkText.getText();
        String expectedforgotPasswordLinkText = "FORGOT YOUR PASSWORD?";

        System.out.println("forgotPasswordLinkText = " + forgotPasswordLinkText);
        System.out.println("forgotPasswordLinkText = " + forgotPasswordLinkText);

        if (actualforgotPasswordLinkText.equals(expectedforgotPasswordLinkText)){
            System.out.println("Verification of link text 'forgot your password?' PASSED!" );
        }else{
            System.out.println("Verification of link text 'forgot your password?' FAILED!" );
        }

        // 5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        Thread.sleep(3000);
        String expectedHref = "/?forgot_password=yes";
        String actualHref = forgotPasswordLinkText.getAttribute("href");

        System.out.println("actualHref = " + actualHref);
        System.out.println("expectedHref = " + expectedHref);

        if (actualHref.contains(expectedHref)){
            System.out.println("Verification of href PASSED!");
        }else{
            System.out.println("Verification of href FAILED!");
        }







    }


}
