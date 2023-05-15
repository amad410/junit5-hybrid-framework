package com.demo.framework.views.web;

import com.demo.framework.views.mobile.HomeView;
import com.demo.framework.views.web.components.main.SidePanelComponent;

public class DashboardView extends BaseView {

    public static AdminView navigateToAdminView() throws InterruptedException {
        new SidePanelComponent().clickAdminMenu();
        return new AdminView();

    }
    public static DashboardView getHomeScreenInstance() {
        return new DashboardView();
    }
}
