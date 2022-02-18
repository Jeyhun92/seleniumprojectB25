package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day5_Task2 {


    public static void main(String[] args) {

//
//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #2: Radiobutton handling
//        1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/radio_buttons

        driver.get(" https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
//        4. Verify “Hockey” radio button is selected after clicking.

        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());

//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

      //  driver.quit();


//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
//
//        Create a utility method to handle above logic.
//        Method name: clickAndVerifyRadioButton
//        Return type: void or boolean
//        Method args:
//        1. WebDriver
//        2. Name attribute as String (for providing which group of radio buttons)
//        3. Id attribute as String (for providing which radio button to be clicked)
//
//        Method should loop through the given group of radio buttons. When it finds the
//        matching option, it should click and verify option is Selected.
//                Print out verification: true





    }

    public void  clickAndVerifyRadioButton(WebDriver driver, String name, String id){
        List<WebElement> allRadioButtons =  driver.findElements(By.tagName("input"));
        for (WebElement each : allRadioButtons) {
if (each.equals("hokey")){
    each.isSelected();
}
        }

    }
}
