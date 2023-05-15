package com.demo.framework.driver.factory.web.remote;

import com.demo.framework.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.demo.framework.driver.manager.web.remote.selenium.SeleniumGridFireFoxManager;
import com.demo.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){}
    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFireFoxManager.getDriver();

    }
}
