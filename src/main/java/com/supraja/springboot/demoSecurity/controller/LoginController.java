package com.supraja.springboot.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    //Mapping for access-denied

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }

}
