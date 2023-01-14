package com.cydeo.tests.day6_alert_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day6_Task2 {

    WebDriver driver;

    /*
    TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

     */

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }



    @Test
    public void selenium_test() {
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement javaAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        javaAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultText = result.getText();
        String expectedResultText = "You clicked: Ok";

        Assert.assertEquals(actualResultText,expectedResultText);





    }
}
