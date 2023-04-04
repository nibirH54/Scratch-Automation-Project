package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgMultiBrowserDemo {

    WebDriver driver = null;

    @Parameters("browserName")
    @BeforeTest
    public void setUp(String browserName){
        System.out.println("Browser name is :" + browserName);


        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }

    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(4000);

    }

    @AfterTest
    public void tearDown(){
        driver.close();
        System.out.println("Test completed Successfully");

    }

}
