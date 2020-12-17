/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s118.createdatabase;

/**
 *
 * @author Luu Phuong Uyen
 */
public interface DatabaseInfo {

    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FULib;";
    public static String userDB = "uyenlp";
    public static String passDB = "abcd";
}
