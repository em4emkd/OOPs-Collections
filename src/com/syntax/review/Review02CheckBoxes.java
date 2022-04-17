package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Review02CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //check the check box
        //if there is a text when we inspect the element we can use getText()
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected "+checkbox1.isSelected());

        //check the box
        checkbox1.click();

        //diselect the checkbox .> when we have one checkbox
        checkbox1.click();

        //get the message after checking the checkbox and display it on console
        WebElement message = driver.findElement(By.id("txtAge"));
        System.out.println(message.getText());

        //if we have more checkboxes we need to write xpath that would select all of those checkboxes
        //so we need to look for common parameters they have to be able to locate

        List<WebElement> checkboxs =driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //to select them all i can loop trough this list

        for(WebElement checkbox:checkboxs){
            checkbox.click();
        }
        Thread.sleep(3000);
        //to disselect i can go trough the same loop again
        for(WebElement checkbox:checkboxs){
            checkbox.click();
        }



    }
}
