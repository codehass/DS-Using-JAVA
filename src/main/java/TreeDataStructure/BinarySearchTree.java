package TreeDataStructure;

import java.util.Scanner;

// 8, 3, 10, 1, 6, 14, 4, 13, 7, -1
public class BinarySearchTree {
    private final Node root;

    BinarySearchTree(){
        this.root = buildTree();
    }

    public Node buildTree(){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Node root = null;

        while (d != -1){
            root = insert(root, d);
            d = sc.nextInt();
        }

        return root;
    }

    Node insert(Node root, int key){
        if(root == null ){
            return new Node(key);
        }

        if(key <= root.data){
            root.left =insert(root.left, key);
        }else {
            root.right =insert(root.right, key);
        }
        return root;
    }

    void display() {
        inorderPrint(this.root);
    }

    void inorderPrint(Node root) {
        if(root == null){
            return;
        }

        inorderPrint(root.left);
        System.out.println(root.data);
        inorderPrint(root.right);
    }

    boolean search(int key){
        return searchFn(this.root, key);
    }
    boolean searchFn(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data >= key){
            return searchFn(root.left, key);
        }
        return searchFn(root.right, key);
    }

    void removeKey(int key){
        remove(this.root,key);
    }

    Node remove(Node root, int key){
        //base case
        if(root == null){
            return null;
        }

        //rec case
        if(key < root.data){
           root.left = remove(root.left, key);
        }else if(key > root.data){
            root.right = remove(root.right, key);
        }else{
            // this is the node to be deleted
            //case 1 no children
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // case 3 (has 2 children
            //find the max node in left subtree
            Node temp = root.left;
            while (temp.right != null){
                temp = temp.right;
            }
            root.data = temp.data;
            root.left = remove(root.left, temp.data);
        }
        return root;
    }
}
