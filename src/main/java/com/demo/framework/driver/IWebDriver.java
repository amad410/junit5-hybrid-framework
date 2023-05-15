package com.demo.framework.driver;

import com.demo.framework.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData driverData);
}
