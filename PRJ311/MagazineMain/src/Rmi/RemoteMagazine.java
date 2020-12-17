/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi;

import java.rmi.Remote;
import java.util.Vector;

/**
 *
 * @author PC
 */
public interface RemoteMagazine extends Remote {

    public Vector<Vector> listMagazines() throws Exception;
}
