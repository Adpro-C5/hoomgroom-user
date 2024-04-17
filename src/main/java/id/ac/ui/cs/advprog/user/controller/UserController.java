package id.ac.ui.cs.advprog.user.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController {
    String createHTML = "userCreate";
    @GetMapping("/")
    @ResponseBody
    public String createUserPage(Model model) {
        return "<h1>Hello World! This is HoomGroom User Microservice.</h1>";
    }
}