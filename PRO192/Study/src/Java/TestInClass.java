/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.Scanner;

/**
 * 10 labs 10% 1 assignment 20% 2 PT 10% 1 PE 30% 1 FE 30%
 *
 * @author PC
 */
public class TestInClass {

    /**
     * @param args the command line arguments
     */
    static float averageLabs(float[] labs) {
        float result = 0;
        for (int i = 0; i < labs.length; i++) {
            result = result + labs[i];
        }
        result = result / 10;
        return result;
    }
//    boolean isZero() {
//        if ( == 0) 
//        {
//            return false;
//        } else {
//            return true;
//        }
//    }

    static char grade(float mark) {
        char result = 0;
        if (mark < 5) {
            result = 'F';
        }
        else if ((mark >= 5) && (mark < 8)) {
            result = 'P';
        }
        else if ((mark >= 8) && (mark < 9)) {
            result = 'G';
        }
        else if (mark >= 9) {
            result = 'E';
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        float labs, assignment, pt1, pt2, practicalExam, finalExam;
        double mark;
        float[] arrayLabs = {10, 10, 10, 9, 10, 8, 9, 8, 10, 7};
        labs = averageLabs(arrayLabs);
        System.out.println("Average of 10 labs: " + labs);
        System.out.println("Enter assignment: ");
        assignment = in.nextFloat();
        System.out.println("Enter progress test1: ");
        pt1 = in.nextFloat();
        System.out.println("Enter progress test2: ");
        pt2 = in.nextFloat();
        System.out.println("Enter practical exam: ");
        practicalExam = in.nextFloat();
        System.out.println("Enter final exam:");
        finalExam = in.nextFloat();
        mark = labs * 0.1 + assignment * 0.2 + pt1 * 0.05 + pt2 * 0.05 + practicalExam * 0.3 + finalExam * 0.3;
        System.out.printf("Final mark: %.2f", mark);
        if ((finalExam >= 4) && (mark >= 5)) {
            System.out.println("\nPassed");
        } else {
            System.out.println("\nFailed");
        }
    }
}
