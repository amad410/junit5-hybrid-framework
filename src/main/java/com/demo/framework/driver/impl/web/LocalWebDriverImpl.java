package com.demo.framework.driver.impl.web;

import com.demo.framework.driver.IWebDriver;
import com.demo.framework.driver.entity.WebDriverData;
import com.demo.framework.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
