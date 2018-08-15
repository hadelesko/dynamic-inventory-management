package org.launchcode.inventorymanagement.models.form;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
@Entity
public class Material {
    @NotNull
    @Size(min = 4, message = "At least 4 characters")
    private String name;
    @GeneratedValue
    private int id;
    @NotNull
    @Size(max = 120, message = "not more than 120 characters")
    private String description;
    @NotNull
    private double dispo_quantity;

    private ArrayList<String> locations = new ArrayList<>();

    @OneToMany(mappedBy="ordered_quantity")
    private PickList picklist;



    public Material(){}





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDispo_quantity() {
        return dispo_quantity;
    }

    public void setDispo_quantity(double dispo_quantity) {
        this.dispo_quantity = dispo_quantity;
    }

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public PickList getPicklist() {
        return picklist;
    }

    public void setPicklist(PickList picklist) {
        this.picklist = picklist;
    }
}
