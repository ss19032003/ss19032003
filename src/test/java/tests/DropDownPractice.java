package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        // select by id

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        select.selectByVisibleText("Option 2");

        // select by value

        Select select1 = new Select(driver.findElement(By.id("state")));
        select1.selectByValue("DC");
        Thread.sleep(3000);
        String expected = "District Of Columbia";
        String actual = select1.getFirstSelectedOption().getText();
        System.out.println("Expected:"+expected);
        System.out.println("Actual:"+actual);
        if (expected==actual){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        // select by index

        Select select2 = new Select(driver.findElement(By.id("state")));
        select2.selectByIndex(2);
        Thread.sleep(3000);
        String expected1 = "Alabama";
        String actual1 = " Alaska ";
        System.out.println("Expected:"+expected1);
        System.out.println("Actual:"+actual1);
        System.out.println(expected1==actual1);

        Select select3 = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options = select3.getOptions();

        for (WebElement option: options) {
            Thread.sleep(3000);
            select3.selectByVisibleText(option.getText());
        }

        Thread.sleep(3000);

        List<WebElement> selectedOptions = select3.getAllSelectedOptions();
        for (WebElement option: selectedOptions){
            System.out.println(option.getText());
        }
        Thread.sleep(3000);
        select3.deselectAll();

        WebElement dropdown = driver.findElement(By.id("dropdownMenuLink"));
        WebElement option2 = driver.findElement(By.xpath("//a[text()='Amazon']"));
       
        dropdown.click();
        Thread.sleep(3000);
        option2.click();


        Thread.sleep(3000);
        driver.quit();


    }
}
