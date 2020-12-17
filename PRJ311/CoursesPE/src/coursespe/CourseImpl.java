/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursespe;

import static coursespe.DatabaseInfo.*;
import coursespe.Course;
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
public class CourseImpl extends UnicastRemoteObject implements RemoteCourse {

    public CourseImpl() throws RemoteException {
        super();
    }

    @Override
    public Vector<Vector> listCourse() throws Exception {
        return Course.getAll();
    }

}
