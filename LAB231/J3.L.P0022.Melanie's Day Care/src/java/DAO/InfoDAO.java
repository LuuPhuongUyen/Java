/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import Model.Info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class InfoDAO {

    public ArrayList<Info> getInfo() throws Exception {
        ArrayList<Info> lsInfo = new ArrayList<>();
        String query = "select * from Info";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Info output = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                output = new Info(rs.getInt(1), rs.getString(2), rs.getString(3));
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
