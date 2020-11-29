package model;

import java.sql.*;
import java.util.Vector;
import java.util.logging.*;

public class LogLib implements DatabaseInfo {

    private int logID;
    private Date ngayDK, ngayMuon, ngayPtra, ngayTra;
    private String userID, bookID, maNV;

    public LogLib() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogLib.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int bookOrder(String uid, String bid) {
        try (
                Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            CallableStatement stmt = con.prepareCall("{call MuonSach(?,?,?)}");
            stmt.setString(1, bid);
            stmt.setString(2, uid);
            stmt.registerOutParameter(3, Types.INTEGER);
            stmt.execute();
            int logID = stmt.getInt(3);
            con.close();
            return logID;
        } catch (SQLException ex) {
            Logger.getLogger(LogLib.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public Vector<Vector> getLog(String uid) {
        try {
            Vector<Vector> gLog = new Vector<>();
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            PreparedStatement stmt = con.prepareStatement("Select BookID, NgayDat, NgayMuon, NgayPtra, NgayTra, MaNV, LogID FROM LogLibs where UserID = ?");
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
                gLog.addElement(log);
            }
            con.close();
            return gLog;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Vector<Vector> viewLog(String uid) {
        Vector<Vector> viewLog = getLog(uid);
        for (int i = 0; i < viewLog.size(); i++) {
            for (int k = 0; k < viewLog.get(i).size(); k++) {
                System.out.print(viewLog.get(i).get(k) + " ");
            }
            System.out.println();
        }
        return viewLog;
    }

    public LogLib(int logid) {
        this();
        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            PreparedStatement stmt = con.prepareStatement("Select LogID,userID, bookID, maNV, NgayDat, NgayMuon, NgayPtra, NgayTra, MaNV from LogLibs where LogID=?");
            stmt.setInt(1, logid);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                logID = logid;
                userID = rs.getString(2);
                bookID = rs.getString("BookID");
                ngayDK = rs.getDate(4);
                ngayMuon = rs.getDate(5);
                ngayPtra = rs.getDate(6);
                ngayTra = rs.getDate(7);
                maNV = rs.getString(8);
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(LogLib.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LogLib(int logID, Date ngayDK, Date ngayMuon, Date ngayPtra, Date ngayTra, String userID, String bookID, String maNV) {
        this.logID = logID;
        this.ngayDK = ngayDK;
        this.ngayMuon = ngayMuon;
        this.ngayPtra = ngayPtra;
        this.ngayTra = ngayTra;
        this.userID = userID;
        this.bookID = bookID;
        this.maNV = maNV;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayPtra() {
        return ngayPtra;
    }

    public void setNgayPtra(Date ngayPtra) {
        this.ngayPtra = ngayPtra;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return "LogLib{" + "logID=" + logID + ", ngayMuon=" + ngayMuon + ", bookID=" + bookID + '}';
    }

}
