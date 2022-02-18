package com.cydeo.tests.practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebElement searchButton = driver.findElement(By.id("global-enhancements-search-query"));

        searchButton.sendKeys("wooden spoon" );
        searchButton.sendKeys(Keys.ENTER);

        if (driver.getTitle().equals("Wooden spoon | Etsy")){
            System.out.println("Title is verified");
        }else {
            System.out.println("Title is not verified");
        }

        driver.quit();

    }
}

/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */