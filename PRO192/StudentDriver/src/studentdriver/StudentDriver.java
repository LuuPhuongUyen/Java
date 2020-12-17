/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

/**
 *
 * @author PC
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student anh1 = new Student("Tue", " DE110", 2000, 7.8);
        System.out.println(anh1);
        anh1.print();
        Student anh2 = new Student();
        anh2.name = "MI";
        anh2.ID = " DE409";
        anh2.year = 2000;
        anh2.marks = 7.3;
        anh2.print();
        anh2.shopping();
        anh2.goToUni();
        System.out.println(anh2);
    }
}
