import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

    @Test
    public  void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");


        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("ilo milo");
    }
    
}
