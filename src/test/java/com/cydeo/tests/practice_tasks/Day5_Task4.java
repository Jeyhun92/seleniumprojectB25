package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day5_Task4 {

    public static void main(String[] args) {

//
//        TC #5: Selecting state from State dropdown and verifying result
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown  ");

        WebElement selectDropdown = driver.findElement(By.id("state"));
        selectDropdown.click();

//        3. Select Illinois
        WebElement illinois = driver.findElement(By.xpath("//option[@value='IL']"));
        illinois.click();
//        4. Select Virginia
        WebElement virginia = driver.findElement(By.xpath("//option[@value='VA']"));
      virginia.click();
//        5. Select California
        WebElement california = driver.findElement(By.xpath("//option[@value='CA']"));
        california.click();
//        6. Verify final selected option is California.

        System.out.println("california.isSelected() = " + california.isSelected());
//        Use all Select options. (visible text, value, index)


       // driver.quit();

    }
}
