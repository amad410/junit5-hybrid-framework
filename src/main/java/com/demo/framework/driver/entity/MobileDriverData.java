package com.demo.framework.driver.entity;

import com.demo.framework.enums.MobilePlatformType;
import com.demo.framework.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
