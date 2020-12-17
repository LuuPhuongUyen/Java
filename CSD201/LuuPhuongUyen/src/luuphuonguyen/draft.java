/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luuphuonguyen;

/**
 *
 * @author PC
 */
public class draft {

    int vocung = 99;
    int[][] b = {
        {0, 7, 9, 99, 99, 14},
        {7, 0, 10, 15, 99, 99},
        {9, 10, 0, 11, 99, 2},
        {99, 15, 11, 0, 6, 99},
        {99, 99, 99, 6, 0, 9},
        {14, 99, 2, 99, 9, 0}
    };

    //Khởi tạo method Dijkstra
    void ijk(int Fnode, int Lnode) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] == 0 && i != j) {
                    b[i][j] = vocung;
                }
            }
        }
        //Khởi tạo boolean array để duyệt đồ thị
        boolean s[] = new boolean[b.length];
        //Khởi tạo 2 mảng tạm
        int l[] = new int[b.length];
        int p[] = new int[b.length];
        //Khởi tạo thông số cho 3 mảng.
        for (int k = 0; k < b.length; k++) {
            s[k] = false;
            l[k] = vocung;
            p[k] = Fnode;
        }
        //Khoảng cách của đỉnh nguồn từ chính nó luôn là 0
        l[Fnode] = 0;
        //Dò và tìm khoảng cách ngắn nhất
        for (int count = 0; count < b.length; count++) {
            int i = minDistance(l, s);
            s[i] = true;
            for (int j = 0; j < b.length; j++) {
                if (!s[j] && l[i] + b[i][j] < l[j]) {
                    l[j] = l[i] + b[i][j];
                }
            }
        }
        System.out.println(l[Lnode]);
    }

    int minDistance(int l[], boolean[] s) {
        int min = vocung, min_index = -1;
        for (int i = 0; i < b.length; i++) {
            if (l[i] <= min && !s[i]) {
                min = l[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        draft d = new draft();
        d.ijk(0, 4);
    }
}
