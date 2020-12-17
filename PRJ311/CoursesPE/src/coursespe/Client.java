/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursespe;

import coursespe.Course;
import java.rmi.Naming;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class Client {

    public Client() {
    }

    public static void main(String[] args) throws Exception {
        try {
            RemoteCourse stub = (RemoteCourse) Naming.lookup("rmi://localhost:1156/CourseRemote");
            Vector<Vector> list = stub.listCourse();
            System.out.println(list);
            System.out.println("");
            // }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
