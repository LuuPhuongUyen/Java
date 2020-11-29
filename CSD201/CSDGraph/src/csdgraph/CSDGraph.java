/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdgraph;

import java.io.RandomAccessFile;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
class Queue {

    int[] Q;
    int max = 100;
    int f, l;

    Queue(int m) {
        max = m;
        Q = new int[max];
        f = 0;
        l = 0;
    }

    int count() {
        int x = l - f;
        return x;
    }

    boolean isEmpty() {
        return count() == 0;
    }

    boolean isFull() {
        return count() == max;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.err.println("Full queue!");
        } else {
            Q[l] = x;
            l = (l + 1) % max;
        }
    }

    int dequeue() {
        int x = -1;
        if (isEmpty()) {
            System.err.println("Empty queue!");
        } else {
            x = Q[f];
            f = (f + 1) % max;
        }
        return x;
    }
}

public class CSDGraph {

    int a[][]; //adjacency matrix
    int n;     //num of vertices
    char V[];  //name of vertices

    CSDGraph() {
        V = "ABCDEFG".toCharArray();
    }

    void display() {
        System.out.println("Adjacency matrix:");
        for (int i = 0; i < n; i++) {//row
            for (int j = 0; j < n; j++) //column
            {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }

    void setData(int b[][]) {
        n = b.length;
        a = new int[n][n];
        for (int i = 0; i < n; i++) {//row
            for (int j = 0; j < n; j++) {//column
                a[i][j] = b[i][j];
            }
        }
    }

    void BFS(int k) {
        Queue q = new Queue(n + 1);
        boolean color[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            color[i] = false;//all white vertices
        }
        // System.out.println("\nBFS of the graph from k = " + k);
        System.out.println("\nBFS of the graph from " + V[k]);
        q.enqueue(k);
        color[k] = true;     //color 
        while (!q.isEmpty()) {
            int v = q.dequeue();
            //System.out.printf("%3d", v);
            System.out.print(V[v] + " ");
            for (int j = 0; j < n; j++) {
                if (color[j] == false && a[v][j] == 1) {//j ke v
                    q.enqueue(j);
                    color[j] = true;
                }
            }

        }
    }

    void DSFRe(int k, boolean color[]) {
        System.out.print(V[k] + " "); //print vertix k
        color[k] = true;   //da duyet
        for (int i = 0; i < n; i++) {
            if (color[i] == false && a[k][i] == 1) {
                DSFRe(i, color); //put into stack - recursion
            }
        }
    }

    void DSF(int x) {
        boolean color[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            color[i] = false;
        }
        System.out.println("\nDFS of the graph from " + V[x]);
        DSFRe(x, color);
    }

    void readData(String fName) throws Exception {
        RandomAccessFile f;    //doc file
        StringTokenizer t;     //xuat ki tu trong mot dong
        f = new RandomAccessFile(fName, "r");
        String size = f.readLine();   //kich thuoc ma tran
        if (size == null) {
            return;
        }
        n = Integer.parseInt(size.trim());
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = f.readLine();   //doc mot dong trong file
            t = new StringTokenizer(s);  //tach tung tu trong dong s
            for (int j = 0; j < n; j++) {
                String w = t.nextToken();
                a[i][j] = Integer.parseInt(w.trim());
            }
        }
        f.close();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDGraph G = new CSDGraph();
//        int b[][] = {
//            {0, 0, 1, 1, 0, 1, 0},
//            {0, 0, 0, 1, 1, 0, 0},
//            {1, 0, 0, 0, 0, 1, 0},
//            {1, 1, 0, 0, 1, 1, 0},
//            {0, 1, 0, 1, 0, 0, 0},
//            {1, 0, 1, 1, 0, 0, 0},
//            {0, 0, 0, 0, 0, 0, 0},};
//        G.setData(b);
        try {
            G.readData("csdMatrix.txt");
        } catch (Exception ex) {
            Logger.getLogger(CSDGraph.class.getName()).log(Level.SEVERE, null, ex);
        }
        G.display();
        G.BFS(1);
        G.DSF(1);
        System.out.println("");
    }
}
