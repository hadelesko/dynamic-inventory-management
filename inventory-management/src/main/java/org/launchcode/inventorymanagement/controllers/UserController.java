package org.launchcode.inventorymanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
        @RequestMapping(value = "register")
        public String index(){
            return "user/registration";
        }

    }
}
