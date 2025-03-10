
import java.util.LinkedList;
import java.util.Queue;
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

public class BinaryTree {

    // Root of Binary Tree
    Node root;

    BinaryTree() {
        Scanner sc = new Scanner(System.in);
        root = createTree(sc);
    }

    Node createTree(Scanner sc) {
        int data = sc.nextInt();
        
        //base case
        if (data == -1) {
            return null;
        }
        
        //recursive case
        Node n = new Node(data);
        n.left = createTree(sc);
        n.right = createTree(sc);
        return n;
    }

    void display() {
        // preOrderPrint(root);
        // inOrderPrint(root);
        // postOrderPrint(root);
        levelOrderPrint(root);
    }

    void preOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    void inOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    void postOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data + " ");
    }

    void levelOrderPrint(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.display();
    }
    
}
