package com.demo.framework.driver;

import com.demo.framework.enums.PlatformType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

import static com.demo.framework.enums.PlatformType.MOBILE;
import static com.demo.framework.enums.PlatformType.WEB;
import static java.lang.ThreadLocal.withInitial;

public final class DriverManager {
    private DriverManager(){}
    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> MOBILE_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<PlatformType> CONTEXT = withInitial(()->WEB);
    private static final Map<PlatformType,ThreadLocal<WebDriver>> DRIVER_MAP = new EnumMap<>(PlatformType.class);

    public static WebDriver getDriver(){
        if(CONTEXT.get() == WEB)
        {
            return WEB_DRIVER_THREAD_LOCAL.get();
        }
        else{
            return MOBILE_DRIVER_THREAD_LOCAL.get();
        }
    }

    public static void setDriver(WebDriver driver)
    {
        if(isMobileDriver(driver))
        {
            MOBILE_DRIVER_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(MOBILE,MOBILE_DRIVER_THREAD_LOCAL);
            CONTEXT.set(MOBILE);
        }
        else{
            WEB_DRIVER_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(WEB,WEB_DRIVER_THREAD_LOCAL);
            CONTEXT.set(WEB);
        }
    }

    private static boolean isMobileDriver(WebDriver driver){
        return driver instanceof AndroidDriver | driver instanceof  IOSDriver;
    }


    public static void unload(){
        WEB_DRIVER_THREAD_LOCAL.remove();
        MOBILE_DRIVER_THREAD_LOCAL.remove();
        CONTEXT.remove();
    }

}
