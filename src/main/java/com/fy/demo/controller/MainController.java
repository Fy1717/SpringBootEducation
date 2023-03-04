package com.fy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  // specify its a restful api controller
public class MainController {
    // localhost:8080/mainpage

    @GetMapping (path = "/")  // specify there is a path and result from this
    public String mainPage() {
        return "MAIN PAGE";
    }

    @GetMapping ({"/message", "/message/{m}"})
    public String showMessage(@PathVariable(name = "m", required = false) String message) {
        // required parameter is "true" in default

        if (message == null || message.isEmpty()) {
            return "NO MESSAGE";
        } else {
            return "YOUR MESSAGE IS : " + message;
        }
    }
}
