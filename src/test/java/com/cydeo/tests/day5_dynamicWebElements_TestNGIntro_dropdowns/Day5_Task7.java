package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_Task7 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }


    @Test
    public void dropdown(){

        WebElement nonSelect = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelect.click();

        WebElement websiteDropdownOptionsFacebook = driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[4]"));
        websiteDropdownOptionsFacebook.click();


        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }


}


/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */