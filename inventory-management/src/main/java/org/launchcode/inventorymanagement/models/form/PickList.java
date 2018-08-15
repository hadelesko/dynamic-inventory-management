package org.launchcode.inventorymanagement.models.form;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
public class PickList {

    @Id
    @GeneratedValue
    private int picklist_id;

    @OneToMany
    @JoinColumn(name="orderId")
    private List<Order> orders=new ArrayList<>();


    @ManyToOne
    @JoinColumn(name="material")
    private Material material;


    public PickList(){}


    public int getPicklist_id() {
        return picklist_id;
    }

    public void setPicklist_id(int picklist_id) {
        this.picklist_id = picklist_id;
    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
