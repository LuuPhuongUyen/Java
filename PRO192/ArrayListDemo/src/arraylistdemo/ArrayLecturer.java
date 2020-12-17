/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ArrayLecturer {

    public static void main(String[] args) {
        ArrayList<LectureList> arrayLecturer = new ArrayList<LectureList>();
        String[] cClass = {"1401", "1403"};
        LectureList lec = new LectureList(111, "An", "IT", cClass[1]);
        LectureList lec2 = new LectureList(112, "Anh", "IT", cClass[0]);
        arrayLecturer.add(lec);
        arrayLecturer.add(lec2);
        System.out.println(arrayLecturer);
    }
}
