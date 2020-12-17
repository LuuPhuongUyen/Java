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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Luu Phuong Uyen
 */
public class MessageDAO {

     public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z0-9]{2,})$", Pattern.CASE_INSENSITIVE);

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

    public boolean checkEmail(String input) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(input);

        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkNull(String input) {
        if (input.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Message> getAllMessage() throws Exception {
        ArrayList<Message> lsInfo = new ArrayList<>();
        String query = "select * from Message";
        DBContext db = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Message output = null;
        try {
            db = new DBContext();
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                output = new Message(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
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
