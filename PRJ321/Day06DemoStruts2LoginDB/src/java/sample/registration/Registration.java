/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.registration;

import connection.DatabaseInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Registration {

    private String username;
    private String password;
    private String lastname;
    private boolean role;

    public Registration() {
    }

    public Registration(String username, String password, String lastname, boolean role) {
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public boolean checkLogin(String username, String password) throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        con = DatabaseInfo.openConnection();
        try {
            if (con != null) {
                String sql = "SELECT * FROM StrutsLab5 WHERE username=? AND [password]=?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, username);
                stmt.setString(2, password);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                rs.close();
            }
            if (con != null) {
                rs.close();
            }
        }
        return false;
    }
    private List<Registration> listAccounts;

    public List<Registration> getListAccounts() {
        return listAccounts;
    }

    public void searchLastName(String searchValue) throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        con = DatabaseInfo.openConnection();
        if (con != null) {
            String sql = "SELECT * FROM StrutsLab5 WHERE lastname LIKE ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + searchValue + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("[password]");
                String lastname = rs.getString("lastname");
                Boolean role = rs.getBoolean("isAdmin");
                Registration rgs = new Registration(username, password, lastname, role);
                if (this.listAccounts == null) {
                    this.listAccounts = new ArrayList<>();
                }
                this.listAccounts.add(rgs);
            }
        }
        if (stmt != null) {
            rs.close();
        }
        if (con != null) {
            rs.close();

        }
    }
}
