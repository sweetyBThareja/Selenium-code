package com.sweety.automation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumGrid {
    public static void main(String args[]) throws Throwable{

        WebDriver driver;
        String url = "https://www.google.co.in";
        String node = "http://192.168.1.4:4444/wd/hub";
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setVersion("65");
        driver = new RemoteWebDriver(new URL(node), capabilities);
        driver.navigate().to(url);
        driver.quit();
    }
}
 //http://localhost:4444/grid/console
//java -jar selenium-server-standalone-2.41.0.jar -role node -hub
//start node: java -jar selenium-server-standalone-3.3.1.jar -role node -hub http://192.168.1.164:4444/grid/register -port 5555

