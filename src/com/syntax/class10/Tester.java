package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tester {

    public static String url="https://www.aa.com/homePage.do";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //select depart date
        WebElement departureDate = driver.findElement(By.className("ui-datepicker-trigger"));
        departureDate.click();
        WebElement dMonth = driver.findElement(By.className("ui-datepicker-month"));
        String dMonthText= dMonth.getText();
        // System.out.println(dMonthText);
        while (!dMonthText.equals("November"))  {
            WebElement nextBttn = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
            nextBttn.click();
            dMonth = driver.findElement(By.className("ui-datepicker-month"));
            dMonthText= dMonth.getText();
            System.out.println(dMonthText);
        }
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement dDate:dates){
            if(dDate.getText().equals("12")){
                dDate.click();
                break;
            }
        }
        //select return date
        WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[2]/div/button"));
        returnDate.click();
        WebElement returnMonth = driver.findElement(By.className("ui-datepicker-month"));
        String returnMonthText = returnMonth.getText();
        System.out.println(returnMonthText);


        while(!returnMonthText.equals("February")){
            WebElement nextBttn = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
            nextBttn.click();
            returnMonth = driver.findElement(By.className("ui-datepicker-month"));
            returnMonthText= returnMonth.getText();
            System.out.println(returnMonthText);
        }
        List<WebElement> returnDAtes = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement returnDate1:returnDAtes){
            if(returnDate1.getText().equals("13")){
                returnDate1.click();
                break;
            }
        }
        //select destination
        WebElement destination= driver.findElement(By.name("destinationAirport"));
        destination.click();
        destination.sendKeys("PHX");
        //click on search

        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        //quit the browser
        driver.quit();

    }
}
