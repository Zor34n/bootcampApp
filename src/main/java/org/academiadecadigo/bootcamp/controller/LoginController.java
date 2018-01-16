package org.academiadecadigo.bootcamp.controller;

import org.academiadecadigo.bootcamp.service.UserService;

public class LoginController {

    UserService userService;




    public void setUserService(UserService userService) {
        this.userService = userService;

    }
}
