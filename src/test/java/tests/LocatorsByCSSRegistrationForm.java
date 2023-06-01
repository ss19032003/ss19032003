package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsByCSSRegistrationForm {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Salim");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Caliskan");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sirshalim@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("bjk1903kartal");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("412-330-9083");
        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title")));
        driver.findElement(By.cssSelector("input[value='male']"));
        select.selectByVisibleText("SDET");
        Thread.sleep(3000);
        driver.quit();





    }
}
