/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdhash;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CSDHash {

    int ht[]; //hash table
    int M;    //max size

    CSDHash() {
    }

    CSDHash(int m) {
        M = m;
        ht = new int[M];
        for (int i = 0; i < M; i++) {
            ht[i] = -1;
        }
    }

    int hf(int x) { //hash fuction
        return x % M;
    }

    void hashing(int x) {
        int i;
        i = hf(x);
        ht[i] = x;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        int x;
        while (true) {
            System.out.print("Enter number x = ");
            x = sc.nextInt();
            if (x == -1) {
                break;
            } else {
                //hashing(x);  //send x to ht
                //proHashing(x);
                quadraticHashing(x);
            }
        }
    }

    void output() {
        for (int i = 0; i < M; i++) {
            if (ht[i] == -1) {
                System.out.print("Null ");
            } else {
                System.out.print(ht[i] + " ");
            }
        }
    }

    void proHashing(int x) {
        int i = hf(x);
        int j = 0;
        while (ht[i] != -1 && j < M) {
            j += 1;
            i = (hf(x) + j) % M;
        }
        if (j == M) {
            System.err.println("Hash table is overflow!");
            output();
            System.out.println();
            return;
        } else {
            ht[i] = x;
        }
    }

    void quadraticHashing(int x) {
        int i = hf(x);
        int j = 0;
        while (ht[i] != -1 && j < M) {
            j += 1;
            i = (hf(x) + j * j) % M;
        }
        if (j == M) {
            System.err.println("Hash table is overflow!");
            output();
            System.out.println();
            return;
        } else {
            ht[i] = x;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDHash H = new CSDHash(5);
        H.input();
        H.output();
    }
}
