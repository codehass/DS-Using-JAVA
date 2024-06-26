package QueueDataStructure;

public class Queue {
    protected int[] arr;
    protected int front;
    protected int size;
    public static  final int DEFAULT_CAPACITY = 10;

    public Queue() throws Exception {
        this(DEFAULT_CAPACITY);
    }
    public Queue(int capacity) throws Exception {
        if(capacity < 1) {
            throw new Exception("Invalid capacity!");
        }
        this.arr = new int[capacity];
        this.size = 0;
        this.front = 0;
    }

    //o(1)
    public void enqueue(int value) throws Exception {
        if(this.size == this.arr.length) {
            throw new Exception("Queue is full!");
        }

        int rear = (this.front + this.size)% this.arr.length;
        this.arr[rear] = value;
        this.size++;
    }

    //o(1)
    public void dequeue() throws Exception{
        // Queue is empty
        if(this.size == 0){
            throw new Exception("Queue is empty");
        }

        int ans = this.arr[front];
        this.front = (this.front + 1)%this.arr.length;
        this.size--;
    }

    //o(1)
    public int peek() throws Exception {
        if(this.size == 0){
            throw new Exception("Queue is empty!");
        }

        return this.arr[this.front];
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.arr.length;
    }

    public int size() {
        return this.size;
    }

    public void display(){
        for (int i = 0; i < this.size ; i++) {
            int idx = (this.front + i) % this.arr.length;
            System.out.print(arr[idx] + ",");
        }
        System.out.println();
    }
}
