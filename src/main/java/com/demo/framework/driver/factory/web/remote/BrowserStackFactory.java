package com.demo.framework.driver.factory.web.remote;

import com.demo.framework.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.demo.framework.driver.manager.web.remote.browserstack.BrowserStackFireFoxManager;
import com.demo.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, BrowserStackFireFoxManager::getDriver);

    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
}
