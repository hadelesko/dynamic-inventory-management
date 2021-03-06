package org.launchcode.inventorymanagement.data;

import com.sun.istack.internal.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Order {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String productlinename;
    private int schift;

    public Order() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductlinename() {
        return productlinename;
    }

    public void setProductlinename(String productlinename) {
        this.productlinename = productlinename;
    }

    public int getSchift() {
        return schift;
    }

    public void setSchift(int schift) {
        this.schift = schift;
    }
}
