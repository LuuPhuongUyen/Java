/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdlinkedlistmanage;

import java.util.Scanner;

class Node {

    String Mahang;

    String Tenhang;

    int Soluong;

    double DonGia;

    Node next;

    public Node() {
    }

    public Node(String Mahang, String Tenhang, int Soluong, double DonGia) {
        this.Mahang = Mahang;
        this.Tenhang = Tenhang;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        next = null;
    }

}

public class LuuPhuongUyen {

    Node head, tail;

    public LuuPhuongUyen() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = null;
    }

    void addLast(String id, String name, int amount, double price) {
        Node q = new Node(id, name, amount, price);
        if (isEmpty()) {
            head = q;
            tail = q;
        }
        tail.next = q;
        tail = q;
    }

    void traverse() {
        if (isEmpty()) {
            System.err.println("Empty");
        } else {
            Node p = head;
            System.out.printf("%-5s %-8s %-9s %-8s\n", "ID", "Name", "Quantity", "Price");
            while (p != null) {
                System.out.printf("%-5s %-8s %-9s %-8s\n", p.Mahang, p.Tenhang, p.Soluong, p.DonGia);
                p = p.next;
            }
        }
    }

    Node searchPos(String id) {
        Node p = head;
        int count = 1;
        while (p != null && (!p.Mahang.equalsIgnoreCase(id))) {
            p = p.next;
        }
        return p;
    }

    void searchItem() {
        Scanner sc = new Scanner(System.in);
        String ID;
        System.out.print("Enter ID to search: ");
        ID = sc.next();
        Node p = searchPos(ID);
        System.out.printf("%-5s %-8s %-9s %-8s\n", "ID", "Name", "Quantity", "Price");
        if (p != null) {
            System.out.printf("%-5s %-8s %-9s %-8s\n", p.Mahang, p.Tenhang, p.Soluong, p.DonGia);
        } else {
            System.err.println("Not found!");
        }
    }

    void delete(String id) {
        Node p = head, q = null;
        if (p != null && p.Mahang.equalsIgnoreCase(id)) {
            head = p.next;
            return;
        }
        while (p != null && !p.Mahang.equalsIgnoreCase(id)) {
            q = p;
            p = p.next;
        }
        if (p != null) {
            p.next = q.next;
        }
    }

    void deleteItem() {
        Scanner sc = new Scanner(System.in);
        String ID;
        System.out.print("Enter ID to delete: ");
        ID = sc.next();
        if (searchPos(ID) != null) {
            delete(ID);
        } else {
            System.err.println("Not found");
        }
    }

    void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add ID: ");
        String Mahang = sc.nextLine();
        System.out.print("Add name: ");
        String Tenhang = sc.nextLine();
        System.out.print("Add quantity: ");
        int Soluong = sc.nextInt();
        System.out.print("Add price: ");
        double DonGia = sc.nextDouble();
        addLast(Mahang, Tenhang, Soluong, DonGia);
    }

    void menu() {
        System.out.println("1. Add item");
        System.out.println("2. Search item");
        System.out.println("3. Delete item");
        System.out.println("4. Print items");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LuuPhuongUyen L = new LuuPhuongUyen();
        L.addLast("00", "aa", 2, 2);
        L.addLast("11", "bb", 3, 2);
        while (true) {
            L.menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    L.addItem();
                    break;
                case 2:
                    L.searchItem();
                    break;
                case 3:
                    L.deleteItem();
                    break;
                case 4:
                    L.traverse();
                    break;
                case 5:
                    return;
            }
        }
    }
}
