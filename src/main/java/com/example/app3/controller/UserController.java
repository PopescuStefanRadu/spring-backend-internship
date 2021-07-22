package com.example.app3.controller;

import com.example.app3.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    //variabila de cale:  PathVariable   ;   user/number/1    user/number/7340

    @GetMapping("/dashboard")
    public String getUserDashboard(Model model) {
        model.addAttribute("favNumber", 1);
        model.addAttribute("favClient", "gigel");
        model.addAttribute("allUsers", userService.getAllUsers());
        return "userDashboard";
    }

    @GetMapping("/number/{id}")
    public String getUser(Model model, @PathVariable Long id) {
        model.addAttribute("userById", userService.getUserById(id));
        return "userView";
    }

//
//    @GetMapping("/age/{age}")    /user/age/1
//    public String getUsersByAge(Model model, @PathVariable Integer age) {

    @GetMapping("/age")             //user/age?age=1    -> !!!!  el nu este accesibil in view in mod direct si atunci il pun pe model
    public String getUsersByAge(Model model, @RequestParam Integer age) {
        model.addAttribute("usersByAge", userService.getUsersByAge(age));  //User(1,Alex),  User(null, null, null)
        return "userAgeView";
    }

    @GetMapping("/status")
    public String getUsersByStatus(Model model, @RequestParam String status) {
        model.addAttribute("status", status);
        model.addAttribute("usersByStatus", userService.getUsersByStatus(status));
        return "userStatusView";
    }

    @GetMapping("/favorite/{id}/{name}")
    public String getSomething(Model model, @PathVariable Long id, @PathVariable String name,
                               @RequestParam String status, @RequestParam Boolean isHotOutside) {
        return "something";
    }

    @GetMapping("/saveMyUser")
    public String saveMyUser() {
        userService.saveUser();
        return "redirect:/user/dashboard";  //redirect:/ -> controller-ul la care sa ne duca
    }

    @GetMapping("/deleteAllUsers")
    public String deleteAll(Model model) {
        userService.deleteAllUsers();
        return "redirect:/user/dashboard";  //redirect:/ -> controller-ul la care sa ne duca
    }

}
