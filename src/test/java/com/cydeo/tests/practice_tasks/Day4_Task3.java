package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day4_Task3 {

    public static void main(String[] args) {
        //    XPATH Practice
//    DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//    TC #6:  XPATH LOCATOR practice
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons ");
        driver.manage().window().maximize();
//            3. Click on Button 1

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

//            4. Verify text displayed is as expected:
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        if (resultText.getText().equals("Clicked on button one!")){
            System.out.println("Text is displayed as expected");
        }else{
            System.out.println("Text is NOT displayed as expected");
        }

       driver.quit();

//    Expected: “Clicked on button one!”
//
//    USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS




    }


    }
