package com.example.OneRoof.controller;

import com.example.OneRoof.domain.FamilyMember;
import com.example.OneRoof.service.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ethan on 8/15/17.
 */
@Controller
public class OneRoofController {

    @Autowired
    private FamilyMemberService familyMemberService;

    @GetMapping("/test")
    String home() {
        return "test";
    }

    @GetMapping("/login")
    String login() { return "login"; }

    @GetMapping("/signup")
    String newUser() { return "new_user"; }

    @PostMapping("/newuser")
    String addFamilyMember(FamilyMember familyMember, Model model) {
        familyMemberService.add(familyMember);
        List<FamilyMember> familyMembers = familyMemberService.get();
        model.addAttribute("listOfFamilyMembers", familyMembers);
        return "new_user";
    }

    @GetMapping("/admin")
    String admin() {
        return "test";
    }

    @GetMapping("/user")
    String user() { return "test"; }
}
