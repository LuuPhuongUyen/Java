/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursespe;

import java.rmi.Remote;
import java.util.Vector;

/**
 *
 * @author PC
 */
public interface RemoteCourse extends Remote {

    public Vector<Vector> listCourse() throws Exception;
}
