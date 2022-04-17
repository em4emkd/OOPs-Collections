package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        /*
         * 1. launch the browser
         * 2. navigate to amazon web site
         * 3. print out the title and the url in the console
         * 4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");//here we set the properties

        WebDriver amazon=new ChromeDriver();//step 1
        amazon.get("https://www.amazon.com/");//step 2
        String title=amazon.getTitle();//step 3
        String url=amazon.getCurrentUrl();//step 3
        System.out.println(title+" "+url);//step 3
        amazon.quit();//step 4


    }
}
