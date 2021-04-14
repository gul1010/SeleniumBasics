package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");//two different ways to launch
        driver.navigate().to("https://google.com");//another way
        Thread.sleep(1000);
        driver.navigate().back();//go facebook and go chrome and go back facebook
        Thread.sleep(1000);
        driver.navigate().forward();//go facebook, then google, then facebook and back to google
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.quit();
        driver.close();
    }
}
