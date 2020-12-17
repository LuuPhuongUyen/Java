/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s018studentmanagementrmi;

import com.sun.security.ntlm.Client;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class StudentImplement extends UnicastRemoteObject implements RemoteInterface {

    public StudentImplement() throws RemoteException {
    };

    @Override
    public void savefile(String mail, String name, String age, String gender) throws RemoteException {
        File file = new File("sv.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(StudentImplement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write("Email: ".getBytes());
            fos.write(mail.getBytes());
            fos.write("\n".getBytes());
            fos.write("Name: ".getBytes());
            fos.write(name.getBytes());
            fos.write("\n".getBytes());
            fos.write("Sex: ".getBytes());
            fos.write(gender.getBytes());
            fos.write("\n".getBytes());
            fos.write("Age: ".getBytes());
            fos.write(age.getBytes());
            fos.write("\n".getBytes());
            fos.close();
            System.out.println("Done!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
