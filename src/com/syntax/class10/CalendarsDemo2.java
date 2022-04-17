package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalendarsDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

        driver.findElement(By.cssSelector("input#departon")).click();

        Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        month.selectByVisibleText("Jun");

        Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year.selectByVisibleText("1989");

        String day="3";
        List<WebElement> allDays = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//td"));

        for (WebElement d:allDays){
            String dayText=d.getText();

            if(dayText.equals(day)){
                d.click();
                break;
            }
        }


    }
}
