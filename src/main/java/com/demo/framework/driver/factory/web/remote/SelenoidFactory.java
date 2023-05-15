package com.demo.framework.driver.factory.web.remote;

import com.demo.framework.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.demo.framework.driver.manager.web.remote.selenoid.SelenoidFireFoxManager;
import com.demo.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;


public final class SelenoidFactory {

    private SelenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SelenoidChromeManager.getDriver()
                : SelenoidFireFoxManager.getDriver();
    }
}
