package com.example.OneRoof.controller;

import com.example.OneRoof.domain.User;
import org.aspectj.weaver.ast.Test;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping("/something")
    public @ResponseBody
    User printUser(User user) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        user.setName(name);
        return user;
    }
}
