
public class QueueUsingFixedSizeArray {

    protected int[] arr;
    protected int size;
    protected int front;
    public static final int DEFAULT_CAPACITY = 10;

    public QueueUsingFixedSizeArray() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public QueueUsingFixedSizeArray(int capacity) throws Exception {
        if (capacity < 1) {
            throw new Exception("Invalid capacity");
        }
        this.arr = new int[capacity];
        this.size = 0;
        this.front = 0;
    }

    public void enqueue(int value) throws Exception {
        if (this.size == this.arr.length) {
            throw new Exception("Queue is full");
        }
        int rearIndex = (this.front + this.size) % this.arr.length;
        this.arr[rearIndex] = value;
        this.size++;
    }

    public int dequeue() throws Exception {
        if (this.size == 0) {
            throw new Exception("Queue is empty");
        }
        int value = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front + 1) % this.arr.length;
        this.size--;
        return value;
    }

    public int front() throws Exception {
        if (this.size == 0) {
            throw new Exception("Queue is empty");
        }
        return this.arr[this.front];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean isFull() {
        return this.size() == this.arr.length;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            int index = (this.front + i) % this.arr.length;
            System.out.print(this.arr[index] + " ");
        }
        System.out.println();
    }

}
