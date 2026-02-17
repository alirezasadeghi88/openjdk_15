package com.learn.openjdk_15;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(
            @RequestParam String color,
            Model page) {
        page.addText("username");
        page.addText("color");
        return "home.html";
    }
}



