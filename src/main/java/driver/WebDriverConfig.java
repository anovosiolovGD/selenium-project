package driver;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.BrowserType;
//import org.openqa.selenium.remote.CapabilityType;
//
//public class WebDriverConfig {
//    public static ChromeOptions configChrome (){
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//
//        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS , true);
//        options.addArguments("--remote-allow-origins=*");
//
//        return options;
//    }
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverConfig {
    public static FirefoxOptions configFirefox() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


        return options;
    }
}

