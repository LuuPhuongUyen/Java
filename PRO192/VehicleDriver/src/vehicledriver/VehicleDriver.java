/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicledriver;

/**
 *
 * @author PC
 */
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Bicycle bLan=new Bicycle("Lan", 2000);
    bLan.changeGear(3);
    IVehicle bTuan=new Bicycle("Dat", 4000);
    bTuan.changeGear(5);
    bLan.print();
    }
    
}
