package org.launchcode.inventorymanagement.data;

import java.util.ArrayList;
import java.util.Date;

public class ProductionLine {
    private String name;
    private ArrayList<String>order=new ArrayList<>();
    private ArrayList<String>worker=new ArrayList<>();
    private boolean status; // isrunning, isdown, passed, failed
    private Date date;
}
