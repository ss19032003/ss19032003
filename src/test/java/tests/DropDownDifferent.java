package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownDifferent {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws Exception {

        selectByTextTest();
        selectByValueTest();
        selectByIndex();
        multipleSelectDropDownTest();

    }

    public static void setup() throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    public static void selectByTextTest() throws Exception {
        setup();
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        driver.close();
    }

    public static void selectByValueTest() throws Exception {
        setup();
        Thread.sleep(3000);
        Select select1 = new Select(driver.findElement(By.id("state")));
        select1.selectByValue("DC");
        Thread.sleep(3000);

        String expected = " District Of Columbia ";
        String actual = select1.getFirstSelectedOption().getText();
        System.out.println(expected);
        System.out.println(actual);
        System.out.println(expected==actual);
        driver.close();

    }

    public static void selectByIndex () throws Exception {
        setup();
        Thread.sleep(3000);
        Select select2 = new Select(driver.findElement(By.id("state")));
        select2.selectByIndex(2);
        Thread.sleep(3000);


    }

    public static void multipleSelectDropDownTest() throws Exception {
        setup();
        Thread.sleep(3000);

        Select select = new Select(driver.findElement(By.name("Languages")));

        List<WebElement> options = select.getOptions();

        for (WebElement option: options) {
            Thread.sleep(3000);
            select.selectByVisibleText(option.getText());
        }

        Thread.sleep(3000);
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option: selectedOptions){
            System.out.println(option.getText());
        }
        Thread.sleep(3000);
        select.deselectAll();
        Thread.sleep(3000);
        driver.close();

    }
}
