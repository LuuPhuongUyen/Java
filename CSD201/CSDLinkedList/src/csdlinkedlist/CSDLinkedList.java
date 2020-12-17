/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdlinkedlist;

import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node() {
    }

    Node(int x) {
        data = x;
        next = null;
    }

}

public class CSDLinkedList {

    Node head, tail;

    CSDLinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = null;
    }

    void addLast(int x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = q;
            tail = q;
        }
        tail.next = q;
        tail = q;
    }

    void addFirst(int x) {
        Node p = new Node(x);
        p.next = head;
        head = p;
    }

    void search(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number to search: ");
        x = sc.nextInt();
        Node p = head;
        while (p != null && p.data != x) {
            p = p.next;
        }
        if (p != null) {
            System.out.println("Found " + x + " in list");
        } else {
            System.err.println(x + " not found");
        }
    }

    void traverse() {
        if (isEmpty()) {
            System.err.println("Empty");
        } else {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
        }
    }

    Node searchPos(int n) {
        Node p = head;
        int count = 1;
        while (p != null && count != n) {
            p = p.next;
            count++;
        }
        return p;
    }

    void insert(int x, int pos) {
        Node q = new Node(x);
        Node p = searchPos(pos - 1);
        if (p != null) {
            q.next = p.next;
            p.next = q;
        }
    }

    void delete(int pos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position to delete: ");
        pos = sc.nextInt();
        Node q = searchPos(pos);
        Node p = searchPos(pos - 1);
        if (p != null) {
            p.next = q.next;
        }
    }

    int nodeCount() {//number of nodes
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        System.out.println("\nNumber of nodes: " + count);
        return count;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            addLast(x);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CSDLinkedList l = new CSDLinkedList();
        l.input();
        System.out.print("List: ");
        l.traverse();
        l.search(0);
        System.out.print("Enter number to search: ");
        int n = sc.nextInt();
        Node p = l.searchPos(n);
        if (p != null) {
            System.out.print(n + " found at position: " + p.data);
        } else {
            System.err.println(n + " not found");
        }
        System.out.print("\nEnter position to insert: ");
        int pos = sc.nextInt();
        System.out.print("Enter number to insert: ");
        n = sc.nextInt();
        l.insert(n, pos);
        pos = sc.nextInt();
        l.delete(pos);
        l.traverse();
    }
}
