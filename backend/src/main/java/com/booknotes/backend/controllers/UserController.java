package com.booknotes.backend.controllers;

import com.booknotes.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserController {

    @RestController
    @RequestMapping("/user") // optional
    public class UserController
    {
        @Autowired
        private UserService userService;

    }
}
