package model;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.*;
import static model.DatabaseInfo.*;

public class LogLibDB implements DatabaseInfo {
    //---------------------------------------------------------------------------------------

    public static LogLib getLog(int logID) {
        return new LogLib(logID);
    }
    //---------------------------------------------------------------------------------------

    public static void update(int LogID, String uid, Date ngayMuon, Date ngayPtra, Date ngayTra, String maNV) {
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("UPDATE LogLibs SET NgayMuon=?, NgayPtra=?, NgayTra=?, MaNV=? WHERE LogID=?");
            stmt.setDate(1, new java.sql.Date(ngayMuon.getTime()));
            stmt.setDate(2, new java.sql.Date(ngayPtra.getTime()));
            stmt.setDate(3, new java.sql.Date(ngayTra.getTime()));
            stmt.setString(4, maNV);
            stmt.setInt(5, LogID);
            stmt.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    //---------------------------------------------------------------------------------------
    public static boolean borrowBook(int logID, String maNV) {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogLibDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Update LogLibs set NgayMuon=?, NgayPTra=?, MaNV=? where LogID=?");
            long oneDay = 24 * 60 * 60 * 1000;
            stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            stmt.setTimestamp(2, new Timestamp(System.currentTimeMillis() + 30 * oneDay));
            stmt.setString(3, maNV);
            stmt.setInt(4, logID);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
//---------------------------------------------------------------------------------------

    public static boolean returnBook(int logID, String maNV) {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogLibDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Update LogLibs set NgayTra=? where LogID=?");
            stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            stmt.setInt(2, logID);
            int rowCount = stmt.executeUpdate();
            con.close();
            return rowCount == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //---------------------------------------------------------------------------------------
    public static int writeLog(LogLib log) {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogLibDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Set IDENTITY_INSERT LogLibs on; Insert into LogLibs(UserID, BookID, NgayDat, NgayMuon, NgayPtra, NgayTra, MaNV, LogID) VALUES(?, ?, ?, ?, ?, ?, ?, ?);");
            stmt.setString(1, log.getUserID());
            stmt.setString(2, log.getBookID());
            stmt.setDate(3, new java.sql.Date(log.getNgayDK().getTime()));
            stmt.setDate(4, new java.sql.Date(log.getNgayMuon().getTime()));
            stmt.setDate(5, new java.sql.Date(log.getNgayPtra().getTime()));
            stmt.setDate(6, new java.sql.Date(log.getNgayTra().getTime()));
            stmt.setString(7, log.getMaNV());
            stmt.setInt(8, log.getLogID());
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    //---------------------------------------------------------------------------------------   

    public static Vector<Vector> viewLogByUser(String uid) {
        Vector<Vector> logs = getLogsByUser(uid);
        for (int i = 0; i < logs.size(); i++) {
            for (int j = 0; j < logs.get(i).size(); j++) {
                System.out.print(logs.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return logs;
    }
    //---------------------------------------------------------------------------------------   

    public static Vector<Vector> getLogsByUser(String uid) {
        try {
            Vector<Vector> logs = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("SELECT BookID, NgayDat, NgayMuon, NgayPtra, NgayTra, MaNV, LogID FROM LogLibs WHERE UserID=?");
            stmt.setString(1, uid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector log = new Vector();
                log.addElement(rs.getString(1));
                log.addElement(rs.getDate(2));
                log.addElement(rs.getDate(3));
                log.addElement(rs.getDate(4));
                log.addElement(rs.getDate(5));
                log.addElement(rs.getString(6));
                log.addElement(rs.getInt(7));
                logs.addElement(log);
            }
            con.close();
            return logs;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //---------------------------------------------------------------------------------------
    public static Vector<Vector> viewLogs() {
        try {
            Vector<Vector> gLog = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select * FROM LogLibs");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vector log = new Vector();
                log.addElement(rs.getString(1));
                log.addElement(rs.getString(2));
                log.addElement(rs.getDate(3));
                log.addElement(rs.getDate(4));
                log.addElement(rs.getDate(5));
                log.addElement(rs.getDate(6));
                log.addElement(rs.getString(7));
                log.addElement(rs.getInt(8));
                gLog.addElement(log);
            }
            con.close();
            return gLog;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //---------------------------------------------------------------------------------------   
}
