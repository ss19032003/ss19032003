package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByCSS {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        WebElement A1 = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[41]/a"));
        System.out.println(A1.getText());
        A1.click();
        WebElement A2 = driver.findElement(By.cssSelector("input[name='firstname']"));
        A2.sendKeys("Salim");
        System.out.println(A2.getText());
        WebElement A3 = driver.findElement(By.cssSelector("input[name='lastname'"));
        A3.sendKeys("Caliskan");
        Thread.sleep(3000);
        driver.close();

        // #registrationForm > div:nth-child(1) > div > input
        // <input type="text" class="form-control" name="firstname" placeholder="first name" data-bv-field="firstname">
        // document.querySelector("#registrationForm > div:nth-child(1) > div > input")

        // <a href="/registration_form">Registration Form</a>
    }
}
