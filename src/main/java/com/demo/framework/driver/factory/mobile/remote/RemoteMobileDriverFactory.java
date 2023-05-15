package com.demo.framework.driver.factory.mobile.remote;

import com.demo.framework.enums.MobilePlatformType;
import com.demo.framework.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory(){}
    private static final Map<MobileRemoteModeType, Function<MobilePlatformType,WebDriver>> MAP =
            new EnumMap<>(MobileRemoteModeType.class);

    static {
        MAP.put(MobileRemoteModeType.BROWSER_STACK, SauceLabsMobileFactory::getDriver);
        MAP.put(MobileRemoteModeType.SAUCE_LABS, BrowserStackMobileFactory::getDriver);

    }
    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType platformType){
        return MAP.get(mobileRemoteModeType).apply(platformType);
    }
}
