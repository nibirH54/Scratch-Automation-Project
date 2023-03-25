import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleSearchTest {


    @Test
   public void GoogleSearchTest1(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

       WebElement m = driver.findElement(By.name("q"));
       m.sendKeys("CNBC Office Address");
       m.sendKeys(Keys.ENTER);
       driver.navigate().back();

       m.sendKeys("Apple Headquarter address");
       m.sendKeys(Keys.ENTER);
       driver.navigate().back();

       m.sendKeys("How old is Elon mask");
       m.sendKeys(Keys.ENTER);
       driver.navigate().back();
       driver.quit();
    }

}
