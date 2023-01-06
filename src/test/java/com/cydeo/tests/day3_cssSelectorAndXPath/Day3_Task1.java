package com.cydeo.tests.day3_cssSelectorAndXPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task1 {

    public static void main(String[] args) {

       // 1- Open a chrome browser
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3- Enter incorrect username: “incorrect”
        WebElement inputUserName= driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        // 4- Enter incorrect password: “incorrect”
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

        // 5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        // 6- Verify error message text is as expected:  Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErroMessage = errorMessage.getText();

            if(actualErroMessage.equals(expectedErrorMessage)){
                System.out.println("Error message verification PASSED!");
            }else{
                System.out.println("Error message verification FAILED!!!");
            }


    }
}

/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */