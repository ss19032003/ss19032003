package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsByTagName {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com");
        

        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println(h2.getText());
        WebElement h3 = driver.findElement(By.tagName("li"));
        System.out.println(h3.getText());
        Thread.sleep(5000);
        driver.close();
    }
}
