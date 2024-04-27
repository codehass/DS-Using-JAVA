package LinkedListDataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        head = tail = null;
        size = 0;
    }

    //o(1)
    public void addFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        if(size == 0) {
            tail = n;
        }
        size++;
    }

    //o(1)
    public void addLast(int data) {
        Node n = new Node(data);
        if(size ==0){
            head = tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }
    public void addAt(int data, int index) throws Exception {
        if(index < 0 || index > size){
            throw new Exception("Index out of bounds");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        }else{
            Node temp = head;
            for (int i = 1; i < index ; i++) {
                temp = temp.next;
            }
            Node n = new Node(data);
            n.next = temp.next;
            temp.next =n;
            size++;
        }
    }

    public int getFirst() throws Exception {
        if(size == 0){
            throw  new Exception("List is Empty");
        }
        return head.data;
    }
    public int getLast()throws Exception {
        if(size == 0){
            throw  new Exception("List is Empty");
        }
        return tail.data;
    }

    public int getAt(int index) throws Exception {
        if(index < 0 || index >= size){
            throw new Exception("Index out of bounds");
        }
        else if(index==0){
            return getFirst();
        }else if (index == size -1 ){
            return getLast();
        }else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public int removeFirst() throws Exception{
        if(size ==0){
            throw new Exception("List is empty");
        }
        Node output = head;
        if(size==1){
            head=tail=null;
            size =0;
        }else{
            head = head.next;
            this.size--;
        }

        return output.data;
    }
    public int removeLast() throws Exception{
        if(size ==0){
            throw new Exception("List is empty");
        }
        int output = tail.data;
        if(size==1){
            head = tail = null;
            size =0;
        }else{
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            this.size--;
        }

        return output;
    }

    public int removeAt(int index) throws Exception {
        if(size==0){
            throw new Exception("List is Empty");
        }
        if(index <0 || index >= size){
            throw  new Exception("Index out of bounds!");
        }
        if (index == 0) {
            return removeFirst();
        }else if (index == size - 1){
            return removeLast();
        }else{
            Node temp = head;
            for (int i = 1; i < index ; i++) {
                temp = temp.next;
            }
            Node output = temp.next;
            temp.next = output.next;
            size--;
            return output.data;
        }

    }

    //o(1)
    public int getSize(){
        return size;
    }

    //o(n)
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
