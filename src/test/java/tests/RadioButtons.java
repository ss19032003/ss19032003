package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(3000);

        // driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//label[text()='Green')]/preceding-sibling::input")).click();
        //Thread.sleep(3000);

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement radio: radioButtons){

            System.out.println(radio.getAttribute("name"));

            //System.out.println(radio.getText()+"-"+radio.isEnabled());
        }
        Thread.sleep(3000);
        driver.quit();

        /* driver.findElement(By.id("yellow")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("football")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("water_polo"));
        /*
         */


    }
}
