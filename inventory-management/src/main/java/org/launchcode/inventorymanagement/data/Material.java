package org.launchcode.inventorymanagement.data;

import java.util.ArrayList;
import java.util.HashMap;

public class Material {
    private  String name,
    private int id;
    private double quantity;
    //ArrayList<HashMap<String,Double>> locations;
    private ArrayList<String> locations;

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
