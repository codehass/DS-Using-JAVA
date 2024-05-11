package TreeDataStructure;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.display();
        System.out.println(bst.search(4));
        System.out.println(bst.search(41));
    }
}
