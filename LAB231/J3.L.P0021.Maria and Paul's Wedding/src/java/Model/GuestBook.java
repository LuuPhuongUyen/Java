/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.DBUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class GuestBook {

    int id;
    String name;
    String email;
    String website;
    String imgLink;
    Date dateAdded;
    String content;

    public GuestBook() {
    }

    public GuestBook(int id, String name, String email, String website, String imgLink, Date dateAdded, String content) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.website = website;
        this.imgLink = imgLink;
        this.dateAdded = dateAdded;
        this.content = content;
    }

    public GuestBook(String name, String email, String website, String imgLink, Date dateAdded, String content) {
        this.name = name;
        this.email = email;
        this.website = website;
        this.imgLink = imgLink;
        this.dateAdded = dateAdded;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<GuestBook> getAllGuestBook() throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<GuestBook> guestls = new ArrayList<>();
        String sql = "SELECT name, email, website, imgLink, dateAdded,[content] FROM Guestbook";
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                String email = rs.getString(2);
                String website = rs.getString(3);
                String imgLink = rs.getString(4);
                Date dateAdded = rs.getDate(5);
                String content = rs.getString(6);
                GuestBook guestList = new GuestBook(name, email, website, imgLink, dateAdded, content);
                guestls.add(guestList);
            }
            return guestls;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            db.close(con, ps, rs);
        }
    }
}
