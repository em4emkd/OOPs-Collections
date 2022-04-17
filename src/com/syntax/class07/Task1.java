package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    /*
    Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify (compare) the titles for each page
    Print out the title of the all pages
     */
    static String url="https://demoqa.com/browser-windows";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get(url);
        //tab1
        WebElement tab1= driver.findElement(By.id("tabButton"));
        tab1.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator=allWindowHandles.iterator();
        while(iterator.hasNext()){
            String nextWindowHandle=iterator.next();

        }
        String parentWindow=iterator.next();
        String child1Window=iterator.next();
        //String child2Window=iterator.next();

        driver.switchTo().window(child1Window);
        WebElement tab1Text= driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println("First title "+tab1Text.getText());
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);

        //tab2
        WebElement tab2=driver.findElement(By.id("windowButton"));
        tab2.click();
        driver.switchTo().window(child1Window);
        WebElement tab2Text=driver.findElement(By.id("sampleHeading"));
        System.out.println("Second title "+tab2Text.getText());
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);

        //tab3
        WebElement tab3= driver.findElement(By.id("messageWindowButton"));
        tab3.click();
        //driver.switchTo().window(child2Window);
        WebElement tab3Text=driver.findElement(By.tagName("body"));
        System.out.println(tab3Text.getText());



    }
}
