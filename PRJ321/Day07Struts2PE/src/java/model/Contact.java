/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.DatabaseInfo;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Contact implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private int groupID;
    private String phone;
    private String groupName;

    public Contact() {
    }

    public Contact(int id, String firstName, String lastName, int groupID, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupID = groupID;
        this.phone = phone;
    }

    public Contact(int id, String firstName, String lastName, String groupName, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupName = groupName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Contact> getAllContact() throws Exception {
        ArrayList<Contact> contacts = new ArrayList<>();
        try {
            Connection con = DatabaseInfo.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT Contact.ID, Contact.FirstName, Contact.LastName, "
                    + "GroupList.GroupName, Contact.Phone FROM Contact inner join GroupList on Contact.GroupID = GroupList.GroupID");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Contact c = new Contact(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                contacts.add(c);
            }
            con.close();
            return contacts;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addContact(Contact c) throws Exception {
        try {
            Connection con = DatabaseInfo.openConnection();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Contact(FirstName, LastName, GroupID, Phone)"
                    + " VALUES( ?, ?, ?, ?)");
            stmt.setString(1, c.getFirstName());
            stmt.setString(2, c.getLastName());
            stmt.setInt(3, c.getGroupID());
            stmt.setString(4, c.getPhone());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateContact(Contact c) throws Exception {
        try {
            Connection con = DatabaseInfo.openConnection();
            PreparedStatement stmt = con.prepareStatement("Update Contact set FirstName=?, LastName=?, GroupID=?, Phone=? where ID=?");
            stmt.setString(1, c.getFirstName());
            stmt.setString(2, c.getLastName());
            stmt.setInt(3, c.getGroupID());
            stmt.setString(4, c.getPhone());
            int rc = stmt.executeUpdate();
            if (rc == 1) {
                con.commit();
            } else {
                con.rollback();
            }
            con.close();
            return rc == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteContact(String id) throws Exception {
        try {
            Connection con = DatabaseInfo.openConnection();
            PreparedStatement stmt = con.prepareStatement("Delete from Contact where ID = ?");
            stmt.setString(1, id);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Contact getContact(int ID) {
        Contact b = null;
        try {
            Connection con = DatabaseInfo.openConnection();
            String sql = "Select * from Contact where ID='" + ID + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                b = new Contact(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return b;
    }

    public String getGroupName(int num) {
        String g = null;
        try {
            Connection con = DatabaseInfo.openConnection();
            String sql = "select GroupName from GroupList where GroupID='" + num + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                g = rs.getString(1);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return g;
    }
}
