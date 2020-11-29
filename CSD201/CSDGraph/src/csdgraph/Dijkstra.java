/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdgraph;

/**
 *
 * @author PC
 */
public class Dijkstra {

    int a[][];     //adjacency matrix
    int n;         //num of vertices
    char V[];      //name of vertices
    int INF = 99;  //infinite value

    Dijkstra() {
        V = "ABCDEF".toCharArray();
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

    void Dijkstra(int b[][], int u, int v) {
        a = b;
        n = a.length;
        boolean[] choose = new boolean[n];//true -> vertix is choosen
        int[] s = new int[n];  //shortest path from u to i-th
        int[] p = new int[n];  //previous vertix of i-th 
        for (int i = 0; i < n; i++) {
            s[i] = INF;
            p[i] = i;
        }
        s[u] = 0;
        boolean hasPath = true;
        int cur = minDistance(s, choose);
        while (cur != v) {
            choose[cur] = true;
            for (int i = 0; i < n; i++) {
                if (i != cur && a[cur][i] < INF && !choose[i]) {
                    if (s[cur] + a[cur][i] < s[i]) {
                        s[i] = s[cur] + a[cur][i];
                        p[i] = cur;
                    }
                }
            }
            cur = minDistance(s, choose);
            if (cur == -1) { // check if u v connected
                hasPath = false;
                break;
            }
        }
        if (hasPath) {
            System.out.printf("\nThe length of shortest path from %c to %c is %d\n", V[u], V[v], s[v]);
            printPath(u, v, p, s);
            System.out.println();
        } else {
            System.out.printf("No path from %c to %c\n", V[u], V[v]);
        }
    }

    void printPath(int u, int v, int[] p, int[] s) {
        if (v == u) {
            System.out.print(V[u]);
            return;
        }
        printPath(u, p[v], p, s);
        System.out.printf(" -> %c(%d)", V[v], s[v]);
    }

    int minDistance(int m[], boolean[] choose) {
        int min = INF, minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (m[i] <= min && !choose[i]) {
                min = m[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Dijkstra G = new Dijkstra();
        int[][] b = {
            {0, 7, 9, 99, 99, 14},
            {7, 0, 10, 15, 99, 99},
            {9, 10, 0, 11, 99, 2},
            {99, 15, 11, 0, 6, 99},
            {99, 99, 99, 6, 0, 9},
            {14, 99, 2, 99, 9, 0}};
        G.setData(b);
        G.display();
        G.Dijkstra(b, 0, 4);
    }
}
