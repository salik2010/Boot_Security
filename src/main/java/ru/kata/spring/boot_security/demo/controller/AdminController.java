package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.service.UserService;
@Controller
@RequestMapping("/admin")
public class AdminController {

        private UserService userService;

        @Autowired
        public AdminController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping()
        public String allUsers111() {


            return "index11";
        }



}
