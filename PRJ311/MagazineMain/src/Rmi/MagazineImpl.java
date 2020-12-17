/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import static Model.DatabaseInfo.dbURL;
import static Model.DatabaseInfo.driverName;
import static Model.DatabaseInfo.passDB;
import static Model.DatabaseInfo.userDB;
import Model.Magazine;
import Model.MagazineDB;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class MagazineImpl extends UnicastRemoteObject implements RemoteMagazine {

    public MagazineImpl() throws RemoteException {
        super();
    }

//    @Override
//    public List<Magazine> listMagazines() throws Exception {
//        List<Magazine> list = new ArrayList<Magazine>();
//        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
//            Class.forName(driverName);
//            PreparedStatement stmt = con.prepareStatement("Select * FROM Magazine");
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                Magazine ma = new Magazine();
//                ma.setMaID(rs.getString(1));
//                ma.setMagazineTittle(rs.getString(2));
//                ma.setPublisher(rs.getString(3));
//                ma.setPrice(rs.getFloat(4));
//                list.add(ma);
//            }
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

    @Override
    public Vector<Vector> listMagazines() throws Exception {
        return MagazineDB.getAll();
    }
}
