package com.cbt.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowserFactory {
    public static WebDriver getDriver (String browser){

        WebDriver driver=null;
        if (browser.toLowerCase().equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if
            (browser.toLowerCase().equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.toLowerCase().equalsIgnoreCase("edge")){

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();


        }
        return driver;
    }





}
