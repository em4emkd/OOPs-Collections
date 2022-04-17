package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//got to this website and click on the checkbox that is there
public class Review03FrameTask {

    public static String url = "https://chercher.tech/practice/implicit-wait-example";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame("frame1");//frame1
        driver.switchTo().frame("frame3");//frame1
       //WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        // driver.switchTo().frame(frame1); -> locating by web element (line 23 & 24)

        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);


        WebElement dropDown=driver.findElement(By.tagName("select"));
        Select sel=new Select(dropDown);
        sel.selectByIndex(2);




    }

}
