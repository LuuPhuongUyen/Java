/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s116.createdatabase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luu Phuong Uyen
 */
public class DatabaseInfo {

    private final String serverName = "localhost";
    private final String portNumber = "1433";
    private final String user = "uyenlp";
    private final String password = "abcd";

    public Connection openConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, user, password);
    }
}
