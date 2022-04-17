package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Review03Waits {

    public static String url = "https://chercher.tech/practice/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        ///first i need to wait for the element to appear than i need to locate the element
        //when we don't know the amount of time we need to wait we need to use the implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//it’ll wait 20 seconds before throwing an exception
        //we declare it only once in our script
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        //check the video again April 7 review at 8:40pm




    }
}