package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().window().maximize();

        //1) How many rows in the table
        int rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr")).size();
        System.out.println("Total number of rows: "+ rows);

        //2) How many columns in the table columns=header in tables
        int col = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th")).size();
        System.out.println("Total number of columns: "+col);

        //3) Retrieve specific row and column data
        String value = driver.findElement(By.xpath(" //table[@id='task-table']//tr[2]/td[3]")).getText();
        System.out.println("The value is "+value);

        //4) Retrieve all the data from the table
        for(int r=1; r<=rows; r++){ //looping through rows
            for(int c=1; c<=col; c++){//looping through columns
                //to pass r and c to the xpath we need to add quotation and + on each side
                String data=driver.findElement(By.xpath(" //table[@id='task-table']//tr["+r+"]/td["+c+"]")).getText();
                System.out.print(data+" ");
            }
            System.out.println();
        }
        driver.quit();

        //5) Print Emily John in progress from the table
        for (int r = 1; r <= rows; r++) {
            String data = driver.findElement(By.xpath(" //table[@id='task-table']//tr["+r+"]/td[3]")).getText();
            if(data.equals("Emily John")){
                String name = driver.findElement(By.xpath(" //table[@id='task-table']//tr["+r+"]/td[3]")).getText();
                String status = driver.findElement(By.xpath(" //table[@id='task-table']//tr["+r+"]/td[4]")).getText();
                System.out.println(name + " " + status);
            }
        }
        driver.quit();




    }
}
