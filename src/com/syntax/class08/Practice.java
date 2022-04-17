package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practice {

    public static String url = "https://chercher.tech/practice/checkbox.html";
    public static String url1 = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("url");
//        //checkbox
//        driver.findElement(By.cssSelector("input#a")).click();
//        driver.quit();

        //dropdown
        driver.get(url1);
//        WebElement dropdown= driver.findElement(By.id("select-demo"));
//        Select select=new Select(dropdown);
//        select.selectByVisibleText("Wednesday");

        //dropdown
          driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//        WebElement dropdown = driver.findElement(By.id("first"));
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Google");

//        WebElement dropDown = driver.findElement(By.id("animals"));
//        Select select1 = new Select(dropDown);
//        select1.selectByIndex(3);

        //multiple select dropdown
//        WebElement multipleDropDown = driver.findElement(By.id("multi-select"));
//        Select select3 = new Select(multipleDropDown);
//        List<WebElement> list = select3.getOptions();
//        for(WebElement option:list){
//            //the variable options would give me all available options from the dropdown
//            String options = option.getText();
//            //selecting all options
//            select3.selectByVisibleText(options);
//        }

        //multiple select dropdown
//        WebElement dropDown = driver.findElement(By.id("second"));
//        Select select=new Select(dropDown);
//        List<WebElement> list= select.getOptions();
//        for (WebElement option:list) {
//            String options = option.getText();
//            select.selectByVisibleText(options);
//        }





    }
}
