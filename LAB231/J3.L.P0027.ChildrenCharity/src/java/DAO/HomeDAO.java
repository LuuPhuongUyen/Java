/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import Model.Home;
import Model.LatestNews;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class HomeDAO {

    public ArrayList<Home> getHome() throws Exception {
        ArrayList<Home> lsInfo = new ArrayList<>();
        String query = "select * from Home";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Home output = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                output = new Home(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                lsInfo.add(output);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(conn, ps, rs);
        }
        return lsInfo;
    }
    
     public ArrayList<LatestNews> getNews() throws Exception {
        ArrayList<LatestNews> lsInfo = new ArrayList<>();
        String query = "select * from LatestNews";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        LatestNews output = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                output = new LatestNews(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4));
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
