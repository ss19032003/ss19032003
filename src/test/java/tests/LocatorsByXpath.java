package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        WebElement A1 = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[12]/a"));
        System.out.println(A1.getText());
        A1.click();
        WebElement A2 = driver.findElement(By.id("dropdownMenuLink"));
        System.out.println(A2.getText());
        Thread.sleep(5000);
        driver.close();
        // //*[@id="content"]/ul/li[12]/a

        // <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        //    Dropdown link
        //  </a>

    }


}
