package com.demo.framework.views.web;

import com.demo.framework.views.web.components.users.SearchComponent;
import com.demo.framework.views.web.components.users.UserListComponent;

public class AdminView extends BaseView{


   private SearchComponent searchComponent;
   private UserListComponent userListComponent;
    public AdminView()
    {
        this.userListComponent = new UserListComponent();
        this.searchComponent = new SearchComponent();

    }
    public static AdminView getHomeScreenInstance() {
        return new AdminView();
    }

    public UserListComponent getUserListComponent() {
        return userListComponent;
    }
}
