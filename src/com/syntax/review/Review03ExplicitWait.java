package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Review03ExplicitWait {


        public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//in this case isn't working
            //we need an explicit wait
            WebDriverWait wait = new WebDriverWait(driver,20);
            WebElement btn=driver.findElement(By.id("startButton"));
            btn.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]")));
            WebElement WelcomeMsg=driver.findElement(By.xpath("//*[contains(text(), 'Welcome Syntax')]"));
            System.out.println(WelcomeMsg.getText());
        }
    }

