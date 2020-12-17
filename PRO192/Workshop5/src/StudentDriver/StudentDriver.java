/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDriver;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class StudentDriver {

    public static void main(String[] args) {
        Student st1 = new Student("An", "33 NVL", "C", 2019, 200);
        Staff sf1 = new Staff("Binh", "152 DBP", "THPT Phan Chau Trinh", 300);
        System.out.println(st1);
        System.out.println(sf1);
    }
}
