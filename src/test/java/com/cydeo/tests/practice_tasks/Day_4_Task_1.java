package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day_4_Task_1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/forgot_password ");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement homeLink = driver.findElement(By.xpath("//a[@class= 'nav-link']"));

        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrievePassword = driver.findElement(By.xpath("//i[@class = 'icon-2x icon-signin']"));

        WebElement cydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        if (homeLink.isDisplayed()){
            System.out.println("HomeLink is displayed");
        }else{
            System.out.println("HomeLink is NOT displayed");
        }

        if (forgotPassword.isDisplayed()){
            System.out.println("forgotPassword is displayed");
        }else{
            System.out.println("forgotPassword is NOT displayed");
        }

        if (emailText.isDisplayed()){
            System.out.println("emailText is displayed");
        }else{
            System.out.println("emailText is NOT displayed");
        }

        if (retrievePassword.isDisplayed()){
            System.out.println("retrievePassword is displayed");
        }else{
            System.out.println("retrievePassword is NOT displayed");
        }

        if (cydeoText.isDisplayed()){
            System.out.println("cydeoText is displayed");
        }else{
            System.out.println("cydeoText is NOT displayed");
        }
















    }


}

/*

XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible

 */