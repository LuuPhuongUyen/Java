/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import Model.Help;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class HelpDAO {
    
    public HelpDAO() {
    }
    
    public ArrayList<Help> getHelpPage() throws Exception {
        ArrayList<Help> lsInfo = new ArrayList<>();
        String query = "select * from HowToHelp";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Help output = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String content = rs.getString(2);
                String imgSrc = rs.getString(3);
                output = new Help(title, content, imgSrc);
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
