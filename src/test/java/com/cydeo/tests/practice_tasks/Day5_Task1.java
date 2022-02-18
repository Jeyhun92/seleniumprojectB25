package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day5_Task1 {

    public static void main(String[] args) {

//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.

//        TC #1: StaleElementReferenceException handling
//        1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


//        2. Go to https://practice.cydeo.com/add_remove_elements/

        driver.get("https://practice.cydeo.com/add_remove_elements/");
//        3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
//        4. Verify “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
//        5. Click to “Delete” button.
        deleteButton.click();
//        6. Verify “Delete” button is NOT displayed after clicking.
try {
    System.out.println(deleteButton.isDisplayed());
}catch (StaleElementReferenceException e){

    System.out.println("StaleElementReferenceException is caught");
}




//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

driver.quit();

    }
}
