/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdbinarytree;

/**
 *
 * @author PC
 */
class Node {

    int data;
    Node left, right;//point

    Node() {
    }

    Node(int x) {
        data = x;
        left = right = null;
    }
}

class Queue {

    Node[] Q;
    int max = 100;
    int f, l;

    Queue(int m) {
        max = m;
        Q = new Node[max];
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

    void enqueue(Node x) {
        if (isFull()) {
            System.err.println("Full queue!");
        } else {
            Q[l] = x;
            l = (l + 1) % max;
        }
    }

    Node dequeue() {
        Node x = null;
        if (isEmpty()) {
            System.err.println("Empty queue!");
        } else {
            x = Q[f];
            f = (f + 1) % max;
        }
        return x;
    }
}

public class CSDBinaryTree {

    Node root;

    public CSDBinaryTree() {
        root = null;
    }

    Node insert(int x, Node root) {
        if (root == null) {
            root = new Node(x);
            return root;
        }
        if (x < root.data) {
            root.left = insert(x, root.left);
        } else if (x > root.data) {
            root.right = insert(x, root.right);
        } else {
            x = root.data;
            System.err.print(x + " existed");
        }

        return root;
    }

    void insertRec(int x) {
        root = insert(x, root);
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void pre() {
        preOrder(root);
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void in() {
        inOrder(root);
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

    }

    void post() {
        postOrder(root);
    }

    int minNode(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    Node del(int x, Node root) {
        if (root == null) {
            return root;
        }
        if (x < root.data) {
            root.left = del(x, root.left);
        } else if (x > root.data) {
            root.right = del(x, root.right);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = minNode(root.right);
                root.right = del(root.data, root.right);
            }
        }
        return root;

    }

    void delete(int x) {
        del(x, root);
    }

    void BFT() {
        if (root == null) {
            System.out.println("Empty");
            return;
        }
        Queue Q = new Queue(100);
        Q.enqueue(root);
        Node p;
        while (!Q.isEmpty()) {
            p = Q.dequeue();
            if (p.left != null) {
                Q.enqueue(p.left);
            }
            if (p.right != null) {
                Q.enqueue(p.right);
            }
            System.out.print(p.data + " ");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        CSDBinaryTree bTree = new CSDBinaryTree();
        bTree.insertRec(7);
        bTree.insertRec(4);
        bTree.insertRec(9);
        bTree.insertRec(2);
        bTree.insertRec(1);
//        bTree.insertRec(7);
//        bTree.insertRec(6);
//        bTree.insertRec(8);
//        bTree.insertRec(10);
        System.out.print("Preoder: ");
        bTree.pre();
        System.out.println("");
        System.out.print("Inoder: ");
        bTree.in();
        System.out.println("");
        System.out.print("Postoder: ");
        bTree.post();
        bTree.delete(15);
//        System.out.println("");
//        System.out.print("Preoder after deleting 15: ");
//        bTree.pre();
        System.out.println("");
        System.out.print("BFT: ");
        bTree.BFT();
    }
}
