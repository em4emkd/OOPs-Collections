package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarsDemo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");

        String month="Nov";
        String day="3";
        String year="2022";
        driver.findElement(By.cssSelector("input#onward_cal")).click();

       //loop that will find my month and year
        while (true){
            String dateTitle = driver.findElement(By.cssSelector("td.monthTitle")).getText();
            String[] arr = dateTitle.split(" ");
            String titleMonth = arr[0];
            System.out.println(titleMonth);
            String titleYear = arr[1];
            System.out.println(titleYear);

            if(titleMonth.equals(month) && titleYear.equals(year)){
                break;
            } else {
               driver.findElement(By.cssSelector("td.next")).click();
            }
        }
        //to find my day
        List<WebElement> days = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
        for(WebElement da:days){
            String d = da.getText();
            if(d.equals(day)){
                da.click();
                break;
            }
        }



    }
}
