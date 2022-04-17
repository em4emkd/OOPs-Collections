package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
    /*
    Go to facebook sign up page
    Fill out the whole form
    Click signup
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement newAccounButton = driver.findElement(By.linkText("Create new account"));
        newAccounButton.click();
        Thread.sleep(3000);
        WebElement firsName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firsName.sendKeys("Emi");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Emi");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("email@123.com");
        Thread.sleep(3000);

        WebElement reenterEmail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        reenterEmail.sendKeys("email@123.com");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
        password.sendKeys("Password123");
        WebElement monthDD = driver.findElement(By.cssSelector("select#month"));
        Select month = new Select(monthDD);
        month.selectByVisibleText("Dec");
        Thread.sleep(3000);
        WebElement dayDD = driver.findElement(By.cssSelector("select#day"));
        Select day = new Select(dayDD);
        day.selectByVisibleText("2");
        Thread.sleep(3000);
        WebElement yearDD = driver.findElement(By.cssSelector("select#year"));
        Select year = new Select(yearDD);
        year.selectByVisibleText("1995");
        Thread.sleep(3000);
        WebElement femaleButton = driver.findElement(By.xpath("//label[text()='Female']"));
        femaleButton.click();
        Thread.sleep(3000);
        WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUp.click();
        driver.quit();







    }
}
