package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Review02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        //Finding Radio Button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleButton = driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));

        //check if the radio button is enabled
        System.out.println("The female radio button is enabled "+femaleButton.isEnabled());

        //check if the radio button is displayed (is showing on the page)
        System.out.println("The female radio button is displayed "+femaleButton.isDisplayed());

        //check if it is selected
        System.out.println("The radio button is selected "+femaleButton.isSelected());

        //if the button is not selected and select it
        if(!femaleButton.isSelected()){
            femaleButton.click();
        }
        //check the statu of selection again
        System.out.println("the female radio button is selected "+femaleButton.isSelected());



        //to get all the links in the current
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            System.out.println(link.getText());//print the text with the link


            //when i do this i also see some blank spaces, and if i want to only print the
            //links that only have text we implement if condition
            String name = link.getText();
            if(!name.isEmpty()){
                System.out.println(name);
            }
        }


    }
}
