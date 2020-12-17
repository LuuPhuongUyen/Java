/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import Model.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luu Phuong Uyen
 */
public class ContactDAO {
    public Contact getContact() throws Exception {   
        String query = "select * from ContactUs";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Contact output = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                output = new Contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));                
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(conn, ps, rs);
        }
        return output;
    }
}
