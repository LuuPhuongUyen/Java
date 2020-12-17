/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogModel;

import Connection.DBUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class blog {

    int id;
    String name;
    String image;
    String detail;
    Date date;
    String type;

    public blog() {
    }

    public blog(int id, String name, String image, String detail, Date date, String type) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.detail = detail;
        this.date = date;
        this.type = type;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // GET BLOG SORT BY DATE DESC
    public ArrayList<blog> getBlog() throws Exception {
        ArrayList<blog> lsBlog = new ArrayList<>();
        Connection con = DBUtil.openConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM blog order by date DESC");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            id = rs.getInt("id");
            name = rs.getString("name");
            image = rs.getString("image");
            detail = rs.getString("detail");
            date = rs.getDate("date");
            type = rs.getString("type");
            lsBlog.add(new blog(id, name, image, detail, date, type));
        }
        return lsBlog;
    }

    // GET BLOG BY ID
    public blog getBlogByID(int id) throws Exception {
        ArrayList<blog> lsBlog = new ArrayList<>();
        Connection con = DBUtil.openConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM blog WHERE id=?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            id = rs.getInt("id");
            name = rs.getString("name");
            image = rs.getString("image");
            detail = rs.getString("detail");
            date = rs.getDate("date");
            type = rs.getString("type");
            blog x = new blog(id, name, image, detail, date, type);
            return x;
        }
        con.close();
        return null;
    }

    public String getMonth(Date d) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM");
        int month = Integer.parseInt(dateFormat.format(d));
        String kq = new DateFormatSymbols().getMonths()[month - 1];
        dateFormat = new SimpleDateFormat("YYYY");
        int year = Integer.parseInt(dateFormat.format(d));
        kq += " " + year;
        return kq;
    }

}
