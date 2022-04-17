package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    /*
    Go to ebay.com
    get all the categories and print them in the console
    select Computers/Tables & Networking
    click on search
    verify the header
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.ebay.com/");
        WebElement allCategoriesDD = driver.findElement(By.id("gh-cat"));

        Select categories = new Select(allCategoriesDD);
        List<WebElement> options = categories.getOptions();
        for(WebElement option:options){
            String listOption=option.getText();
            System.out.println(listOption);
        }
        categories.selectByVisibleText("Computers/Tablets & Networking");
        WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();

        WebElement header = driver.findElement(By.xpath("//h1[@class='b-pageheader']"));
        String headerText= header.getText();
        //System.out.println(headerText);

        if(headerText.equals("Computers, Tablets & Network Hardware")){
            System.out.println(headerText+" is displayed");
        } else {
            System.out.println(headerText+" is not displayed");
        }


    }
}
