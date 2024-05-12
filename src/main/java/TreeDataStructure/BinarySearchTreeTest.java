package TreeDataStructure;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.display();
        //10 20 30 41 3 5 7 8 9 -1
        bst.removeKey(41);
        bst.display();
        //System.out.println(bst.search(4));
        //System.out.println(bst.search(41));
    }
}
