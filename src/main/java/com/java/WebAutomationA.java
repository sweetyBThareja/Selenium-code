package com.java;


//import org.apache.commons.io.FileUtils;
import org.apache.http.HttpConnection;
//import org.junit.Assert;
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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

//import static org.junit.Assert.assertEquals;

public class WebAutomationA {
    //Launching a browser:
    public static void main(String... args) throws IOException, InterruptedIOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver/chromedriver.exe");
//        //Handled SSL Certificate error in chrome
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        WebDriver driver = new ChromeDriver(capabilities);
        WebDriver driver = new ChromeDriver();
//
        //Download a file in ff
//        FirefoxOptions option = new FirefoxOptions();
//        //Set the location after downloading the file
//        option.addPreference("browser.download.dir", "D:\\sweety");
//        option.addPreference("browser.download.folderList", 2);
//        //Set preference not to show file download confirmation dialogue
//        option.addPreference("browser.download.manager.showWhenStarting", false);
//        option.addPreference("browser.helperApps.neverAsk.openFile", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" + "text/csv;" + "application/xml;" + "text/csv;" + "application/zip;" + "application/pdf;" + "application/octet-stream;");
//        option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;" + "text/csv;" + "application/xml;" + "text/csv;" + "application/zip;" + "application/pdf;" + "application/octet-stream;");
//        option.addPreference("pdfjs.disabled", true);
//        System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
//        driver = new FirefoxDriver(option);
//        driver.get("https://filehippo.com/download_opera/");
//        driver.findElement(By.cssSelector("a.long.download-button")).click();

        //Add extensions in chrome
//        ChromeOptions option = new ChromeOptions();
//        option.addExtensions(new File("D:\\Momentum_v0.101.2.crx"));
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY,option);
//        WebDriver driver = new ChromeDriver(option);

        //        WebDriver driver = new FirefoxDriver(profile);
        //Handle SSL Certificate error in ff
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        WebDriver driver = new FirefoxDriver(capabilities);
        //Set Browser Size
        driver.manage().window().setPosition(new Point(400, 1500));
//        Dimension dimension = new Dimension(300,1300);
//        driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();

        //Click on link
//       driver.get("http://seleniumhq.org");
//       driver.findElement(By.cssSelector("li#menu_projects>a")).click();
//       String text = driver.findElement(By.xpath("//a[contains(text(),'Selenium WebDriver')]")).getText();
//       System.out.println(text);
//       driver.findElement(By.id("menu_about")).click();
//       String name = driver.findElement(By.cssSelector("li#menu_about>a")).getAttribute("href");
//       System.out.println(name);
//       WebElement ele = driver.findElement(By.cssSelector("div#mainContent>h3"));
//       List<WebElement> lists = ele.findElements(By.tagName("a"));
//       lists.get(0).click();

        //dropdown
//        driver.get("https://www.crateandbarrel.com/gift-registry/");
//        Thread.sleep(10000);
//        driver.findElement(By.className("country-flag")).click();
//        String parent = driver.getWindowHandle();
//        driver.switchTo().window(parent);
//        Thread.sleep(10000);
//        Select drpdwn = new Select(driver.findElement(By.id("ddCountry")));
//        drpdwn.selectByIndex(3);
//        drpdwn.selectByVisibleText("Japan");
//        Thread.sleep(10000);
//        drpdwn.selectByValue("GB|GBP");
//        driver.findElement(By.id("btn-ship-to-usa")).click();
//        driver.navigate().to("https://www.crateandbarrel.com/gift-registry/");
//        Select drpdwns = new Select(driver.findElement(By.id("EventTypeCode")));
//        drpdwns.selectByIndex(3);
//        drpdwns.selectByVisibleText("Commitment Ceremony");
//        drpdwns.selectByValue("BD");
//        String selectedOptions = drpdwns.getFirstSelectedOption().getText();
//        System.out.println(selectedOptions);
//        for(WebElement option : drpdwns.getOptions()){
//            System.out.println(option.getText());
//        }


        //Textbox
//        driver.get("https://www.flipkart.com/");
//        String title = driver.getTitle();
//        assertEquals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More", title);
//        String parent = driver.getWindowHandle();
//        driver.switchTo().window(parent);
//        driver.findElement(By.cssSelector("button._2AkmmA._29YdH8")).click();
//        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mi max");
//        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);

        //Flyout Menu and Link within flyout


      //Elements within element / Elements within element
