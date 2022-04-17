package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class DropDownHandling {

    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //identifying the drop box
        WebElement daysDD = driver.findElement(By.id("select-demo"));

        //creating select object
        Select select = new Select(daysDD);
        select.selectByIndex(3);//selecting option 3()starts from 0, but in this example "please select is at 0"

        Thread.sleep(1000);

        //select by visible text
        select.selectByVisibleText("Thursday");
        Thread.sleep(1000);

        select.selectByValue("Sunday");

        List<WebElement> allOptions = select.getOptions();
        int size=allOptions.size();
        System.out.println(size);

        for(int i = 0; i < size; i++) {
            String option = allOptions.get(i).getText(); // get text for each element
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }
    }
}
