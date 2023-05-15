package com.demo.framework.driver.manager.web.remote.selenium;

import com.demo.framework.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class will return the Selenium Grid instance of Chrome
 */
public final class SeleniumGridChromeManager {
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(Browser.CHROME.browserName());
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
    }
}
