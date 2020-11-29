/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashList;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hash {

    LinkedList ht[];
    int M;

    Hash() {
    }

    Hash(int m) {
        M = m;
        ht = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            ht[i] = new LinkedList();
        }
    }

    int HF(int x) {
        return x % M;
    }

    void addList(int x) {
        int i = HF(x);
        ht[i].add(x);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        int i, x;
        while (true) {
            System.out.print("Enter x = ");
            x = sc.nextInt();
            if (x == -1) {
                break;
            }
            addList(x);
        }
    }

    void output() {
        for (int i = 0; i < M; i++) {
            ht[i].traverse();
            System.out.println();
        }
    }

    void delete(int x) {
        int i = HF(x);
        ht[i].delete(x);
    }

    public static void main(String[] args) {
        Hash H = new Hash(5);
        H.input();
        H.output();
        H.delete(5);
        System.out.println("After deleting: ");
        H.output();
    }
}
