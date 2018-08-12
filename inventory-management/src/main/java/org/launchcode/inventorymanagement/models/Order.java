package org.launchcode.inventorymanagement.models;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
public class Order {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String material_name;

    @NotNull
    private int quantity;

    @Basic
    private Date date;
    //private LocalDateTime updateon;
    @NotNull
    private String destination;   //Production line that will use the material
    private int schift;  // first(1.), 2nde(2), third(3.)

    public Order(int id, String material_name, int quantity, Date date) {
        this.id = id;
        this.material_name = material_name;
        this.quantity = quantity;
        this.date=date;

    }
    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
}
