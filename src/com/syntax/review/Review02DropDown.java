package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Review02DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement createNewAccount=driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(3000);

        //get the desired dropdown
        WebElement daysoptions = driver.findElement(By.cssSelector("select#day"));

        //use selenium select class
        Select days=new Select(daysoptions);
        days.selectByValue("5");
        Thread.sleep(3000);
        days.selectByIndex(0);
        Thread.sleep(3000);
        days.selectByVisibleText("25");

        //print all options of the dropdown
        //whenever we want to have all Options we use allOptions() method from the select class

        List<WebElement> options = days.getOptions();

        for(WebElement option :options){
            System.out.println("option.getText()");
        }

        //we we want to get the attribute value(html)  we can use getAttribute() method

    }
}
