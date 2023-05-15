package com.demo.framework.config.converters;

import com.demo.framework.enums.RunModeType;
import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;

/**
 * This class will convert the browsername and convert it to its corresponding
 * enum value.  It also handles instances where if an incorrect browser name
 * is passed, it will default to chrome.
 */
public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType> {
    @Override
    public RunModeType convert(Method method, String runMode) {

       return RunModeType.valueOf(runMode.toUpperCase());
    }
}
