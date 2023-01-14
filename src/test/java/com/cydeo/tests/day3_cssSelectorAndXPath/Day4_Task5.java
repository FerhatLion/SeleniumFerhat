package com.cydeo.tests.day3_cssSelectorAndXPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4_Task5 {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        // 3- Enter incorrect username into login box
        WebElement loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys("imcorrect" + Keys.ENTER);

        // 4- Click to `Reset password` button
        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPassword.click();

        // 5- Verify “error” label is as expected.  Expected: Login or E-mail not found
        WebElement errorText = driver.findElement(By.cssSelector("div[class='errortext']"));

        String actualErrorText = errorText.getText();
        String expectedErrorText = "Login or E-mail not found";

        if (actualErrorText.equals(expectedErrorText)) {
            System.out.println("Verification of error text PASSED!");
        } else {
            System.out.println("Verification of error text FAILED!");
        }

        driver.close();


    }


}
