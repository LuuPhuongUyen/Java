/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.connect;

import static edu.fud.connect.databaseInfo.dbURL;
import static edu.fud.connect.databaseInfo.driverName;
import static edu.fud.connect.databaseInfo.passDB;
import static edu.fud.connect.databaseInfo.userDB;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DBUtil {

    public static Connection openConnection() throws Exception {
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
        return con;
    }
}
