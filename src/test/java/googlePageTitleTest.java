import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class googlePageTitleTest {

    @Test
    public void captureTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
        String googleTitle = driver.getTitle();
        System.out.println("The google page title is :" + googleTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
}



