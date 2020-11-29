/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.DatabaseInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Group {

    private int ID;
    private String Groupname, description;

    public Group() {
    }

    public Group(int ID, String Groupname, String description) {
        this.ID = ID;
        this.Groupname = Groupname;
        this.description = description;
    }

    public Group(String Groupname, String description) {
        this.Groupname = Groupname;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGroupname() {
        return Groupname;
    }

    public void setGroupname(String Groupname) {
        this.Groupname = Groupname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Group> getAllGroup() throws Exception {
        ArrayList<Group> groups = new ArrayList<>();
        try {
            Connection con = DatabaseInfo.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * From GroupList");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Group g = new Group(rs.getInt(1), rs.getString(2), rs.getString(3));
                groups.add(g);
            }
            con.close();
            return groups;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean addGroup(String name, String description) throws Exception {
        try {
            Connection con = DatabaseInfo.openConnection();
            PreparedStatement stmt = con.prepareStatement("Insert into GroupList(GroupName, GroupDescription)"
                    + " VALUES( ?, ?)");
            stmt.setString(1, name);
            stmt.setString(2, description);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
