package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver obj=new ChromeDriver();
        obj.navigate().to("https://www.amazon.com/");
        obj.manage().window().maximize();//99% we will use this
        obj.manage().window().fullscreen();


    }
}
