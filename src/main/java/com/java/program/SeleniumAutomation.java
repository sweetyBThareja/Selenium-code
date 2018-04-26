package com.java.program;

/**
 * Created by skumari on 2/26/2018.
 */
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAutomation {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver","D:\\webdriver/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.manage().window().setPosition(new Point(0,1000));
        try {
            //driver.get("http://www.google.com");

            //Click on element and wait
//            driver.navigate().to("http://seleniumhq.org");
//            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            String title = driver.getTitle();
//            assertEquals(title, "Selenium - Web Browser Automation");
//            WebElement ele = driver.findElement(By.id("menu_documentation"));
//            ele.click();
//            WebDriverWait wait = new WebDriverWait(driver, 15);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_about")));
//            driver.navigate().back();
//            driver.navigate().forward();
//            driver.findElement(By.id("menu_about")).click();
//            wait.until(ExpectedConditions.titleContains("About Selenium"));
//            driver.navigate().refresh();
//            WebElement e = driver.findElement(By.cssSelector("div#mainContent>h3"));
//            List<WebElement> lists = e.findElements(By.tagName("a")); //Elements within element
//            System.out.println(lists.get(0).getText());
//            lists.get(0).click();
//
//            //Enter text box:
//            WebElement tb = driver.findElement(By.id("q"));
//            tb.sendKeys("selenium");
//            driver.findElement(By.id("submit")).click();
//            String actualTitle = driver.getTitle();
//            actualTitle.equals("Google Custom Search");
//            driver.navigate().back();

//            //Dropdown:
//            driver.get("https://www.macys.com/international/context");
//            WebElement ele = driver.findElement(By.id("shippingCountry"));
//            Select drpdwn = new Select(ele);
//            drpdwn.selectByIndex(3);
//            drpdwn.selectByVisibleText("India");
//            drpdwn.selectByValue("AU");
////            String val = drpdwn.getFirstSelectedOption().getText();
////            System.out.println(val);
//            //OR
//            System.out.println(drpdwn.getFirstSelectedOption().getText());
//           // List<WebElement> lists = ele.findElements(By.tagName("option"));
////            System.out.println(lists.size());
////            System.out.println(lists.get(4).getText());
////
////            for(WebElement li : lists){
////                System.out.println(li.getText());
////            }
//
//            //OR
//            System.out.println("Using getOptions() method: ");
//            for(WebElement st : drpdwn.getOptions()){
//                System.out.println(st.getText());
//            }

//            //Multi-select:
//            driver.get("http://toolsqa.wpengine.com/automation-practice-form");
//            WebElement elem = driver.findElement(By.id("selenium_commands"));
//            Select drpcmnds = new Select(elem);
//            for(WebElement li : drpcmnds.getOptions()){
//                System.out.println(li.getText());
//            }
//            System.out.println(drpcmnds.isMultiple());
//            drpcmnds.selectByVisibleText("Navigation Commands");
//            drpcmnds.selectByVisibleText("Switch Commands");
//            drpcmnds.selectByIndex(2);
//
//            drpcmnds.deselectByVisibleText("Navigation Commands");
//            drpcmnds.deselectAll();

//            //Alert:
//            driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
//            driver.findElement(By.id("loginbutton")).click();
 //           Alert alert = driver.switchTo().alert();
//            alert.accept();

            //Popup:
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

        //Action Builder:
//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//        Actions action = new Actions(driver);

//        //Double Click:
//        WebElement ele = driver.findElement(By.id("dblClkBtn"));
//        action.doubleClick(ele).perform();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//
//        //Drag and drop
//        WebElement source = driver.findElement(By.id("sourceImage"));
//        WebElement target = driver.findElement(By.id("targetDiv"));
//        action.dragAndDrop(source, target).build().perform();
//
//       //Mouse Hover:
//            WebElement mve = driver.findElement(By.id("idOfButton"));
//            action.moveToElement(mve).perform();
//
//        //Right click:
//            WebElement rcli = driver.findElement(By.id("fname"));
//            action.contextClick(rcli).perform();

//        //Scroll:
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            js.executeScript("window.scrollBy(0,2500)");
//            js.executeScript("window.scrollBy(0,-250)");

//     //Save Screenshot:
//       try{
//          File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//           FileUtils.copyFile(src, new File("D:\\screenshot\\" + "s1" + ".png"));
//
//       }catch(Exception e){
//           e.printStackTrace();
//       }
//     //Multiple screen shots:
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            Boolean check = (Boolean)js.executeScript("return document.documentElement.scrollHeight > document.documentElement.clientHeight");
//            Long scrollHeight = (Long)js.executeScript("return document.documentElement.scrollHeight");
//            Long clientHeight = (Long)js.executeScript("return document.documentElement.clientHeight");
//            int index = 1;
//            if(check.booleanValue()){
//                while(scrollHeight.intValue() > 0){
//                    try {
//                        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//                        FileUtils.copyFile(src, new File("D:\\screenshot\\" + "s" + index + ".png"));
//                        js.executeScript("window.scrollBy(0," + clientHeight * index + ")");
//                        index++;
//                    }catch(Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }

            //Navigate:

            driver.get("https://www.macys.com/");
            driver.findElement(By.id("closeButton")).click();
            String text = driver.findElement(By.id("globalSearchInputField")).getAttribute("placeholder");
            System.out.println("value is : " + text);













       }finally {


            driver.close();
        }

    }
}
