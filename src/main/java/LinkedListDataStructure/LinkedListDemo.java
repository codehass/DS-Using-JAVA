package LinkedListDataStructure;

public class LinkedListDemo {
    public static void main(String[] args) throws Exception {
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.display();
        l.removeFirst();
        l.display();
        l.removeAt(1);
        l.display();
        /*l.addLast(40);
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addLast(50);

        l.display();
        System.out.println(l.getSize());

        l.addAt(0,0);
        l.addAt(30,4);
        l.addAt(100,l.getSize());

        l.display();
        System.out.println(l.getSize());
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getAt(3));*/
    }
}
