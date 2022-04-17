package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");//->go to this page
        driver.findElement(By.id("email")).sendKeys("syntax@sdjhvfjv .com");//->find the
        //element that has id with a value of email and than type in the email in that specific text box

        driver.findElement(By.id("pass")).sendKeys("whateverpassword");//entering password

        driver.findElement(By.name("login")).click();//click on element

        Thread.sleep(2000);//it didn't work without this because it was going to fast//add 2 seconds

        //driver.findElement(By.linkText(("Forgot password?"))).click();//click on forgot password
        driver.findElement(By.partialLinkText("Forgot")).click();//partail link here
        driver.quit();



    }
}
