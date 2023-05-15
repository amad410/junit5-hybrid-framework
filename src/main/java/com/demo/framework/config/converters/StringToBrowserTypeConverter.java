package com.demo.framework.config.converters;

import com.demo.framework.enums.BrowserType;
import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * This class will convert the browsername and convert it to its corresponding
 * enum value.  It also handles instances where if an incorrect browser name
 * is passed, it will default to chrome.
 */
public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {

        Map<String, BrowserType> stringBrowserTypeMap = Map.of("CHROME", BrowserType.CHROME,
                "FIREFOX",BrowserType.FIREFOX);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
    }
}
