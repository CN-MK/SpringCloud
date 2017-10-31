package com.example.feign.controller;

import com.example.feign.API.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class UserController {

    @Autowired
    Service service;

    @RequestMapping(value = "/start")
    public String SelectAllUser(ModelMap model) {
        model.addAttribute("user", service.UsersList().toString());
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/insertParam")
    public String InsertUser() {
        return "index";
    }

    @RequestMapping(value = "/updateParam")
    public String UpdateUser(Model model) {
        return "login";
    }

    @RequestMapping(value = "/verifyUser")
    public String VerifyUser(HttpServletRequest request, ModelMap model) {
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
            model.addAttribute("user", service.VerifyUser(name, pwd));
            return "index";
    }

    @RequestMapping(value = "/{id}")
    public String DeleteById(Model model) {
        model.addAttribute("user", service.UsersList());
        return "index";
    }

}
