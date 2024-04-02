package seleniumproject;

import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest 
{


    @Test
    public void test() throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
     
        driver.get("https://demoqa.com/");

        JavascriptExecutor down= (JavascriptExecutor) driver;
        down.executeScript("window.scrollBy(0,300)", "null");

        WebElement elements = driver.findElement(By.xpath("//div[@class='category-cards']/div[@class='card mt-4 top-card']/div[.='Elements']"));
        elements.click();

        WebElement webTables =driver.findElement(By.xpath("//li[.='Web Tables']"));
        webTables.click();

        

        Thread.sleep(300);

        JavascriptExecutor up= (JavascriptExecutor) driver;
        up.executeScript("window.scrollBy(0,-400)", "null");

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement registiration = driver.findElement(By.id("registration-form-modal"));
        System.out.println("register sayfası geldi.");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("ilo");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("milo");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("ilo@milo.com");

        WebElement age = driver.findElement(By.id("age"));
        age.click();
        age.sendKeys("29");;

        WebElement salary = driver.findElement(By.id("salary"));
        salary.click();
        salary.sendKeys("85k");

        WebElement department = driver.findElement(By.id("department"));
        department.click();
        department.sendKeys("IT-Quality Engineer");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();


        driver.quit();


 }
}