package com.bezhan.spring.spring_kata_boot.controller;

import com.bezhan.spring.spring_kata_boot.entity.User;
import com.bezhan.spring.spring_kata_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping(value = {"/users","/"})
    public String printUsers(Model model) {
        List<User> userList = userService.userList();
        model.addAttribute("users", userList);
        return "users";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userAdd";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "editUser";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user) {
        userService.edit(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.delete(userService.getById(id));
        return "redirect:/users";
    }

}