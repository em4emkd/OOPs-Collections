package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

       // driver.navigate().to("https://www.google.com/");//navigate does not fully wait for it to load

        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("emilija");
        Thread.sleep(2000);//this method is only for our eyes
        username.clear();//will erase everything

        //WebElement password = driver.findElement();
        //password.sendKeys("12345");


    }
}
