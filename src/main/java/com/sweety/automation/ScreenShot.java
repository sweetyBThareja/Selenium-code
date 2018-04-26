package com.sweety.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class ScreenShot extends WebAutomation {
     static WebDriver driver = new ChromeDriver();

    public static void takeScreenShot() throws IOException {
            System.setProperty("webdriver.chrome.driver", "D:\\webdriver/chromedriver.exe"); // need to put up
            driver.manage().window().maximize();
            driver.get("https://developer.mozilla.org/en-US/docs/Tools/Migrating_from_Firebug");
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,0)");
            ScreenShot ss = new ScreenShot();
            Boolean check = (Boolean)js.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight");
            Long scrollH = (Long)js.executeScript("return document.documentElement.scrollHeight");
            Long clientH = (Long)js.executeScript("return document.documentElement.clientHeight");
            int index = 1;
            if (check.booleanValue()) {
                while (scrollH.intValue() > 0){
                    ss.singleScreenShot("screen - " + index);
                    js.executeScript("window.scrollBy(0," + clientH * index + ")");
                    index++;
                }

            } else {
                ss.singleScreenShot("screen - 1");

            }


        }

    public static void singleScreenShot(String name) throws IOException {
        try {
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Take screen shot and store as file format
            FileUtils.copyFile(src, new File("D:\\screenshot\\" + name + ".png")); //now copy the  screenshot to desired location using copyFile method
        } catch (IOException e)

        {
            e.printStackTrace();
        }
    }

    public static void main(String args[])throws IOException{
        ScreenShot obj = new ScreenShot();
        obj.takeScreenShot();
    }
}


