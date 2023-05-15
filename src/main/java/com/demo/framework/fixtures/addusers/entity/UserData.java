package com.demo.framework.fixtures.addusers.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * This is just sample POJO class for managing data. In this instance, user data.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class UserData {
    private String userRole;
    private String employeeName;
    private String userName;
    private String status;
    private String password;
    private String messsage;
}
