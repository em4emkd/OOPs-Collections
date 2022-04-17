package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//for windows
        //setting up driver and path                                                    //add extension .exe you can use //



        WebDriver driver=new ChromeDriver();//launch browser
        driver.get("https://www.google.com/");//navigate to a website
        String url=driver.getCurrentUrl();//getting url and assigning at to a variable
        //the title of the webpage is on the tab
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();//close the browser


    }
}
