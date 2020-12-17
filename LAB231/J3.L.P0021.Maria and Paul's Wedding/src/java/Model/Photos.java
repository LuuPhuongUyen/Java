/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class Photos {

    private int id;
    private String imgSrc;

    public Photos() {
    }

    public Photos(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Photos(int id, String imgSrc) {
        this.id = id;
        this.imgSrc = imgSrc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public ArrayList<Photos> getAllPhoto() throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Photos> listPhotos = new ArrayList<>();
        String sql = "SELECT [imgSrc] FROM PhotoPage";
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Photos photo = new Photos(rs.getString(1));
                listPhotos.add(photo);
            }
            return listPhotos;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            db.close(con, ps, rs);
        }
    }
}
