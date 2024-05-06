package TreeDataStructure;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d){
        this.data = d;
        this.left = this.right = null;
    }
}
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
}
