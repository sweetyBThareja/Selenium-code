package com.Practise;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpConnection;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.sql.*;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AutomationPractise1 {
   static WebDriver driver;
   static Connection con;
    public static void main(String args[]) throws InterruptedException, IOException {
        //Launch:
        System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//         driver.manage().window().setPosition(new Point(300,400));
//         driver.manage().window().setSize(new Dimension(400,500));
//         driver.get("http://www.google.com");
//         driver.findElement(By.id("lst-ib")).sendKeys("Selenium Webdriver");
//         driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
//
//         List<WebElement> links = driver.findElements(By.tagName("a"));
//         for(WebElement li : links){
//             String link = li.getAttribute("href");
//           //  brokenLink(link);
//         }
//         Thread.sleep(5000);
//
//         System.out.println(links.get(0).getText());
//        links.get(0).click();
//        driver.findElement(By.xpath("//a[contains(text(),'Selenium WebDriver')]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.titleContains("Selenium WebDriver"));
//        Assert.assertEquals(driver.getTitle(), "Selenium WebDriver");
//        driver.findElement(By.cssSelector("li#menu_projects a")).click();
//        wait.until(ExpectedConditions.titleContains("Selenium Projects"));
//        List<WebElement> links = driver.findElements(By.xpath("//h3/a"));
//        links.get(new Random().nextInt(links.size() - 1)).click();
//        driver.navigate().back();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0,0)");
//        int i = 0;
//        while (i < 2) {
//            try {
//                links.get(0).click();
//                break;
//            } catch (StaleElementReferenceException e) {
//                driver.navigate().refresh();
//            }
//            i++;
//        }

//        //dropdown:
//        driver.get("http://toolsqa.com/automation-practice-form/");
//        WebElement drpDown = driver.findElement(By.id("selenium_commands"));
//        Select drpCountry = new Select(drpDown);
//        drpCountry.selectByIndex(0);
//        //drpCountry.selectByValue("Navigation Commands");
//        drpCountry.selectByVisibleText("Navigation Commands");
//        List<WebElement> options = drpCountry.getOptions();
//        options.get(new Random().nextInt(options.size()-1)).click();
//        System.out.println(drpCountry.getFirstSelectedOption().getText());
//        driver.findElement(By.id("photo")).sendKeys("E:\\all_data\\interview_docs\\ruby_ques.txt");
//        driver.findElement(By.id("tool-2")).click();
//        js.executeScript("document.getElementById('exp-2').click();");
//
//        //If multiple
//        if(drpCountry.isMultiple()){
//            drpCountry.selectByVisibleText("Navigation Commands");
//            drpCountry.selectByIndex(4);
//            drpCountry.deselectByIndex(4);
//            drpCountry.deselectAll();
//        }

        //Element within element:
//        WebElement ele = driver.findElement(By.id(""));
//        ele.findElement(By.tagName("a"));

        //Alert:
//        driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
//        driver.findElement(By.xpath("//span[contains(text(),'AGENT LOGIN')]")).click();
//        js.executeScript("document.getElementById('loginbutton').click();");
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        //Frames:
//        WebElement ele = driver.findElement(By.id("frame"));
//        driver.switchTo().frame(0);
//        driver.switchTo().frame("iframe");
//        driver.switchTo().frame(ele);
//        for(int i =0; i < 100; i++){
//            driver.switchTo().frame(i);
//        }
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

        //popup:
//        driver.get("https://www.hdfcbank.com/");
//        driver.findElement(By.id("loginsubmit")).click();
//        String parent = driver.getWindowHandle();
//        Set<String> windows = driver.getWindowHandles();
//        for(String child : windows){
//            if(!parent.equals(child)){
//                driver.switchTo().window(child);
//                driver.findElement(By.xpath("//a[contains(text(),'Continue to NetBanking')]")).click();
//                driver.close();
//            }
//        }
//        driver.switchTo().window(parent);

        //Actions:
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        Actions action = new Actions(driver);
//        WebElement ele = driver.findElement(By.id("dblClkBtn"));
//        action.doubleClick(ele).perform();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        action.contextClick(driver.findElement(By.id("fname"))).perform();
//        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'This is a link')]"))).perform();
//        WebElement src = driver.findElement(By.id("sourceImage"));
//        WebElement tar = driver.findElement(By.id("targetDiv"));
//        action.dragAndDrop(src,tar).perform();

        //Save Screenshot:
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("E:\\all_data\\" + "ss1" + ".png"));

        //navigate:
//        driver.navigate().to("");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

        //Grid:
//        String node = "http://192.168.1.4:4444/wd/hub";
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setBrowserName("chrome");
//        capabilities.setPlatform(Platform.WINDOWS);
//        capabilities.setVersion("63");
//        WebDriver driver = new RemoteWebDriver(new URL(node), capabilities);
//        driver.get("");

        //Add Extension:
      //  ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("E:\\all_data\\Momentum_v0.101.2.crx"));
//        WebDriver driver1 = new ChromeDriver(options);

        //SSL:
//        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        WebDriver driver1 = new ChromeDriver(options);
//        System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
//        driver1.get("https://www.cacert.org/");

//        FirefoxOptions option1 = new FirefoxOptions();
//        option1.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
//        WebDriver driver2 = new FirefoxDriver(option1);
//        driver2.get("https://www.cacert.org/");

        //Download a file:
//        FirefoxOptions options = new FirefoxOptions();
//        options.addPreference("browser.download.dir", "E:\\Download");
//        options.addPreference("browser.download.folderList", 2);
//        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" + "text/csv;" + "application/xml;" + "text/csv;" + "application/zip;" + "application/pdf;" + "application/octet-stream;");
//        options.addPreference("browser.helperApps.neverAsk.openFile", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" + "text/csv;" + "application/xml;" + "text/csv;" + "application/zip;" + "application/pdf;" + "application/octet-stream;");
//        options.addPreference("pdfjs.disabled", true);
//        System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver(options);
//        driver1.get("https://filehippo.com/download_opera/");
//        driver1.findElement(By.cssSelector("a.long.download-button")).click();
//        File fi = new File("E:\\Download\\OperaSetup.exe");
//        if(fi.exists()){
//            System.out.println("File Downloaded");
//        }else {
//            System.out.println("File not downloaded");
//        }

//        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
//        driver.findElement(By.id("datepicker")).click();
//        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
//        for(WebElement d: dates){
//            if(d.getText().equals("24")){
//                d.click();
//                break;
//            }
//        }

//       driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
//        System.out.println(driver.findElement(By.xpath("//th[contains(text(),'Clock Tower Hotel')]//following-sibling::td[2]")).getText());
//        driver.findElement(By.xpath("//th[contains(text(),'Taipei 101')]//following-sibling::td/a")).click();

        //Proxy p = new Proxy();

       // quit();
    }

    public static void quit(){
        driver.close();
    }

    public static void brokenLink(String link){
        try {
            URL url = new URL(link);
            HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
            httpUrlConnect.connect();
            if(httpUrlConnect.getResponseCode()==200){
                System.out.println("Valid link" + link);
            }else{
                System.out.println("Invalid link" + link);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void dbTesting() throws SQLException{
        try{
            String user = "test@123";
            String pwd = "Osi@123";
            String url = "jdbc:mysql://192.168.32.207:3036/osidb";
            con = DriverManager.getConnection(url, user, pwd);
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from employee");
            while (res.next()){
                String code = res.getString("hexcode");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (con != null)
            con.close();
        }
    }
}
