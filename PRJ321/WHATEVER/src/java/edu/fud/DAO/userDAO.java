/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.DAO;

import edu.fud.connect.DBUtil;
import edu.fud.model.User;
import static edu.fud.connect.databaseInfo.dbURL;
import static edu.fud.connect.databaseInfo.driverName;
import static edu.fud.connect.databaseInfo.passDB;
import static edu.fud.connect.databaseInfo.userDB;
import edu.fud.model.Library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author Hoang My
 */
public class userDAO {

    public static boolean addNewUser(String Name, String UserName, String Password, String Email) throws SQLException, NamingException, Exception {
        try {
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO UserInformation(Name,UserName,PassWord,Email) values(?,?,?,?) ");
            stmt.setString(1, Name);
            stmt.setString(2, UserName);
            stmt.setString(3, Password);
            stmt.setString(4, Email);
            int rc = stmt.executeUpdate();
            con.close();
            return true;
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteUser(int uid) throws Exception {
        try {
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("Delete FROM UserInformation where UserID = ?");
            stmt.setInt(1, uid);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int updateUser(int userID, String name, String userName, String email, int userRight) {
        int rc = 0;
        try {
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("UPDATE UserInformation SET Name=?, UserName=?,Email=?,UserRight=? where UserID='" + userID + "'");
            stmt.setString(1, name);
            stmt.setString(2, userName);
            stmt.setString(3, email);
            stmt.setInt(4, userRight);
            rc = stmt.executeUpdate();
            con.close();
            System.out.println("Updated User successfully!");
        } catch (Exception ex) {
            System.out.println("Update User failed!");
        }
        return rc;
    }

    public static User getUserbyUserName(String username) {
        User u = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select Name, UserName,PassWord,Email,UserRight,UserID from UserInformation where UserName='" + username + "'");
            if (rs.next()) {
                String Name = rs.getString(1);
                String userName = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);
                int userRight = rs.getInt(5);
                int userID=rs.getInt(6);
                u = new User(userID, Name, userName, password, email, userRight);
            }
            con.close();
            return u;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(userDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static User getUserbyID(int uid) {

        try {
            User u = null;
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select Name, UserName,Password,Email,UserRight from UserInformation where UserID='" + uid + "'");
            if (rs.next()) {
                String Name = rs.getString(1);
                String userName = rs.getString(2);
                String password=rs.getString(3);
                String email = rs.getString(4);
                int userRight = rs.getInt(5);
                int userID = uid;
                u = new User(userID, Name, userName, password, email, userRight);
            }
            con.close();
            return u;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(userDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static List<User> getAllUser() {
        try {
            User user = null;
            Connection con = DBUtil.openConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT [UserID], [Name],[UserName],[Email],[UserRight] FROM UserInformation");
            ResultSet rs = stmt.executeQuery();
            List<User> list = new ArrayList<User>();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                list.add(user);
            }
            con.close();
            return list;

        } catch (Exception ex) {
            Logger.getLogger(bookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   public boolean UpdateProfile(String Name,String UserName,String Password,String Email,int userID)
            throws SQLException,NamingException,Exception{
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = DBUtil.openConnection();
                String sql ="UPDATE [UserInformation] SET [Name]=?,[UserName]=?,[Password]=?,[Email]=? WHERE [UserID]=?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, Name);
                stmt.setString(2, UserName);
                stmt.setString(3, Password);
                stmt.setString(4, Email);
                stmt.setInt(5, userID);
                
                stmt.executeUpdate();
                    return true;
//                    con.close();
//            System.out.println("Updated User successfully!");
        } catch (Exception ex) {
            System.out.println("Update User failed!");
        }
        return false;
    }
}