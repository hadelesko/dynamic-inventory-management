package org.launchcode.inventorymanagement.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Schedule {
    private Date date;
    private int shift;
    private ArrayList<HashMap<String,String>> workers;
    private  String productionsline;

    public Schedule(int shift, Date date){
        this.shift=shift;
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getProductionsline() {
        return productionsline;
    }

    public void setProductionsline(String productionsline) {
        this.productionsline = productionsline;
    }
}
