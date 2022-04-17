package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {

    public static String url="https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        WebElement igButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton=driver.findElement(By.linkText("Like Us On Facebook"));
        WebElement igAndfbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        fbButton.click();
        igButton.click();
        igAndfbButton.click();


        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        while(it.hasNext()) { //start iterating through the handles
            String handle = it.next(); // get the next handle
            if(!mainPageHandle.equals(handle)) { // set a condition
                driver.switchTo().window(handle); // switch to a window which is not equal to main page handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle); // swithing back to parent handle
        igButton.click();


    }
}
