package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day4_Task6 {

    public static void main(String[] args) {

//        TC #6: StaleElementReferenceException Task
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest ");
//        3- Locate “CYDEO” link, verify it is displayed.
        WebElement link = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("link.isDisplayed() = " + link.isDisplayed());
//        4- Refresh the page.
        driver.navigate().refresh();
//        5- Verify it is displayed, again.
try {

    System.out.println("link.isDisplayed() = " + link.isDisplayed());

}catch (StaleElementReferenceException e){
    System.out.println("StaleElementReferenceException exception is catched");
}

        driver.quit();
//
//
//
//                This is a simple StaleElementReferenceException to understand what is
//        this exception and how to handle it.



    }
}
