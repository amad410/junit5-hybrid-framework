package com.demo.framework.driver.factory.mobile.local;

import com.demo.framework.driver.manager.mobile.local.AndroidManager;
import com.demo.framework.driver.manager.mobile.local.iOSManager;
import com.demo.framework.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * This class will manage getting a driver locally for your tests
 */

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){}
    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP =
            new EnumMap<>(MobilePlatformType.class);


    static {
        MAP.put(MobilePlatformType.ANDROID, AndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, iOSManager::getDriver);

    }

    public static WebDriver getDriver(MobilePlatformType platformType){
        return MAP.get(platformType).get();
    }
}
