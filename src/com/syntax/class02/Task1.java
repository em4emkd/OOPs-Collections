package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Cheyl");
        driver.findElement(By.name("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Reston");
        driver.findElement((By.id("customer.address.state"))).sendKeys("VA");
        driver.findElement((By.id("customer.address.zipCode"))).sendKeys("20190");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123 456-789");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-22-3333");
        driver.findElement(By.id("customer.username")).sendKeys("csmith");
        driver.findElement(By.id("customer.password")).sendKeys("Password123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password123");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}

