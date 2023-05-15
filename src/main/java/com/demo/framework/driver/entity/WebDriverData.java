package com.demo.framework.driver.entity;

import com.demo.framework.enums.BrowserRemoteModeType;
import com.demo.framework.enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
