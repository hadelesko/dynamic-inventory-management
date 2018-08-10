package org.launchcode.inventorymanagement.forms;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Order {

    @Id
    @GeneratedValue
    private int id;

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
