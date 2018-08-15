package org.launchcode.inventorymanagement.models.form;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int orderId;
    @Basic
    private Date date;

    private int schift;    //first(1.), 2nde(2), third(3.)

    @NotNull
    private Material material;

    @NotNull
    private int ordered_quantity;

    @NotNull
    private String destination; //Production line that will use the material

    @ManyToOne
    private PickList picklist;


    public Order() {}


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSchift() {
        return schift;
    }

    public void setSchift(int schift) {
        this.schift = schift;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getOrdered_quantity() {
        return ordered_quantity;
    }

    public void setOrdered_quantity(int ordered_quantity) {
        this.ordered_quantity = ordered_quantity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public PickList getPicklist() {
        return picklist;
    }

    public void setPicklist(PickList picklist) {
        this.picklist = picklist;
    }
}
