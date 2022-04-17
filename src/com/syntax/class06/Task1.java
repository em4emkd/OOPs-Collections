package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
    verify enroll today button is enabled
     */
        public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement header=driver.findElement(By.cssSelector("span.gum"));
        if(header.isDisplayed()){
            System.out.println("AUTOMATION TESTING PLATFORM BY SYNTAX is displayed");
        } else {
            System.out.println("Header is not displayed");
        }
        Thread.sleep(2000);
        driver.switchTo().frame("FrameTwo");
        WebElement enrollButton=driver.findElement(By.xpath("//div[text()='Enroll today']"));
        if(enrollButton.isEnabled()){
            System.out.println("Enroll Button is Enabled");
        }else{
            System.out.println("Enroll Button is Disabled");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
