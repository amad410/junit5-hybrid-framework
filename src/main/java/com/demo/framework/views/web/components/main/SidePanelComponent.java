package com.demo.framework.views.web.components.main;

import com.demo.framework.views.web.AdminView;
import com.demo.framework.views.web.BaseView;
import org.openqa.selenium.By;

public class SidePanelComponent extends BaseView {

    public static final By ADMIN_MENU_ITEM = By.xpath("//span[text()='Admin']");

    public AdminView clickAdminMenu() throws InterruptedException {
        Thread.sleep(10000);
        click(ADMIN_MENU_ITEM);
        return new AdminView();
    }


}
