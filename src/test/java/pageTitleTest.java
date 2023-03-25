import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pageTitleTest {
    @Test(priority = 1)
    public void captureTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("http://www.google.com/");
        String googleTitle = driver.getTitle();
        System.out.println("The Page Title of Google is : " +  googleTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
    @Test(priority = 2)
    public void captureAmazonTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.amazon.com/");
        String amazonTitle = driver.getTitle();
        System.out.println("The title of Amazon is :" + amazonTitle);
        driver.manage().window().maximize();
        driver.quit();

    }
    @Test(priority =3)
    public void captureExpediaPageTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.expedia.com/");
        String expediaTitle = driver.getTitle();
        System.out.println("The expedia page title is :" + expediaTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
    @Test(priority = 4)
    public void captureKayakPageTitle(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.kayak.com/");
        String kayakTitle = driver.getTitle();
        System.out.println("The Title of Kayak is :" + kayakTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
    @Test(priority = 5)
    public void bookingPageTitleTest(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.booking.com/");
        String bookingTitle = driver.getTitle();
        System.out.println("The booking.com Page Title is :" + bookingTitle);
        driver.manage().window().maximize();
        driver.quit();
    }
}


