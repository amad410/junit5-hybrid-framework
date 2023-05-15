package com.demo.framework.driver.manager.web.remote.selenoid;

import com.demo.framework.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class will return the Selenoid instance of Chrome
 */
public final class SelenoidChromeManager {
    private SelenoidChromeManager(){}

    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName","chrome");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
    }

}
