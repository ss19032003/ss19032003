package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        /* WebElement CH0 = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a"));
        CH0.click();
        System.out.println(CH0.getText());
        Thread.sleep(5000);

        /*
        WebElement CH1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/span[1]"));
        CH1.click();
        System.out.println(CH1.getText());
        Thread.sleep(3000);
        WebElement CH2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/span[2]"));
        System.out.println(CH2.getText());
        CH2.click();

        if (!CH1.isSelected()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        if (CH2.isSelected()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        Thread.sleep(2000);
        CH1.click();
        Thread.sleep(2000);
        CH2.click();

        if (!CH1.isSelected()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        if (!CH2.isSelected()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
           */

        // in stead of doing one by one like above we can do list elements and find all elements with tage name input

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));


        //List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        // loop through this list of elements

        for (WebElement checkbox: checkboxes){
            Thread.sleep(3000);

            // if checkbox is not selected yet
            if (!checkbox.isSelected()){
                // select it
                checkbox.click();
            }
        }

        driver.quit();


        // WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        // WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        // //*[@id="checkboxes"]/span[1]


    }
}
