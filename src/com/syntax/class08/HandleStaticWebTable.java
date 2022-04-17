package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTable {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id=table = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());

        Iterator<WebElement> it = rowData.iterator();
        while (it.hasNext()) {
            WebElement row = it.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }

        System.out.println("-------------------------");

        List<WebElement> colsData=driver.findElements(By.xpath("//table[@id=table = 'task-table']/tbody/tr"));
        System.out.println(colsData.size());

        for(WebElement colData:colsData){
            String colText=colData.getText();
            System.out.println(colText);
        }

    }
}
