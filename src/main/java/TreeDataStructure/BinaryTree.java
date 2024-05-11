package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Node root;

    BinaryTree() {
        Scanner sc = new Scanner(System.in);
        root = createTree(sc);
    }

    Node createTree(Scanner sc){
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        Node n = new Node(data);
        n.left = createTree(sc);
        n.right = createTree(sc);

        return n;
    }

    void display(){
        //preorderPrint(root);
        //inorderPrint(root);
        //postorderPrint(root);
        levelOrderPrint(root);
    }

    void preorderPrint(Node root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    //In-order we print the left tree then the root then the right tree
    void inorderPrint(Node root) {
        if(root == null){
            return;
        }
        inorderPrint(root.left);
        System.out.println(root.data);
        inorderPrint(root.right);
    }

    //In postorderPrint: we print the left tree, then the right tree, then the root
    void postorderPrint(Node root) {
        if(root == null){
            return;
        }
        inorderPrint(root.left);
        inorderPrint(root.right);
        System.out.println(root.data);
    }

    //Breath first traversal
    // Level Order Print: we print all the elements in the same level then we go to the next level
    // we use Queue
    void levelOrderPrint(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()){
            Node f = q.poll();
            System.out.println(f.data);
            if(f.left != null){
                q.offer(f.left);
            }
            if(f.right != null){
                q.offer(f.right);
            }
        }
    }
}
