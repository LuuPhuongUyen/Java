/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js8countword;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class JS8CountWord {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = sc.nextLine();       
        Content c = new Content();
        c.count(content);       
    }
}
