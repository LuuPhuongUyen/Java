package model;

import Connection.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class ContactDB {

    public ArrayList<Contact> getContact(String type) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Contact WHERE type = (?)";

        ArrayList<Contact> listContact = new ArrayList<>();
        try {
            DBUtil db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, type);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String typeContact = rs.getString(2);
                String key = rs.getString(3);
                String value = rs.getString(4);

                Contact contact = new Contact(id, typeContact, key, value);
                listContact.add(contact);
            }
            rs.close();
            ps.close();
            con.close();
            return listContact;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