//        driver.get("http://seleniumhq.org");
//        driver.findElement(By.id("menu_about")).click();
//        WebElement e = driver.findElement(By.cssSelector("div#mainContent>h3"));
//        WebElement ele = e.findElement(By.xpath("//a[contains(text(),'Selenium Events')]"));
//        List<WebElement> list = driver.findElements(By.tagName("a"));
//        for(WebElement s : list){
//            System.out.println(s.getText());
//        }
//        Random random = new Random();
//        list.get(random.nextInt(list.size())).click();


    //Popup
//        driver.get("https://www.flipkart.com/");
//        String parent = driver.getWindowHandle();
//        driver.switchTo().window(parent);
//
//        Set<String> windows = driver.getWindowHandles();
//        Iterator<String> ite = windows.iterator();
//        while(ite.hasNext()){
//            String childWindow = ite.next();
//            driver.switchTo().window(childWindow);
//            driver.close();
//        }

     //Alert
//        driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
//        driver.findElement(By.id("usernameId")).sendKeys("swtbarnwal");
//        driver.findElement(By.cssSelector(("input.loginPassword"))).sendKeys("skm220");
//        driver.findElement(By.id("loginbutton")).click();
//
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        alert.dismiss();

        //checkbox
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        JavascriptExecutor exe = (JavascriptExecutor)driver;
//        exe.executeScript("scrollTo(400,400)");
//        driver.findElement(By.cssSelector("input.Automation")).click();

      //Radio button
//        driver.findElement(By.id("male")).click();

     //Actions

//        Actions action = new Actions(driver);
      //Right click

//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        WebElement ele = driver.findElement(By.id("fname"));
//        action.contextClick(ele).perform();

       //Double click
//        WebElement ele = driver.findElement(By.id("dblClkBtn"));
//        action.doubleClick(ele).perform();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();

      //Mouse hover
//        WebElement ele = driver.findElement(By.id("dblClkBtn"));
//        action.moveToElement(ele).perform();

      //Drag and Drop
//        JavascriptExecutor exe = (JavascriptExecutor)driver;
//        exe.executeScript("window.scrollTo(1100,1100)");
//        WebElement source = driver.findElement(By.id("sourceImage"));
//        WebElement target = driver.findElement(By.id("targetDiv"));
//        action.dragAndDrop(source, target).perform();
//        System.out.print(source.isDisplayed());

     //Wait
//        driver.get("http://www.seleniumhq.org/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(By.id("menu_projects")).click();
//        Assert.assertEquals(driver.getTitle(), "Selenium Projects");
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3/a[contains(text(),'Selenium WebDriver')]")));
//        driver.findElement(By.xpath("//h3/a[contains(text(),'Selenium WebDriver')]")).click();

     //navigate
//        driver.get("https://www.google.com");
//        driver.navigate().to("http://www.seleniumhq.org/");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.findElement(By.id("menu_projects")).click();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();


     //Upload a file
//        driver.get("http://demo.guru99.com/test/upload/");
//        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\skumari.OSIUS\\Desktop\\aa.pdf");

     //Download a file -- working fine in ff
//        driver.get("https://filehippo.com/download_opera/");
//        driver.findElement(By.cssSelector("a.program-header-download-link.green")).click();
//        Thread.sleep(5000);
//        File fi = new File("D:\\Download\\OperaSetup.exe");
//        if(fi.exists()){
//            System.out.println("File downloaded successfully");
//        }else {
//            System.out.println("File has not downloaded");
//        }

     //Save Screenshot
      //Single screenshot
//     try{
//         File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         FileUtils.copyFile(src, new File("D:\\screenshot\\" + ".png"));
//
//     }catch(IOException e){
//         e.printStackTrace();
//     }

      //Multiple screenshot
//        driver.get("http://www.seleniumhq.org/");
//        int index = 1;
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        Boolean check = (Boolean)js.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight");
//        Long scrollH = (Long)js.executeScript("return document.documentElement.scrollHeight");
//        Long clientH = (Long)js.executeScript("return document.documentElement.clientHeight");
//        if(check.booleanValue()){
//            while(scrollH>clientH){
//                try{
//                    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                    FileUtils.copyFile(src, new File("D:\\screenshot\\" + ".png"));
//                    js.executeScript("window.scrollBy(0, " + clientH * index + ")");
//                    index++;
//                }catch(Exception e){
//                    e.printStackTrace();
//                }

