package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    click on each button and handle the alert accordingly
     */
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement alertBox=driver.findElement(By.xpath("//button[text()='Click me!'and @class='btn btn-default']"));
        alertBox.click();
        Alert confirmAlert=driver.switchTo().alert();
        confirmAlert.accept();
        Thread.sleep(3000);

        WebElement confirmBox= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmBox.click();
        confirmAlert=driver.switchTo().alert();
        confirmAlert.accept();
        Thread.sleep(3000);

        WebElement promptBox=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptBox.click();
        confirmAlert=driver.switchTo().alert();
        confirmAlert.sendKeys("Emilia");
        confirmAlert.accept();
    }
}
