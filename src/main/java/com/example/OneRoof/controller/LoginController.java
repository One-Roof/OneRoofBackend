package com.example.OneRoof.controller;

import com.example.OneRoof.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @GetMapping("/something")
    public @ResponseBody User get(HttpServletResponse res, User user) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Object test = auth.getDetails();
        user.setUsername(username);

        return user;
    }

    @PostMapping("/something")
    public @ResponseBody
    User printUser(User user) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        user.setUsername(username);
//        user.setFirstName();
//        user.setLastName();
        return user;
    }
}
