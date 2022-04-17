package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

   public static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get(url);
        //Locating checkboxes and storing them in the list
        List<WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[class='cb1-element']"));
        int size=optionCheckBoxes.size();
        System.out.println(size);


        //looping trough each element from the list line 21
        for(WebElement option:optionCheckBoxes){
            //option.click();
            //option.getText();//when we locate the element we can get the text of that element
            String checkBoxValue = option.getAttribute("value");
            if(checkBoxValue.equals("Option-2")) {
                option.click();
                break;
            }
        }

    }
}
