package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day5_Task8 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test

    public void multipleSelectDropDown() {
        //3. Select all the options from multiple select dropdown.
        Select multipleSelectDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> options = multipleSelectDropDown.getOptions();  // we store here all options

        //4. Print out all selected values.
        for (WebElement each : options) {
            each.click();
            System.out.println(each.getText() + " is selected: " + each.isSelected());

        }


        //5. Deselect all values.
        multipleSelectDropDown.deselectAll();


    }
}



/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.

 */