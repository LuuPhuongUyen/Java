/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.*;
import java.util.Scanner;
import model.LogLib;
import model.User;

/**
 *
 * @author PC
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=FuLib",
                "uyenlp", "1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select fullname from Users where userID='U0001'");
        rs.next();
        System.out.print(rs.getString(1));
        con.close();
    }
}
