package com.cydeo.tests.practice_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day5_Task7 {

    public static void main(String[] args) {

//        TC #7: Selecting value from non-select dropdown
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");

//        3. Click to non-select dropdown

        WebElement dropDown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropDown.click();
//        4. Select Facebook from dropdown

        WebElement facebook = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebook.click();

//        5. Verify title is “Facebook - Log In or Sign Up”
        System.out.println("driver.getTitle().equals(\"Facebook - Log In or Sign Up\") = " + driver.getTitle().equals("Facebook - Log In or Sign Up"));
        driver.quit();
    }
}
