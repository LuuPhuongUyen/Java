/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBContext;
import Model.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Luu Phuong Uyen
 */
public class MessageDAO {

    public void insertDB(Message data) throws Exception {
        String query = "INSERT INTO Message(name,email,message)  values(?,?,?)";

        Connection conn = null;
        PreparedStatement ps = null;
        DBContext db = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, data.getUsername());
            ps.setString(2, data.getEmail());
            ps.setString(3, data.getMessage());
            ps.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            conn.close();
        }
    }


}
