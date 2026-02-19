package com.learn.openjdk_15;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

}
