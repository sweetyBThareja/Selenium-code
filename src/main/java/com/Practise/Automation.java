package com.Practise;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Automation {
    static WebDriver driver = null;


    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "\\D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("http://www.google.co.in");
//        Assert.assertEquals(driver.getTitle(), "Google");
        //Textbox:

//        driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
//        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hdtb-msb-vis")));
//        wait.until(ExpectedConditions.titleContains("selenium webdriver - Google Search"));
//
//        //Select random links
//
//        List<WebElement> list = driver.findElements(By.tagName("a"));
//        System.out.println(list.size());
//        //click on first link
//        list.get(0).click();
//        for(WebElement ele : list){
//            System.out.println(ele.getText());
//        }
//
//        Random random = new Random();
//        list.get(random.nextInt(list.size())).click();

        //Dropdown:
//        driver.get("http://www1.macys.com/internationalContext/index.ognc");
//        WebElement ele = driver.findElement(By.id("shippingCountry"));
//        Select drpCountry = new Select(ele);
//        drpCountry.selectByIndex(1);
//        drpCountry.selectByVisibleText("India");
//        drpCountry.selectByValue("AD");
//        System.out.println(drpCountry.getFirstSelectedOption().getText());
//
//        for(WebElement option : drpCountry.getOptions()){
//            System.out.println(option.getText());
//        }
//
//        System.out.println(drpCountry.isMultiple());
//        drpCountry.selectByIndex(2);
//        drpCountry.selectByIndex(4);
//        drpCountry.deselectByIndex(2);
//        drpCountry.deselectAll();


        //Alert:
//        driver.get("https://www.irctc.co.in");
//        driver.findElement(By.id("loginbutton")).click();
//        Alert alert = driver.switchTo().alert();
//        String message = alert.getText();
//        alert.accept();
//        System.out.println(message);

        //Popup:
//        driver.get("https://www.hdfcbank.com/");
////        driver.findElement(By.id("div-close")).click();
//        driver.findElement(By.id("loginsubmit")).click();
//        String parent = driver.getWindowHandle();
//        Set<String> list = driver.getWindowHandles();
//        Iterator<String> ite = list.iterator();
//        while(ite.hasNext()){
//            String child = ite.next();
//            if(parent!=child) {
//                driver.switchTo().window(child);
//                driver.close();
//            }
//        }

        //checkbox:
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        JavascriptExecutor js = ((JavascriptExecutor)driver);
//        js.executeScript("window.scrollTo(400,400)");
//        driver.findElement(By.className("Performance")).click();

        //Radio:
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        JavascriptExecutor js = ((JavascriptExecutor)driver);
//        js.executeScript("window.scrollTo(300,300)");
//        driver.findElement(By.id("female")).click();


        //Actions
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
        //Double click:
//        Actions action  =  new Actions(driver);
//        WebElement ele = driver.findElement(By.id("dblClkBtn"));
//        action.doubleClick(ele).perform();

        //Mouse hover:
//        WebElement ele = driver.findElement(By.id("idOfButton"));
//        action.moveToElement(ele).perform();

        //Drag and drop:
//        WebElement source = driver.findElement(By.id("sourceImage"));
//        WebElement target = driver.findElement(By.id("targetDiv"));
//        action.dragAndDrop(source, target).perform();

        //Right click:
//        WebElement ele = driver.findElement(By.id("fname"));
//        action.contextClick(ele).perform();

        //upload a file:
//        driver.get("http://demo.guru99.com/test/upload/");
//        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\skumari.OSIUS\\Desktop\\aa.pdf");


      //Download a file:
//        FirefoxOptions option = new FirefoxOptions();
//        option.addPreference("browser.download.dir", "D:\\sweety");
//        option.addPreference("browser.download.folderList", 2);
//        option.addPreference("browser.download.manager.showWhenStarting", false);
//        option.addPreference("browser.helperApps.neverAsk.openFile", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" + "text/csv;" + "application/xml;" + "text/csv;" + "application/zip;" + "application/pdf;" + "application/octet-stream;");
//        option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" + "text/csv;" + "application/xml;" + "text/csv;" + "application/zip;" + "application/pdf;" + "application/octet-stream;");
//        option.addPreference("pdfjs.disabled", true);
//        System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
//        driver = new FirefoxDriver(option);
////
//
//        driver.get("https://filehippo.com/download_opera/");
//        driver.findElement(By.cssSelector("a.long.download-button")).click();

        //SSL certificate error:
        //chrome:
//        ChromeOptions option = new ChromeOptions();
//        option.setCapability("acceptInsecureCerts", true);
//        //or
////        option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        driver = new ChromeDriver(option);
//        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
//        driver.get("https://www.cacert.org/");
//
//        //firefox
//        FirefoxOptions option1 = new FirefoxOptions();
//        option1.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
//        driver = new FirefoxDriver(option1);
//        driver.get("https://www.cacert.org/");

        //Broken link:
        driver.get("https://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for(WebElement ele : list){
            String link = ele.getAttribute("href");
            brokenLink(link);
        }









//        driver.close();

    }

    public static void brokenLink(String link){
        try{
            URL url = new URL(link);
            /*The URL represents the remote object on the World Wide Web to which this connection is opened. */
            HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
            httpUrlConnect.setConnectTimeout(1000);
            /*URLConnection objects go through two phases: first they are
     * created, then they are connected.*/
            httpUrlConnect.connect();
            if(httpUrlConnect.getResponseCode()==200){
                System.out.println("valid url" + httpUrlConnect.getResponseMessage());
            }else{
                System.out.println("Broken link");
            }

        }catch(IOException e){
            System.out.println(e);
        }

    }


}
