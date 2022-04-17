package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver fb=new ChromeDriver();
        fb.get("https://www.facebook.com/");
        fb.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        fb.findElement(By.name("firstname")).sendKeys("Cheryl");
        fb.findElement(By.name("lastname")).sendKeys("Smith");
        fb.findElement(By.name("reg_email__")).sendKeys("csmith@123");
        fb.findElement(By.name("reg_passwd__")).sendKeys("Password123");
        Thread.sleep(2000);
        fb.findElement(By.name("websubmit")).click();
        //fb.findElement(By.name("birthday_month")).sendKeys("March");
        //fb.findElement(By.name("birthday_day")).sendKeys("2");
        //fb.findElement(By.name("birthday_year")).sendKeys("1989");
        Thread.sleep(2000);
        fb.findElement(By.cssSelector("._8ien ._8idr")).click();
        fb.quit();

    }
}



