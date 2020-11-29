package model;

import java.sql.*;
import java.util.logging.*;

public class UserDB implements DatabaseInfo {
    //-------------------------------------------------------------------------------

    public static boolean updateUser(User u) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement("Update Users set fullName=?, password=?, email=?, status=?, userright=? where userid=?");
            stmt.setString(1, u.getFullName());
            stmt.setString(2, u.getPassword());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getStatus());
            stmt.setInt(5, u.getUserRight());
            stmt.setString(6, u.getUserID());
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
    //-------------------------------------------------------------------------------   

    public static int doBookOrder(String uid, String bid) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            CallableStatement stmt = con.prepareCall("{call MuonSach(?,?,?)}");
            stmt.setString(1, bid);
            stmt.setString(2, uid);
            stmt.registerOutParameter(3, 5);
            stmt.execute();
            int logid = stmt.getInt(3);
            con.close();
            return logid;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    //-------------------------------------------------------------------------------   

    public static User getUser(String uid) {
        User u = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select fullName, email, password, status, userright from Users where userID='" + uid + "'");
            if (rs.next()) {
                String fullName = rs.getString(1);
                String email = rs.getString(2);
                String password = rs.getString(3);
                String status = rs.getString(4);
                int userRight = rs.getInt(5);
                String userID = uid;
                u = new User(userID, fullName, email, password, status, userRight);
            }
            con.close();
            return u;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //--------------------------------------------------------------------------------------------

    public static boolean addNewUser(User u) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Users(UserID, FullName, Email, Password, Status, UserRight) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, u.getUserID());
            stmt.setString(2, u.getFullName());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getPassword());
            stmt.setString(5, u.getStatus());
            stmt.setInt(6, u.getUserRight());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    //--------------------------------------------------------------------------------------------   
}
