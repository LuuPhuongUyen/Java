/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import static Connection.databaseInfo.dbURL;
import static Connection.databaseInfo.driverName;
import static Connection.databaseInfo.passDB;
import static Connection.databaseInfo.userDB;
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
