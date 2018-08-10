package org.launchcode.inventorymanagement.controllers;

import org.launchcode.inventorymanagement.data.MaterialDao;
import org.launchcode.inventorymanagement.forms.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "material")
public class MaterialController {
    @Autowired
    private MaterialDao materialDao;




    /**@RequestMapping(value = "index")
    public String index(){
            return "material/index";
        }**/

    @RequestMapping(value = "list")
    public String listmaterial(Model model){
        model.addAttribute("title"; "List of the materials in the warehouse");
        model.addAttribute("materials", materialDao.findAll());
        return "material/materiallist";
    }




    @RequestMapping(value = "addmaterial", method = RequestMethod.GET)
    public String displayAddMaterial(Model model) {
        model.addAttribute("title", "Add Material");


        if(name.equals("none")) {
            return "redirect:/material/index";
        }

        model.addAttribute("title", "Add Material");
        model.addAttribute(new material());
        model.addAttribute("material", material.values());
        return "material/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddMaterial(@ModelAttribute @Valid Material newmaterial,
                                       Errors errors, Model model, @CookieValue(value = "user", defaultValue = "none") String username) {

        if(.equals("none")) {
            return "redirect:/user/login";
        }
        Material m = materialdao.findmaterialname(materialname).get(0);
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Material");
            return "material/add";
        }

        newmaterial.setMaterial(material);

        cheeseDao.save(material);
        return "redirect:";
    }

    @RequestMapping(value = "addOrder/{order_id}")
    public String proceed_add_order(){
        return "material/order/add";
    }
    }
}
