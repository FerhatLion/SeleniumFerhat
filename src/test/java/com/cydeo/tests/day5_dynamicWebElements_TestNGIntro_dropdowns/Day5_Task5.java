package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_Task5 {
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
        Select state = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        state.selectByValue("IL");

        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        state.selectByVisibleText("Virginia");

        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        state.selectByIndex(5);



        // WebElement actualSelectedState = state.getFirstSelectedOption();
        //System.out.println(actualSelectedState);

        String actualSelectedStateText = state.getFirstSelectedOption().getText();
        String expectedSelectedStateText = "California";

        Assert.assertEquals(actualSelectedStateText , expectedSelectedStateText);

    }

}

/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */