/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GuestBook;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class GuestBookAction {

    private ArrayList<GuestBook> lsGuest = new ArrayList<>();
    private String name;
    private String email;
    private String website;
    private String imgLink;
    private Date dateAdded;
    private String content;

    public GuestBookAction(String name, String email, String website, String imgLink, Date dateAdded, String content) {
        this.name = name;
        this.email = email;
        this.website = website;
        this.imgLink = imgLink;
        this.dateAdded = dateAdded;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<GuestBook> getLsGuest() {
        return lsGuest;
    }

    public void setLsGuest(ArrayList<GuestBook> lsGuest) {
        this.lsGuest = lsGuest;
    }

    public String execute() throws Exception {
        GuestBook guest = new GuestBook();
        lsGuest = guest.getAllGuestBook();
        return "success";
    }

}
