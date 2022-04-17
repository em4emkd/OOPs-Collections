package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    /**
     * Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
     * click on leave
     * click on leave list
     * choose from "From calendar"
     * choose from "To calendar"
     * click only on cancelled and rejected checkboxes
     * uncheck Pending Approval
     * select IT support from DD
     * click search
     * quit the browser
     * user name: admin
     * password: Hum@nhrm123
     */
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        driver.findElement(By.linkText("Leave List")).click();
        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();//click on calendar btn

        //pick day
        String day = "5";

        Select monthDD = new Select(driver.findElement(By.xpath("//select[@class = 'ui-datepicker-month']")));
        monthDD.selectByVisibleText("Nov");
        Select yearDD = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        yearDD.selectByVisibleText("2000");

        List<WebElement> day1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement element:day1){
            String e = element.getText();
            if(e.equals(day)){
                element.click();
            }
        }
        driver.findElement(By.xpath("//input[@id='calToDate']")).click();//click on calendar btn

        Select monthD = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        monthD.selectByVisibleText("Dec");
        Select yearD = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        yearD.selectByVisibleText("2022");
        List<WebElement> day2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'][1]//td"));
        for(WebElement element:day2){
            String e = element.getText();
            if(e.equals(day)){
                element.click();
            }
        }

        WebElement rejected = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_-1']"));
        rejected.click();
        WebElement canceled = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']"));
        canceled.click();
        WebElement pendingApproval = driver.findElement(By.xpath("(//input[@id='leaveList_chkSearchFilter_1'])[1]"));
        pendingApproval.click();

        Select dropDown = new Select(driver.findElement(By.id("leaveList_cmbSubunit")));
        dropDown.selectByVisibleText("IT Support");

        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='btnSearch']"));
        searchBtn.click();

    }
}
