/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J2SP0104;

import J2SP0106.*;
import java.util.Date;

/**
 *
 * @author shiro
 */
public class Stock {

    private String ID;
    private String name;
    private String Address;
    private Date DateAvaible;
    private String note;

    public Stock() {
    }

    public Stock(String ID, String name, String Address, Date DateAvaible, String note) {
        this.ID = ID;
        this.name = name;
        this.Address = Address;
        this.DateAvaible = DateAvaible;
        this.note = note;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDateAvaible() {
        return DateAvaible;
    }

    public void setDateAvaible(Date DateAvaible) {
        this.DateAvaible = DateAvaible;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Stock{" + "ID=" + ID + ", name=" + name + ", Address=" + Address + ", DateAvaible=" + DateAvaible + ", note=" + note + '}';
    }
    
    

}
