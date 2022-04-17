package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        String mainPageHandle = driver.getWindowHandle(); // get window handle for the main page
        System.out.println(mainPageHandle);
// mainPageHandle like  'CDwindow-0DAF30313E8CB1606AADE5D2460E3AAE'

//open a new tab
        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();

// get the all the Window Handles into a set
        Set<String> allWindowHandles= driver.getWindowHandles();//store all the handles in a set
        System.out.println(allWindowHandles.size());

//iterating through the window handles
        Iterator<String> itr = allWindowHandles.iterator();//iterator to iterate through the handles
        mainPageHandle= itr.next(); // take the first step and assign the main handle
        String childHandle = itr.next();//take the 2nd step and have second child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
// switch back to main page
        driver.switchTo().window(mainPageHandle);
    }
}
