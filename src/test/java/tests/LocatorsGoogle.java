package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsGoogle {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://google.com");

        WebElement A1 = driver.findElement(By.className("gb_t"));
        System.out.println(A1.getText());
        A1.click();
        WebElement A2 = driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
        System.out.println(A2.getText());
        A2.click();
        WebElement A3 = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span"));
        System.out.println(A3.getText());
        A3.click();
        WebElement A4 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        System.out.println(A4.getText());
        A4.click();
        A4.sendKeys("sirshalim");
        WebElement A5 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        A5.click();
        Thread.sleep(3000);
        driver.quit();

        // <span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>

        // /html/body/header/div/div/div/a[2]



    }
}
