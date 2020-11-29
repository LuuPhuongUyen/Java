/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashList;

/**
 *
 * @author PC
 */
public class LinkedList {

    Node head, tail;

    LinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = p;
            tail = p;
        } else {  //add p to the tail
            tail.next = p;
            tail = p;
        }
    }

    void traverse() {
        Node p = head;
        if (isEmpty()) {
            System.out.print("Null");
            return;
        }
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    Node search(int x) {
        Node p = null;
        while (p != null) {
            if (p.data == x) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    void delete(int x) {
        Node p = head;
        Node q = null;
        if (isEmpty()) {
            System.err.println("Empty!");
            return;
        }
        if (head.data == x) {
            head = head.next;
            if (isEmpty()) {
                tail = null;
            }
            return;
        }
        while (p != null && p.data != x) {
            q = p; //danh dau pt truoc p
            p = p.next;
        }
        if (p != null) {
            q.next = p.next;
        } else {
            System.out.println(x + " not found!");
        }
    }
}
