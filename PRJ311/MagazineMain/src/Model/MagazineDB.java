/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.Vector;
import static Model.DatabaseInfo.*;

/**
 *
 * @author PC
 */
public class MagazineDB {

    public static Magazine getMagazine(String mid) {
        try {
            Magazine mg = null;
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT MagazineTittle, Publisher, Price FROM Magazine WHERE MaID=?");
            stmt.setString(1, mid);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                mg = new Magazine(mid, rs.getString(1), rs.getString(2), rs.getFloat(3));
            }
            con.close();
            return mg;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Vector<Vector> getAll() {
        try {
            Vector<Vector> gAll = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Magazine");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector log = new Vector();
                log.addElement(rs.getString(1));
                log.addElement(rs.getString(2));
                log.addElement(rs.getString(3));
                log.addElement(rs.getFloat(4));
                gAll.addElement(log);
            }
            con.close();
            return gAll;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean newMagazine(Magazine m) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Magazine (MaID, MagazineTittle, Publisher, Price)"
                    + " VALUES(?, ?, ?, ?)");
            stmt.setString(1, m.getMaID());
            stmt.setString(2, m.getMagazineTittle());
            stmt.setString(3, m.getPublisher());
            stmt.setFloat(4, m.getPrice());
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
