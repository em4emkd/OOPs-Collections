package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    /*
    Facebook dropdown verification
    Open chrome browser
    Go to "https://www.facebook.com"
    click on create new account
    Verify:
    month dd has 12 month options
    day dd has 31 day options
    year dd has 115 year options
    Select your date of birth
    Quit browser
     */
    public static String url = "https://www.facebook.com/";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement newAccounButton = driver.findElement(By.linkText("Create new account"));
        newAccounButton.click();
        Thread.sleep(3000);
        //finding the month dropDown
        WebElement monthDD = driver.findElement(By.cssSelector("select#month"));
        //use Select class to be able to select the month
        Select month=new Select(monthDD);
        //crete list of the elements and check the size/num of elements in the list
        List<WebElement> monthOptions = month.getOptions();
        int size=monthOptions.size();
        if(size==12){
            System.out.println("The drop down has 12 month options");
        } else {
            System.out.println("The drop down doesn't have 12 month options");
        }
        WebElement dayDD = driver.findElement(By.cssSelector("select#day"));
        Thread.sleep(3000);
        Select day = new Select(dayDD);
        List<WebElement> dayOptions = day.getOptions();
        size=dayOptions.size();
        if(size == 31){
            System.out.println("The drop down has 31 day options");
        } else {
            System.out.println("The drop down doesn't have 31 day options");
        }
        WebElement yearDD = driver.findElement(By.cssSelector("select#year"));
        Select year = new Select(yearDD);
        List<WebElement> yearOptions = year.getOptions();
        size=yearOptions.size();
        if(size==115){
            System.out.println("The drop down has 115 year options");
        } else {
            System.out.println("The drop down has 115 year options");
        }
        month.selectByVisibleText("Nov");
        Thread.sleep(3000);
        day.selectByVisibleText("2");
        Thread.sleep(3000);
        year.selectByValue("1989");
    }
}
