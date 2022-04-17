package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();//launching our browser only once

        driver.get("https://www.facebook.com/");//- to navigate to facebook
        driver.navigate().to("https://www.google.com/");

        driver.navigate().back();//navigate back
        driver.navigate().forward();//navigate forward
        Thread.sleep(2000);//2 seconds/2000 milliseconds(we won't be using this at work)
        driver.navigate().refresh();
        driver.close();//close() vs quit(); driver.close is closing the current tab->will close the active tab
        driver.quit();//will close the whole browser
    }
}
