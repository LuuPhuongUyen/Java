/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdlinkedlistmanage;

import java.util.Scanner;

class Nodes {

    private Item data;
    private Nodes next;

    public Nodes() {
    }

    public Nodes(Item x) {
        data = x;
        next = null;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public Nodes getNext() {
        return next;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{"
                + "data=" + data
                + ", next=" + next
                + '}';
    }

}

public class CSDLinkedListManage {

    Nodes head, tail;

    CSDLinkedListManage() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = null;
    }

    public void addNode(Item data) {
        //Create a new node
        Nodes newNode = new Nodes(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.setNext(newNode);
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    void addLast(Item item) {
        Nodes q = new Nodes(item);
        if (isEmpty()) {
            head = q;
            tail = q;
        }
        tail.setNext(q);
        tail = q;
    }

    public void search(Item x) {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Nodes temp = head;
        while (temp != null) {
            if (temp.getData() == x) {
                System.out.println("Found " + x);
                return;
            }
            temp = temp.getNext();
        }

        if (temp == null) {
            System.out.println("Not found !!");
        }
    }

    void traverse() {
        if (isEmpty()) {
            System.err.println("Empty");
        } else {
            Nodes p = head;
            System.out.println("--------------List--------------");
            System.out.printf("%-5s %-8s %-9s %-8s\n", "ID", "Name", "Quantity", "Price");
            while (p != null) {
                System.out.println(p.toString());
                p = p.getNext();
            }
        }
    }

    public Nodes searchPos(int n) {
        int count = 0;
        Nodes temp = head;
        while (temp != null && count != n) {
            temp = temp.getNext();
            count++;
        }
        return temp;
    }

    public Nodes searchByID(String maHang) {
        if (isEmpty()) {
            System.out.println("Empty");
            return null;
        }
        Nodes temp = head;
        while (temp != null) {
            if (temp.getData().getMaHang().equals(maHang)) {
                break;
            }
            temp = temp.getNext();
        }
        return temp;
    }

    public void insert(Item data, int pos) {
        Nodes temp = searchPos(pos - 1);
        Nodes insert = new Nodes(data);
        if (temp != null) {
            insert.setNext(temp.getNext());
            temp.setNext(insert);
        } else {
            System.out.println("Out of list");
        }
    }

    void delete(int pos) {
        Scanner sc = new Scanner(System.in);
        pos = sc.nextInt();
        Nodes q = searchPos(pos);
        Nodes p = searchPos(pos - 1);
        if (p != null) {
            p.setNext(q.getNext());
        }
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add ID: ");
        String Mahang = sc.nextLine();
        System.out.print("Add name: ");
        String Tenhang = sc.nextLine();
        System.out.print("Add quantity: ");
        int Soluong = sc.nextInt();
        System.out.print("Add price: ");
        double DonGia = sc.nextDouble();
        this.addLast(new Item(Mahang, Tenhang, Soluong, DonGia));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CSDLinkedListManage l = new CSDLinkedListManage();
        l.addNode(new Item("1", "qw", 15, 12.0));
//        l.addLast(new Item("2", "aa", 1, 2.8));
        l.input();
//        System.out.print("\nEnter position to insert: ");
//        int pos = sc.nextInt();
//        System.out.print("Insert ID: ");
//        String Mahang = sc.nextLine();
//        sc.nextLine();
//        System.out.print("Insert name: ");
//        String Tenhang = sc.nextLine();
//        System.out.print("Insert quantity: ");
//        int Soluong = sc.nextInt();
//        System.out.print("Insert price: ");
//        double DonGia = sc.nextDouble();
//        System.out.print("Enter position to delete: ");
//        int p = sc.nextInt();
//        l.delete(p);
        System.out.print("Enter ID to search: ");
        String n = sc.nextLine();
        Nodes p = l.searchByID(n);
        System.out.println("Item found: " + p.getData());

        l.traverse();
    }

}
