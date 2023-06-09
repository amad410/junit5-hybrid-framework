package com.demo.tests.web.base.data.users;

import com.demo.framework.fixtures.addusers.entity.UserData;
import com.demo.framework.views.web.components.users.AddUserComponent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

/**
 * This is a factory class for adding user predicates
 */
public class AddUsersPredicateFactory {
    private static final Map<String, BiPredicate<UserData, AddUserComponent>> MAP = new HashMap<>();

    private static final BiPredicate<UserData, AddUserComponent> VALID_PREDICATE = (userData, addUserComponent) -> {
        addUserComponent.setUserRoleDropDown(userData.getUserRole())
                .setUserNameTextBox(userData.getUserName())
                .setPasswordTextBox(userData.getPassword())
                .setConfirmPasswordTextBox(userData.getPassword())
                .setStatusDropDown(userData.getStatus())
                .setEmployeeNameTextBox(userData.getEmployeeName());
        return addUserComponent.isSuccessMessageDisplayed();
    };

    private static final BiPredicate<UserData, AddUserComponent> JUST_EMPLOYEE_NAME_PREDICATE = (userData, addUserComponent) -> {
        addUserComponent.setEmployeeNameTextBox(userData.getEmployeeName());
        return addUserComponent.isErrorDisplayedForEmployeeName();
    };

    static {
        MAP.put("valid", VALID_PREDICATE);
        MAP.put("just_employeename", JUST_EMPLOYEE_NAME_PREDICATE);
    }

    public static BiPredicate<UserData, AddUserComponent> getPredicate(String value) {
        return MAP.get(value);
    }
}
