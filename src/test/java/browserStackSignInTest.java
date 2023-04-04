import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class browserStackSignInTest {


    @Test
    public void logInToBrowserstack(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        //Navigate to Browserstack,com and maximize browser window
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();

        //Locate sign in button and click on it
        driver.findElement(By.xpath("//a[@title='Sign In'][1]")).click();

        //locate username and Password fields and enter the credentials
        driver.findElement(By.id("user_email_login")).sendKeys("info@scratchtechsolutions.com");
        driver.findElement(By.id("user_password")).sendKeys("Surma2009?");

        //Locate the sign me in button and click on it
        driver.findElement(By.xpath("//input[@type='submit'][1]")).click();

        //close the browser
        driver.quit();
    }
}
