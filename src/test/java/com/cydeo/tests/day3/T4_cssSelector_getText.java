package com.cydeo.tests.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {
//        TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");
//        3- Verify “Reset password” button text is as expected:
//        Expected: Reset password

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        String expectedText = "Reset password";
        String actualText = resetPasswordButton.getAttribute("value");

        if (expectedText.equals(actualText)){
            System.out.println("Matched");
        }else{
            System.out.println("Did not match");
        }

    }
}
