package com.cydeo.tests.practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement clickGmail=driver.findElement(By.linkText("Gmail"));

        clickGmail.sendKeys(Keys.ENTER);

        if (driver.getTitle().contains("Gmail")){
            System.out.println("Verified");
        }else{
            System.out.println("Not Verified");
        }

        driver.navigate().back();
        if (driver.getTitle().equals("Google")){
            System.out.println("Verified !");
        }else {
            System.out.println("NOT Verified!");
        }
        driver.quit();

    }
}
/*


TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google

 */