//            }
//        }

     //SSL certificate error -- above
     //Broken Link
//        driver.get("https://www.google.com");
//      driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
//      driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
//      WebDriverWait wait = new WebDriverWait(driver, 30);
//      wait.until(ExpectedConditions.titleContains("selenium webdriver - Google Search"));
//      Assert.assertEquals(driver.getTitle(), "selenium webdriver - Google Search");
//      List<WebElement> list = driver.findElements(By.tagName("a"));
//      System.out.println(list.size());
//      for(WebElement wele : list){
//          String url = wele.getAttribute("href");
//          System.out.println(url);
//          verifyBrokenImage(url);
//      }

      //Broken Image
       //Same as broken link only tagName("img")

//     //Frame
//
//      driver.get("http://demo.guru99.com/test/guru99home/");
//      driver.switchTo().frame("a077aa5e");
//      driver.switchTo().frame(0);
//      driver.findElement(By.xpath("html/body/a/img")).isDisplayed();
////      driver.switchTo().defaultContent();
//      driver.switchTo().parentFrame();
//      driver.findElement(By.id("philadelphia-field-email")).sendKeys("selenium webdriver");

        //Typed text of textbox
//        driver.get("https://www.flipkart.com/");
//        String text = driver.findElement(By.className("LM6RPg")).getAttribute("placeholder");
//        System.out.println(text);

      //Calendar
//        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
//        driver.findElement(By.id("datepicker")).click();
//        List<WebElement> list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//        for(WebElement date : list){
//            System.out.println(date.getText());
//            String datee = date.getText();
//            if(datee.equalsIgnoreCase("8")){
//                date.click();
//                break;
//            }
//        }


//    //Table element:
//        driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
//        WebElement ele = driver.findElement(By.cssSelector("table.tsc_table_s13 tbody tr th"));
//        WebElement ele1 = driver.findElement(By.cssSelector("table.tsc_table_s13 tbody tr"));
//        List<WebElement> columns = ele1.findElements(By.tagName("td"));
//        System.out.println(ele.getText());
//        for(WebElement col : columns){
//            System.out.println(col.getText());
//            String value = col.getText();
//            if(value == "details"){
//                col.click();
//            }
//        }


//        FileInputStream file = new FileInputStream("D://Book.xls");
//        Need Appache POI to run these scripts
//        Workbook wb = Workbook.getWorkbook(file);
//        Sheet sh = wb.getSheet("sheet1");
//        Sheet sh = wb.getSheet(0); //either by name or number
//        String CellGetContent = sh.getCell(0,0).getContents();
//        System.out.println(CellGetContent);
//        Cell Row0Col0 = sheet.getCell(0,0);
//        Cell Row1Col1 = sheet.getCell(1,1);
//        String FirstRowFirstColumn = Row0Col0.getContents();
//        String SecondRowSecondColumn = Row1Col1.getcontents();
//
//  For write excel sheet:
//        https://www.softwaretestingmaterial.com/write-excel-files-using-apache-poi





//     driver.close();
    }

//    public static void verifyBrokenImage(String linkUrl){
//        try {
//            URL url = new URL(linkUrl);
//            HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
//            httpUrlConnect.setConnectTimeout(3000);
//            httpUrlConnect.connect();
//            if(httpUrlConnect.getResponseCode()== 200){
//                System.out.println("valid link" + httpUrlConnect.getResponseMessage());
//            }else{
//                System.out.println("Broken link");
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }

//    public void dbTesting() throws SQLException{
//        //DB Testing
//        //url in the format: "jdbs:/mysql/ipaddress:portnumber/db_name:
//        String url = "jdbc:mysql://localhost:3036/emp";
//        String userName = "root";
//        String password = "password";
//        String query = "select * from user";
//        Connection con = null;
//
//        try {
//            con = DriverManager.getConnection(url, userName, password);
//            //Create Statement Object
//            Statement smt = con.createStatement();
//            // Execute the SQL Query. Store results in ResultSet
//            ResultSet res = smt.executeQuery(query);
//
//            // While Loop to iterate through all data and print results
//            while(res.next()){
//                String name = res.getString(1);
//                System.out.println(name);
//            }
//
//        }catch(Exception e){
//            System.out.println("connection");
//        }finally {
//            if(con != null) {
//                con.close();
//            }
//        }
//    }

}
