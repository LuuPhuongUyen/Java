/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DatabaseInfo {

    public static Connection openConnection() throws Exception {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=ContactDB;"
                + "User=uyenlp;Password=abcd";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(connectionUrl);
        return con;
    }
}
