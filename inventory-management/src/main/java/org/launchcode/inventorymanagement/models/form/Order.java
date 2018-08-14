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
    private int id;

    //@NotNull
    //private String material_name;

    //@NotNull
    //private int quantity;

    @Basic
    private Date date;
    //private LocalDateTime updateon;
    @NotNull
    private String destination;   //Production line that will use the material
    private int schift;  // first(1.), 2nde(2), third(3.)

    @OneToOne
    @JoinColumn(name = "material")
    private Material material;

    @NotNull
    private int order_quantity;

    private List<Material> ordered_materials = new ArrayList<Material>();

    public Order() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public List<Material> getOrdered_materials() {
        return ordered_materials;
    }

    public void setOrdered_materials(List<Material> ordered_materials) {
        this.ordered_materials = ordered_materials;
    }
}
