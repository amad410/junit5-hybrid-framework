package com.demo.framework.driver.factory.web.local;

import com.demo.framework.driver.manager.web.local.ChromeManager;
import com.demo.framework.driver.manager.web.local.FireFoxManager;
import com.demo.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * This class will manage getting a driver locally for your tests
 */

public final class LocalDriverFactory {

    private LocalDriverFactory(){}
    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, FireFoxManager::getDriver);

    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
}
