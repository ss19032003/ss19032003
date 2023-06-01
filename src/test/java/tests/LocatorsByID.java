package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsByID {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        // <a class="gb_ma gb_id gb_Md gb_1d" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top"><span class="gb_Kd">Sign in</span></a>
        //btn1.click();
        Thread.sleep(5000);
        String actualText = btn1.getAttribute("value");
        String expectedText = "I'm Feeling Lazy";
        if (actualText.equals(expectedText)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected Text: " + expectedText);
            System.out.println("Actual Text:" + actualText);
        }
        driver.close();




    }
}
