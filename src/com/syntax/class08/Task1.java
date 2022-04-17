package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    /**
     * go to https://the-internet.herokuapp.com/dynamic_controls
     * click on checkbox and click on remove
     * verify the text
     * click on enable verify the textbox is enabled
     * enter text and click disable
     * verify the textbox is disabled
     */
    public static String url="https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement removeButton = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeButton.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));

        WebElement text1= driver.findElement(By.cssSelector("p#message"));
        String getText1 = text1.getText();
        if(getText1.equals("It's gone!")){
            System.out.println("Text is correct: It's gone!");
        } else {
            System.out.println("Text isn't correct");
        }

        WebElement enableDisableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableDisableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));

        WebElement text2 = driver.findElement(By.cssSelector("p#message"));
        String getText2 = text2.getText();
        if(getText2.equals("It's enabled!")){
            System.out.println("Text is correct: It's enabled!");
        } else {
            System.out.println("Text isn't correct");
        }

    }
}
