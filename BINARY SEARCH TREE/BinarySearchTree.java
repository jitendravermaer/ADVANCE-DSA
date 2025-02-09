
import java.util.Scanner;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }

    Node() {
        data = 0;
        left = right = null;
    }

}

public class BinarySearchTree {

    private Node root;

    BinarySearchTree() {
        this.root = buildTree();
    }

    private Node buildTree() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Node root = null;
        while (d != -1) {
            root = insert(this.root, d);
            d = sc.nextInt();
        }
        return root;
    }

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    void display() {
        inOrderPrint(this.root);
    }

    void inOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    boolean search(int key) {
        return searchFn(this.root, key);
    }

    boolean searchFn(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data >= key) {
            return searchFn(root.left, key);
        }
        return searchFn(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.display();
        System.out.println(bst.search(5));
        System.out.println(bst.search(10));
    }
}
