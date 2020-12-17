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
public class Blog {

    private int id;
    private String title;
    private String content;
    private String imgSource;
    private Date dateAdded;
    private int type;

    public Blog() {
    }

    public Blog(int id, String title, String content, String imgSource, Date dateAdded, int type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imgSource = imgSource;
        this.dateAdded = dateAdded;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ArrayList<Blog> getAllBlog() throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Blog> blogList = new ArrayList<>();
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement("SELECT * FROM HienThi ORDER BY DateAdded DESC");
            rs = ps.executeQuery();
            while (rs.next()) {
                Blog blog = new Blog(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getDate(5), rs.getInt(6));
                blogList.add(blog);
            }
            return blogList;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.close(con, ps, rs);
        }
        return null;
    }
}
