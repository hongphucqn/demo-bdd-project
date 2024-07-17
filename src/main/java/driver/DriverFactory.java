package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    //Option 4: Auto-downloads by Selenium Java version >= 4.11.0
    public static WebDriver getChromeDriver322(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(options); //Need Selenium Java ver >= 4.11.0
    }
}