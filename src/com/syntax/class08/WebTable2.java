package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebTable2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.opencart.com/admin/index.php?route=sale/order&user_token=QhpebZAxxxV15M6M4K3K45eD72kD3nc4");
        driver.manage().window().maximize();

//        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//        username.sendKeys("Tester");
//        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//        password.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        WebElement salesButton = driver.findElement(By.xpath("//a[normalize-space()='Sales']"));
        salesButton.click();

        driver.findElement(By.xpath("(//a[contains(text(),'Orders')])[1]")).click();

        String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
        System.out.println(text);//showing the number of pages/rows

        int totalPages = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1 ));
        //getting the current active page
        for (int p=1; p<=totalPages; p++){
            //this is hardcoded value getting only the first page, we need a dynamic path
            //for all pages for that we need to use the pagination
            //driver.findElement(By.xpath("//span[normalize-space()='1']"));//active page has a span tag; inactive page has an a tag
            WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
            System.out.println("Active page "+activePage.getText());
            activePage.click();

        }
        int numOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();




        driver.quit();

    }
}
