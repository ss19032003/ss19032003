package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsByName {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        /* WebElement button2 = driver.findElement(By.name("button2"));
        button2.click();
        System.out.println(button2.getText());
        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());
        Thread.sleep(3000); */

        WebElement button2 = driver.findElement(By.name("button2"));
        button2.click();
        System.out.println(button2.getText());
        WebElement result = driver.findElement(By.id("result"));
        Thread.sleep(3000);
        driver.close();

        //<button class="btn btn-primary" onclick="button1()">Button 1</button>

        // <a href="/add_remove_elements/">Add/Remove Elements</a>
    }


}

