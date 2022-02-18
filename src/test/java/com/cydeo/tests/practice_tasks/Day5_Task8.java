package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day5_Task8 {

    public static void main(String[] args) {

//        TC #8: Selecting value from multiple select dropdown
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
//        3. Select all the options from multiple select dropdown.
        WebElement dropDown = driver.findElement(By.id("dropdownMenuLink"));
        dropDown.click();
//        4. Print out all selected values.

//        5. Deselect all values.

    }
}
