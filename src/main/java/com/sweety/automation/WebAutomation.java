package com.sweety.automation;

//import junit.framework.Assert;
//import org.apache.commons.io.FileUtils;
//import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.DownAction;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.Random;
import java.util.Iterator;
import java.util.Set;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import static junit.framework.TestCase.assertEquals;
import org.openqa.selenium.firefox.FirefoxProfile;
import sun.java2d.cmm.Profile;

public class WebAutomation extends Thread{

    public static void main(String... args) throws IOException, InterruptedException {

        //Launching firefox Browser
//        System.setProperty("webdriver.gecko.driver","D:\\webdriver/geckodriver.exe");

//        //Create FirefoxOption:
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

        //Launching chrome browser
//        System.setProperty("webdriver.chrome.driver", "D:\\webdriver/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        //set size of browser
//        driver.manage().window().maximize(); // Maximize
        //driver.manage().window().setPosition(new Point(0, -1000)); //Minimize
        //Dimension dimension = new Dimension(400, 600);
        //driver.manage().window().setSize(dimension);

        //driver.get("https://my-first-app-maxrun.herokuapp.com/");

        //click on a link
        //WebElement link = driver.findElement(By.linkText("Go to text box"));
        //link.click();

        //Checking an element text
       // driver.navigate().to("http://seleniumhq.org");
//            String title = driver.getTitle();
//            assertEquals(title, "Selenium - Web Browser Automation");
//            WebElement ele = driver.findElement(By.id("menu_documentation"));
//            ele.click();
//            driver.findElement(By.id("menu_about")).click();
//            WebElement e = driver.findElement(By.cssSelector("div#mainContent>h3"));
//            List<WebElement> lists = e.findElements(By.tagName("a")); //Elements within element
//            System.out.println(lists.get(0).getText());
//            lists.get(0).click();

        //Checking an attribute's values
        /*driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='jsb']/center/input[1]"));
        System.out.println("Name of the search button is: " +searchButton.getAttribute("name")); */

       /* //Drop Down
        driver.get("http://www1.macys.com/internationalContext/index.ognc");
        WebElement dropdown = driver.findElement(By.id("shippingCountry"));
        Select drpCountry = new Select(dropdown);
        //drpCountry.selectByIndex(2);
        //drpCountry.selectByValue("IN");
        drpCountry.selectByVisibleText("India");
        String selectedValue = drpCountry.getFirstSelectedOption().getText(); //selected option
        System.out.println(selectedValue);
        int count = drpCountry.getOptions().size();
        System.out.println(count);
        //Retrieve the value from drop down
        for(WebElement option : drpCountry.getOptions())
            System.out.println((option.getText()); */

// click on random options --  need to do:

        // Select multiple values from drop down
        //Multi-select:
//        driver.get("http://toolsqa.wpengine.com/automation-practice-form");
//        WebElement elem = driver.findElement(By.id("selenium_commands"));
//        Select drpcmnds = new Select(elem);
//        for(WebElement li : drpcmnds.getOptions()){
//            System.out.println(li.getText());
//        }
//        System.out.println(drpcmnds.isMultiple()); //This tells whether the SELECT element support multiple selecting options at the same time or not.
//        drpcmnds.selectByVisibleText("Navigation Commands"); //run the select command one after one for selecting multiple values
//        drpcmnds.selectByVisibleText("Switch Commands");
//        drpcmnds.selectByIndex(2);
//
//        drpcmnds.deselectByVisibleText("Navigation Commands");
//        drpcmnds.deselectAll();
//
//        //Textbox
//        driver.get("http://google.com/");
//        WebElement ele = driver.findElement(By.id("lst-ib"));
//        ele.sendKeys("Selenium Webdriver");
//        driver.findElement(By.name("btnK")).click();
//        String actualTitle = driver.getTitle();
//        System.out.println(actualTitle);
//        actualTitle.equals("selenium webdriver - Google Search");
//        //assertEquals(actualTitle, "Selenium Webdriver - Google Search"); //Junit Framework
//        List<WebElement> allLinks = driver.findElements(By.className("r")); // find elements
//        int count = allLinks.size();
//        System.out.println(count);
//        String str = allLinks.get(0).getText(); //get 1st element of links
//        System.out.println(str);
//        for(WebElement link : allLinks) {
//            System.out.println(link);
//            link.findElement(By.tagName("a")).getAttribute("href"); //Element within element
//        }
//        List<WebElement> avLinks = driver.findElements(By.tagName("a"));
//        System.out.println(avLinks.size());
//        Random r = new Random(); // Click Random link
//        avLinks.get(r.nextInt(avLinks.size())).click();
//
//        //Elements within element:
//        driver.get("http://seleniumhq.org");
//        driver.findElement(By.id("menu_about")).click();
//        WebElement e = driver.findElement(By.cssSelector("div#mainContent>h3"));
//        List<WebElement> lists = e.findElements(By.tagName("a")); //Elements within element
//        System.out.println(lists.get(0).getText());
//        lists.get(0).click(); //click on 1st element

        //checkbox
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        JavascriptExecutor exe = (JavascriptExecutor)driver;
//        exe.executeScript("scrollTo(400,400)");
//        driver.findElement(By.cssSelector("input.Automation")).click();

        //Radio button
//        driver.findElement(By.id("male")).click();

//        // Popup
//        driver.get("https://www.hdfcbank.com/");
//        String title = driver.getTitle();
//        title.equals("HDFC Bank: Personal Banking Services ");
//        driver.findElement(By.id("loginsubmit")).click();
//        String parent = driver.getWindowHandle();
//        driver.switchTo().window(parent);
//        String tl = driver.getTitle();
//        System.out.println(tl);
//        tl.equals("NetBanking");
//        // driver.findElement(By.cssSelector("a.btn.btn-default.redBtn")).click();
//        Set<String> windows = driver.getWindowHandles();
//        Iterator<String> ite = windows.iterator();
//        while (ite.hasNext()) {
//            String childWindow = ite.next();
//            if(!childWindow.equals(parent)){
//                driver.switchTo().window(childWindow);
//                driver.close();
//            }
//        }
//
//        driver.switchTo().window(parent); //return to parent window


//       ///Alert
//        driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
//        driver.findElement(By.id("loginbutton")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();

        // driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
        // Actions action = new Actions(driver);
        //Right Click
       /* WebElement ele = driver.findElement(By.id("fname"));
        action.contextClick(ele).perform(); */

        /*//Double Click
        WebElement ele = driver.findElement(By.id("dblClkBtn"));
        action.doubleClick(ele).perform();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); */

       /* //Mouse Hover
        WebElement ele = driver.findElement(By.id("idOfButton"));
        action.moveToElement(ele).perform(); */

       /* //Drag and Drop
        WebElement source = driver.findElement(By.id("sourceImage"));
        WebElement target = driver.findElement(By.id("targetDiv"));
        action.dragAndDrop(source,target).perform();
        source.isDisplayed();
        System.out.println(source.isDisplayed()); */ // not working

       /* //Scroll
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2500)"); // or js.executeScript("scrollBy(0,2500)");
        js.executeScript("scrollBy(0,-250)"); */ // Scroll up

        //Save Screenshot
        //Multiple Screenshots
//        ScreenShot obj = new ScreenShot();
//        obj.takeScreenShot();

        /*//Wait
        driver.get("http://www.seleniumhq.org/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait
        driver.findElement(By.linkText("Projects")).click();
        System.out.println(driver.getTitle());
        assertEquals(driver.getTitle(), "Selenium Projects");
        String title = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promo")));
        wait.until(ExpectedConditions.titleContains("Selenium Projects"));
        System.out.println(title.contains("Selenium Projects")); */

//        //Navigate back and Forward
//        driver.get("http://www.seleniumhq.org/");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait
//        driver.findElement(By.linkText("Projects")).click();
//        assertEquals(driver.getTitle(), "Selenium Projects");
//        driver.navigate().back();
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//        assertEquals(url, "http://www.seleniumhq.org/");

        //upload a file:
//        driver.get("http://demo.guru99.com/test/upload/");
//        WebElement ele = driver.findElement(By.id("uploadfile_0"));
//        ele.sendKeys("C:\\Users\\skumari.OSIUS\\Desktop\\aa.pdf");

        //Download a file:
        //We won't be able to access the save dialog box. That's controlled by the OS. The only thing you're really going to be able to do is set the default download location for the browser and allow it to automatically download the files.

        //In Chrome and Firefox: for firefox we need to create firefox profile and set preferences -- refer above and same code as like in chrome download
//        driver.get("https://filehippo.com/download_opera/");
//        driver.findElement(By.cssSelector("a.program-header-download-link.green")).click();
//        Thread.sleep(2000);
//        File fi = new File("D:\\Download\\OperaSetup.exe");
//        System.out.println(fi.exists());
//        if(fi.exists()){
//            System.out.println("File has downloaded");
//
//        }else{
//            System.out.println("File has not downloaded");
//        }

      //SSL certificate error - https://www.cacert.org/
        //Handled SSL Certificate error in chrome --
//       ChromeOptions option = new ChromeOptions();
////        option.setCapability("acceptInsecureCerts", true);
////        //or
//////        option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
////        driver = new ChromeDriver(option);
////        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
////        driver.get("https://www.cacert.org/");
////
////        //firefox
////        FirefoxOptions option1 = new FirefoxOptions();
////        option1.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
////        System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
////        driver = new FirefoxDriver(option1);
////        driver.get("https://www.cacert.org/");

//
//

        //Broken Link
//        driver.get("https://www.google.com");
//        driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
//        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.titleContains("selenium webdriver - Google Search"));
//        org.junit.Assert.assertEquals(driver.getTitle(), "selenium webdriver - Google Search");
//        List<WebElement> list = driver.findElements(By.tagName("a"));
//        System.out.println(list.size());
//        for(WebElement wele : list){
//            String url = wele.getAttribute("href");
//            System.out.println(url);
//            verifyBrokenImage(url);
//        }

        //Broken Image
        //Same as broken link only tagName("img")


        //Frame

//        driver.get("http://demo.guru99.com/test/guru99home/");
//        driver.switchTo().frame("a077aa5e");
//        driver.findElement(By.xpath("html/body/a/img")).isDisplayed();
////      driver.switchTo().defaultContent(); //Directly navigate to default frame
//        driver.switchTo().parentFrame();
//        driver.findElement(By.id("philadelphia-field-email")).sendKeys("selenium webdriver");
//
//        //If 100 frames are there and no ids then
//        int size = driver.findElements(By.tagName("iframe")).size();
//        for(int i = 0; i < size ; i++){
//            driver.switchTo().frame(i);
//        }
//        driver.switchTo().defaultContent();

        //Typed text of the text box
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

        //Table element:
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

 //Read excel
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

        //Opening and closing notepad:
        //created another class Notepad


        //Enable and disable java script in ff:
        //disable -- deprecated
//        FirefoxProfile profile = new FirefoxProfile();
//        profile.setPreference("javascript.enabled", false);
        //or -- but not working need to check
        FirefoxOptions option = new FirefoxOptions();
        option.addPreference("javascript.enabled", false);
        WebDriver driver = new FirefoxDriver(option);
 // or -- in-progress
//        FirefoxOptions option = new FirefoxOptions();
//        option.addPreference("javascript.enabled", false);
//        System.setProperty("webdriver.gecko.driver", "D:\\webdriver/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver(option);
//        driver.get("http://www.google.com");
 // in chrome -- not working
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-javascript");
//        options.addArguments("--disable-javascript-i18n-api");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("http://www.google.com");

        //Add extension/addon in ff and chrome:
        //Firefox -- not working
//        System.setProperty("webdriver.gecko.driver", "D:\\webdriver/geckodriver.exe");
//        FirefoxProfile profile = new FirefoxProfile();
//        profile.addExtension(new File("D:\\Momentum_v0.101.2.crx"));
//        FirefoxOptions option = new FirefoxOptions();
//        option.setProfile(profile);
//        WebDriver driver1 = new FirefoxDriver(option);




        //chrome: working fine
//        ChromeOptions option = new ChromeOptions();
//        option.addExtensions(new File("D:\\Momentum_v0.101.2.crx"));
//        WebDriver driver2 = new ChromeDriver(option);
        //OR -- DesiredCapabilities has deprecated in 3.10
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY,option);
//        WebDriver driver2 = new ChromeDriver(capabilities);


//        driver.close();
    }


