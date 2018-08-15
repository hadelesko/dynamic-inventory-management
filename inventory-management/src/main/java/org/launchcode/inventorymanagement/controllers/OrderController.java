package org.launchcode.inventorymanagement.controllers;


import org.launchcode.inventorymanagement.models.data.OrderDao;
import org.launchcode.inventorymanagement.models.form.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value="order")
public class OrderController {
    @Autowired
    private OrderDao orderDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("menus", orderDao.findAll());
        model.addAttribute("title", "The orders of the day");

        return "order/index";
    }


    @RequestMapping(value="addorder", method=RequestMethod.GET)
    public String displayaddorder(Model model){


        model.addAttribute("title","Insert the order");
        model.addAttribute(new Order());
        return "addorder";
    }


    @RequestMapping(value="addorder", method=RequestMethod.POST)
    public String processaddorder(Model model,
                                  @ModelAttribute @Valid Order order,
                                  Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add new Order");
            return "order/addorder";
        }

        orderDao.save(order);
        return "redirect:index";
    }





}
