package org.launchcode.inventorymanagement.controllers;

import org.launchcode.inventorymanagement.models.data.MaterialDao;
import org.launchcode.inventorymanagement.models.form.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="material")
public class MaterialController {
    @Autowired
    private MaterialDao materialDao;
    private Material material;




    /**@RequestMapping(value = "index")
    public String index(){
            return "material/index";
        }**/

    @RequestMapping(value="list")
    public String listmaterial(Model model){
        model.addAttribute("title", "List of the materials in the warehouse");
        model.addAttribute("materials", materialDao.findAll());
        return "material/materiallist";
    }




    @RequestMapping(value = "addmaterial", method = RequestMethod.GET)
    public String displayAddMaterial(Model model) {
        model.addAttribute("title", "Add Material");


        if(material.getName().equals("none")) {
            return "redirect:/material/index";
        }

        model.addAttribute("title", "Add Material");
        model.addAttribute(material);
        model.addAttribute("material", material.getQuantity());
        return "material/add";
    }

    }

