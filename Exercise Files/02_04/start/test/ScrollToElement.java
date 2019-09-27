import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/luigimoro/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name =driver.findElement(By.id("name"));
        Actions actions =new Actions(driver);
        actions.moveToElement(name);
        Thread.sleep(1000);
        name.sendKeys("LUIGI MORO");
        Thread.sleep(1000);

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("26/09/2019");
        Thread.sleep(1000);


        driver.quit();
    }
}
