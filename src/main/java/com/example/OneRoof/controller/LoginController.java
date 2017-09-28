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

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @GetMapping
    public @ResponseBody User get(HttpServletResponse res) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        User user = new User();
        user.setName(name);

        return user;
    }

    @PostMapping("/something")
    public @ResponseBody
    User printUser(User user) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        user.setName(name);
        return user;
    }
}
