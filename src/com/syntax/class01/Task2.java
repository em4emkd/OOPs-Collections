package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */

    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");

        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(url+" "+title);

        driver.navigate();
        driver.quit();

    }
}
