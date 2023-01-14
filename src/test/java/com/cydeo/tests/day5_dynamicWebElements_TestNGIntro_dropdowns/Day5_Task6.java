package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_Task6 {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }


    @Test
    public void dropdown() {
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        year.selectByVisibleText("1924");
        month.selectByValue("11");
        day.selectByIndex(0);

    }
}

/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number


 */