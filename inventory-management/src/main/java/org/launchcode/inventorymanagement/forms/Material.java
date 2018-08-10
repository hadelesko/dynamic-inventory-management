package org.launchcode.inventorymanagement.forms;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashMap;

public class Material {
    @NotNull
    @Size(min =4)
    private  String name;
    @GeneratedValue
    private int id;
    @NotNull
    @Size(max=120)
    private String description;
    NotNull
    private double quantity;
    //ArrayList<HashMap<String,Double>> locations;
    private ArrayList<String> locations;

    public Material(){

    }

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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }
}
