package org.launchcode.inventorymanagement.controllers;

import org.launchcode.inventorymanagement.models.data.MaterialDao;
import org.launchcode.inventorymanagement.models.data.OrderDao;
import org.launchcode.inventorymanagement.models.form.Material;
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
@RequestMapping(value="material")
public class MaterialController {
    @Autowired
    private MaterialDao materialDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("menus", materialDao.findAll());
        model.addAttribute("title", "The orders of the day");

        return "order/index";
    }


    @RequestMapping(value="addmaterial", method=RequestMethod.GET)
    public String displayaddorder(Model model){


        model.addAttribute("title","Insert the material");
        model.addAttribute(new Order());
        return "add";
    }


    @RequestMapping(value="addorder", method=RequestMethod.POST)
    public String processaddorder(Model model,
                                  @ModelAttribute @Valid Material material,
                                  Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add new Material");
            return "material/add";
        }

        materialDao.save(material);
        return "redirect:index";
    }
    }