//    public void dbTesting() throws SQLException{
//        //DB Testing
//        //url in the format: "jdbc:/mysql/ipaddress:portnumber/db_name:
//        String url = "jdbc:mysql://localhost:3036/emp";
//        String userName = "root";
//        String password = "password";
//        String query = "select * from user";
//        Connection con = null;
//
//       try {
//            con = DriverManager.getConnection(url, userName, password);
//           //Create Statement Object
//           Statement smt = con.createStatement();
//           // Execute the SQL Query. Store results in ResultSet
//           ResultSet res = smt.executeQuery(query);
//
//           // While Loop to iterate through all data and print results
//            while(res.next()){
//                String name = res.getString(1);
//                System.out.println(name);
//            }
//
//       }catch(Exception e){
//          System.out.println("connection");
//       }finally {
//           if(con != null) {
//               con.close();
//           }
//       }
//    }


    //xpath
    //URL: https://www.guru99.com/

//    URL: http://demo.guru99.com/v1/
//    1)//input[@name='uid']
//    2)//input[@type='text']
//    3)//label[@id='message23']
//    4)//input[@value='RESET']
//    5)//*[@class='barone']
//    6)//a[@href='http://demo.guru99.com/']
//    7)//img[@src='//cdn.guru99.com/images/home/java.png']
//
//    contains: used for 'type', 'text', 'name', 'value', 'id'
//    *[contains(@type,'sub')]
//    input[contains(@name,'btn')]
//    b[contains(text(),'SAP')]
//   input[contains(@value,'LOG')]
//
//
//    Using OR & AND:
//    input[@type='submit' or @name = 'btnLogin']
//    *[@type='submit' and @name='btnLogin']
//
//    Start-with:
//    label[starts-with(@id,'message')]
//
//  Xpath Axes method : axes methods commonly used in Selenium Webdriver like child, parent, ancestor, sibling, preceding, self, etc
//    1)Following: Selects all elements in the document of the current node( ) [ UserID input box is the current node] as shown in the below screen.
//*[@type='text']//following::input
//    *[@type='text']//following::input[1] -- first input value
//
//    2)ancestor:The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node
//    input[@name='password']//ancestor::td
//
//    3)child: Selects all children elements of the current node
//    URL:https://www.guru99.com/
//    *[@id='java_technologies']/child::li
//    *[@id='java_technologies']/child::li[1] -- for 1st list
//
//    4)preceeding: Select all nodes that come before the current node
//    URL: http://demo.guru99.com/v1/
//
//    *[@type='submit']//preceding::input
//    *[@type='submit']//preceding::input[1]
//
//    5)Following-sibling: Select the following siblings of the context node. Siblings are at the same level of the current node
//*[@type='submit']//following-sibling::input
//
//    6)Parent: Selects the parent of the current node
//    *[@type='submit']//parent::td
//
//    7)Self: Selects the current node or 'self' means it indicates the node itself
//*[@type='password']//self::input
//
//    8)Descendant: Selects the descendants of the current node
//    *[@id='rt-feature']//descendant::a[1]
//
//
//
//CSS Selectors:
//    URL: http://demo.guru99.com/v1/
//  css=input[name='uid']
// css=input[type='text']
// css=label#message23
//    css=input[value='RESET']
//css=a[href='http://demo.guru99.com/']
//
//    css=div#name-and-slogan -- for id
//
//    For class we need to use dot before class value. If there is space between classname like classname you need to use dot in between space.
//    css=ul.nav.navbar-nav
//
//    child and sub-child
//    child
//    css=td>input[name='btnLogin']
//    sub-child
//   css tr input[name='btnLogin']
//
//    nth-child
//    css=ul.dropdown-menu>li:nth-child(2) OR css=ul.dropdown-menu>li:nth-of-type(3)
//
//    Sibling
//css=input[name='btnLogin']+input
//
//    Matching substring -- starts with ^
//    css=input[name^='btnR']
//
//    End-with $
//    css=input[name$='Reset']
//
//    * - Contains
//    css=input[name*='nLogin']
//
//    More than one element
//    css=input[name='btnLogin'][value='LOGIN']
//
//    Inner Text:
//    css=a:contains('Demo Site') -- not working now


//Grid -- done



//Tool tip : http://www.testinginterviewquestion.com/2014/06/dfds.html






        //driver.close();

        //driver.quit();


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



}







