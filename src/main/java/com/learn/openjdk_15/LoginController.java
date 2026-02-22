package com.learn.openjdk_15;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

        @GetMapping("/")
        public String loginGet() {
            return "login.html";
        }

    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        boolean loggedIn = false;
        if (loggedIn) {
            model.addText("message");
        } else {
            model.addText("message");
        }
        return "login.html";

}

    }


