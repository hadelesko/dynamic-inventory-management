package org.launchcode.inventorymanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="user")
public class UserController {

    @RequestMapping(value="")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "register")
    public String index(){
            return "user/registration";
        }

    @RequestMapping(value="add", method=RequestMethod.GET)
    public String displayaddform(Model model){
        model.addAttribute("title", "Add  a user");
        return "user/add";
    }
    @RequestMapping(value="add", method=RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, String verify, Errors errors){
        model.addAttribute("title", "Add  a user");

        if (errors.hasErrors() && user.getEmail().equals(user.getVerify())) {
            model.addAttribute("title", "Add a user");
            return "user/add";
        }
        return "redirect";

    }
}
