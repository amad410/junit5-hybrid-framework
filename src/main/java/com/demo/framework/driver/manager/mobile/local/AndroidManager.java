package com.demo.framework.driver.manager.mobile.local;

import com.demo.framework.config.factory.ConfigFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class AndroidManager {

    private AndroidManager(){}

    /*public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/android-app.apk");
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);
    }*/

    public static WebDriver getDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir") + "/android-app.apk");
        return new AndroidDriver(ConfigFactory.getConfig().localAppiumServerURL(), options);
    }
}
