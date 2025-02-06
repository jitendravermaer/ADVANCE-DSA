
public class DynamicQueue extends QueueUsingFixedSizeArray {

    public DynamicQueue() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public DynamicQueue(int capacity) throws Exception {
        super(capacity);
    }

    public void enqueue(int value) {
        if (this.size == this.arr.length) {
            int[] oldArr = this.arr;
            this.arr = new int[2 * oldArr.length];
            for (int i = 0; i < oldArr.length; i++) {
                int index = (this.front + i) % oldArr.length;
                this.arr[i] = oldArr[index];
            }
            this.front = 0;
        }
        int rearIndex = (this.front + this.size) % this.arr.length;
        this.arr[rearIndex] = value;
        this.size++;
    }

    public static void main(String[] args) {
        try {
            DynamicQueue Q = new DynamicQueue(5);
            Q.enqueue(1000);
            Q.enqueue(2000);
            Q.enqueue(3000);
            Q.enqueue(4000);
            Q.enqueue(5000);

            Q.display();

            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());

            Q.display();

            Q.enqueue(6000);
            Q.enqueue(7000);
            Q.enqueue(8000);

            System.out.println(Q.front());
            System.out.println(Q.size());
            System.out.println(Q.isEmpty());
            System.out.println(Q.isFull());

            Q.display();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
