/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC
 */
public class Magazine implements java.io.Serializable{

    private String MaID, MagazineTittle, Publisher;
    private float price;

    public Magazine() {
    }

    public Magazine(String MaID, String MagazineTittle, String Publisher, float price) {
        this.MaID = MaID;
        this.MagazineTittle = MagazineTittle;
        this.Publisher = Publisher;
        this.price = price;
    }

    public String getMaID() {
        return MaID;
    }

    public void setMaID(String MaID) {
        this.MaID = MaID;
    }

    public String getMagazineTittle() {
        return MagazineTittle;
    }

    public void setMagazineTittle(String MagazineTittle) {
        this.MagazineTittle = MagazineTittle;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
