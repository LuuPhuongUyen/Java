/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.connect.DBContext;
import com.entity.Information;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class InfoModel {

//    private final DBContext db;
//
//    public InfoModel() throws Exception {
//        db = new DBContext();
//    }

    public ArrayList<Information> getInfoPage() throws Exception {
         ArrayList<Information> lsInfo=new ArrayList<>();
        String query = "select * from Information";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Information output = null;
        
        try {
            db = new DBContext();
            conn =db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String imgLink = "image/" + rs.getString(4);
                String content = rs.getString(5);
                output = new Information(id, name, age, imgLink, content);
                lsInfo.add(output);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(conn, ps, rs);
        }
        return lsInfo;
    }
}
