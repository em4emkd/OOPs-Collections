package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    /**
     * Go to aa.com/homePage.do
     * select depart date
     * select return date
     * select destination
     * click on search
     * quit the browser
     */
    public static String url = "https://www.aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String departYear = "2022";
        String departMonth = "September";
        String departDay = "19";
        String returnDay= "25";

        WebElement calendarDepartBtn = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        calendarDepartBtn.click();

        while(true){

            String textMonth = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
            String textYear = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();

            if(textMonth.equals(departMonth) && textYear.equals(departYear)){
                break;
            } else {
                WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
                next.click();
            }
        }
        //pick day
        List<WebElement> daysList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for(WebElement days:daysList){
            String day = days.getText();

            if(day.equals(departDay)){
                days.click();
                break;
            }
        }


        WebElement calendarReturnBtn = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        calendarReturnBtn.click();

        while(true){
            String textMonth = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
            String textYear = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();

            if(textMonth.equals(departMonth) && textYear.equals(departYear)){
                break;
            } else {
                WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
                next.click();
            }
        }
        //pick day
        List<WebElement> daysList1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement days:daysList1){
            String day = days.getText();

            if(day.equals(returnDay)){
                days.click();
                break;
            }
        }

        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
        searchBtn.click();
        driver.quit();






    }
}
