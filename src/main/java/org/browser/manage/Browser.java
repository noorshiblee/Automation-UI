package org.browser.manage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by shantonu on 4/2/16.
 * Maintain Singleton behavior for driver object
 */
public class Browser {

    //todo => need to read from property
    public static int DEFAULT_WAIT_4_PAGE = 30;
    public static int DEFAULT_WAIT_4_ELEMENT = 10;


    private static WebDriver driver = null;

    public static WebDriver getInstance(){
        if(driver==null){
            driver = new BrowserFactory().getABrowser();
            initiDriver();
        }
        return driver;
    }

    private Browser(){}

    /**
     * Size of screen
     * Timeout
     * All waiting
     */
    private static void initiDriver(){
        // TODO: initation of driver items like screen resolation, timeout etc.
    }
    public static void resetImplicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void setImplicitWait(int newWaittime_InSeconds) {
        nullifyImplicitWait();
        driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
    }
    public static void nullifyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

}
