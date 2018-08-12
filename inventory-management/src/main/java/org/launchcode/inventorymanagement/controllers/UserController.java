package org.launchcode.inventorymanagement.controllers;

import org.launchcode.inventorymanagement.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="user")
public class UserController {
    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "register")
    public String index(){
            return "user/registration";
        }

    @RequestMapping(value="add", method=RequestMethod.GET)
    public String displayaddform(Model model){
        model.addAttribute("title", "Add  a user");
        return "user/add";
    }
    /*@RequestMapping(value="add", method=RequestMethod.POST)
    public String add(Model model, @ModelAttribute Valid user, String verify, Errors errors){
        model.addAttribute("title", "Add  a user");

        if (errors.hasErrors() && user.getPassword().equals(user.getVerify())) {
            model.addAttribute("title", "Add a user");
            return "user/add";
        }
        return "redirect";

    }*/
}
