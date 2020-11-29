/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.DatabaseInfo.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class CountryDB {

    public static Country getCountry(String cid) {
        Country c = null;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT CountryName, NumOfInfected, NumOfDead FROM InfectedCountry WHERE CountryID=?");
            if (rs.next()) {
                String cName = rs.getString(1);
                int infected = rs.getInt(2);
                int dead = rs.getInt(3);
                String countryID = cid;
                c = new Country(countryID, cName, infected, dead);
            }
            con.close();
            return c;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CountryDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Vector<Vector> getAll() {
        try {
            Vector<Vector> gAll = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM InfectedCountry");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector log = new Vector();
                log.addElement(rs.getString(1));
                log.addElement(rs.getString(2));
                log.addElement(rs.getInt(3));
                log.addElement(rs.getInt(4));
                gAll.addElement(log);
            }
            con.close();
            return gAll;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean newCountry(Country c) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO InfectedCountry(CountryID, CountryName, NumOfInfected, NumOfDead)"
                    + " VALUES(?, ?, ?, ?)");
            stmt.setString(1, c.getCountryID());
            stmt.setString(2, c.getCountryName());
            stmt.setInt(3, c.getNumOfInfected());
            stmt.setInt(4, c.getNumOfDead());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
