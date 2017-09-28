package com.example.OneRoof.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/something")
    @ResponseBody
    public String printUser(ModelMap model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        model.addAttribute("username", name);
        return name;
    }
}
