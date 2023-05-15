package com.demo.framework.driver.factory.mobile.remote;

import com.demo.framework.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.demo.framework.driver.manager.mobile.remote.BrowserStackiOSManager;
import com.demo.framework.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class SauceLabsMobileFactory {
    private SauceLabsMobileFactory() {
    }

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP =
            new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, BrowserStackiOSManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }
}
