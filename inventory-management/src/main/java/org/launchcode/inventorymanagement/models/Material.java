package org.launchcode.inventorymanagement.models;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Material {
    @NotNull
    @Size(min =4, message = "At least 4 characters")
    private  String name;
    @GeneratedValue
    private int id;
    @NotNull
    @Size(max=120, message = "not more than 120 characters")
    private String description;
    @NotNull
    private double quantity;
    @NotNull
    //private Location location;
    //ArrayList<HashMap<String,Double>> locations;
    private ArrayList<String> locations=new ArrayList<String>();

    public Material(){

    }
    public Material(String name){
        this.name=name;
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
