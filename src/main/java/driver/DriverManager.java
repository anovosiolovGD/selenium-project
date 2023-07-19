package driver;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DriverManager {
//    private static WebDriver driver;
//
//    private static void setDriver() {
//        driver = new ChromeDriver(WebDriverConfig.configChrome());
//    }
//
//    public static WebDriver getDriver() {
//        if (driver == null) setDriver();
//        return driver;
//    }
//
//    public static void closeDriver(){
//        driver.close();
//    }
//
//    public static void clearAllCookies(){
//        driver.manage().deleteAllCookies();
//    }
//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static WebDriver driver;

    private static void setDriver() {
        driver = new FirefoxDriver(WebDriverConfig.configFirefox());
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void clearAllCookies() {
        driver.manage().deleteAllCookies();
    }
}


