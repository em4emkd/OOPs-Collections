package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1 {
    public static void main(String[] args) {

        /**
         * go to https://the-internet.herokuapp.com/dynamic_controls
         * click on checkbox and click on remove
         * verify the text
         * click on enable verify the textbox is enabled
         * enter text and click disable
         * verify the textbox is disabled
         */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement btn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        btn.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        WebElement textmsg1 = driver.findElement(By.id("message"));
        String msg1 = textmsg1.getText();
        if(msg1.equals("It's gone!")){
            System.out.println("Correct msg is displayed");
        } else {
            System.out.println("Msg is not displayed");
        }

        WebElement enabledBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enabledBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));

        WebElement textmsg2 = driver.findElement(By.cssSelector("p#message"));
        String msg2 = textmsg2.getText();
        if(msg2.equals("It's enabled!")){
            System.out.println("Correct msg is displayed");
        } else {
            System.out.println("Msg is not displayed");
        }







    }
}
