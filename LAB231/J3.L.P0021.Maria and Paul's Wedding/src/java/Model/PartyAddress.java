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
public class PartyAddress {

    private String address;
    private String email;

    public PartyAddress() {
    }

    public PartyAddress(String address, String email) {
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<PartyAddress> getPartyAddress() throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<PartyAddress> address = new ArrayList<>();
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement("SELECT * FROM PartyAddress");
            rs = ps.executeQuery();
            while (rs.next()) {
                PartyAddress pa = new PartyAddress(rs.getString(1), rs.getString(2));
                address.add(pa);
            }
            return address;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.close(con, ps, rs);
        }
        return null;
    }
}
