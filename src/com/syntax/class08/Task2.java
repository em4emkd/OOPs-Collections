package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Task2 {
    /**
     * Go to https://demoqa.com/browser-windows
     * click on New Tab and print the text from new tab in the console
     * click on New Window and print the text from new window in the console
     * click on New Window Message and print the text from new window in the console
     * Verify (compare) the titles for each page
     * Print out the title of the all pages
     */

    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        Set<String> windowHandles = driver.getWindowHandles();
        //String mainWindow = driver.getWindowHandle();

        ArrayList<String> windowIDs = new ArrayList<>(windowHandles);
        for (String windowID:windowIDs){
            String title = driver.switchTo().window(windowID).getTitle();
            System.out.println(title);

        }

        WebElement tab1= driver.findElement(By.id("tabButton"));
        tab1.click();
        WebElement msg1= driver.findElement(By.id("sampleHeading"));
        System.out.println(msg1.getText());
        //driver.switchTo().window(mainWindow);

        WebElement tab2 = driver.findElement(By.id("windowButton"));
        tab2.click();
        WebElement msg2 = driver.findElement(By.id("sampleHeading"));
        System.out.println(msg1.getText());

        WebElement tab3 = driver.findElement(By.cssSelector("button#messageWindowButton"));
        tab3.click();








    }
}
