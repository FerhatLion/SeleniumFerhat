package com.cydeo.tests.day4_findElements_chechkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4_Task1_2 {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        // WebElement home3 = driver.findElement(By.cssSelector("a[class = 'nav-link']"));
        // WebElement home2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[href ='/']"));


        // // WebElement forgotPassWord1 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        // WebElement forgotPassWord1 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement forgotPassWord = driver.findElement(By.cssSelector("div.example>h2"));

        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));

        // WebElement inputBox1 = driver.findElement(By. xpath("//input[contains(@pattern,'a-z')]"));
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        System.out.println("homeLink.isDisplayed=" + homeLink.isDisplayed());
        System.out.println("forgotPassWord.isDisplayed = " + forgotPassWord.isDisplayed());
        System.out.println("emailText.isDisplayed = " + emailText.isDisplayed());
        System.out.println("inputBox.isDisplayed = " + inputBox.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed = " + poweredByCydeoText.isDisplayed());

        driver.close();

    }
}

/*TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible


 */