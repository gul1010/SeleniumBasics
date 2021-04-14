package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//for windows .exe needs to be added

        WebDriver driver=new ChromeDriver();//launch actual browser
        driver.get("https://www.google.com/");//navigate to the specified url
        String url=driver.getCurrentUrl();//getting current url
        System.out.println(url);
        String title = driver.getTitle();//getting the title of the page
        System.out.println(title);
        driver.quit();

    }
}