package com.demo.framework.driver.manager.mobile.local;

import com.demo.framework.config.factory.ConfigFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSManager {

    private iOSManager(){}

    /*public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPod touch (7th generation)");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/ios-app.zip");
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);
    }*/

    public static WebDriver getDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 13 Pro Max")
                .setApp(System.getProperty("user.dir") + "/ios-app.zip");
        return new IOSDriver(ConfigFactory.getConfig().localAppiumServerURL(), options);
    }
}
