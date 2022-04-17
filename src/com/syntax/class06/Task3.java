package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
    verify enroll today button is enabled
     */
    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);
        WebElement frame=driver.findElement(By.xpath("//iframe[@name='FrameOne']"));
        driver.switchTo().frame(frame);
        WebElement enroll=driver.findElement(By.xpath("//a[text()='Enroll' and @class='menu-link w-nav-link w--current w--nav-link-open']"));
        enroll.click();
        WebElement x= driver.findElement(By.xpath("//button[@class='CloseButton__ButtonElement-sc-79mh24-0 feRsBm makaha-CloseButton makaha-close makaha-ClosePosition--top-right']"));


    }
}
