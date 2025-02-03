
public class StackUsingArray {

    private int[] data;
    private int top;

    public static final int DEFAULT_CAPACITY = 10;

    StackUsingArray() {
        data = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    StackUsingArray(int capacity) throws Exception {
        if (capacity < 1) {
            throw new Exception("Invalid Capacity");
        }
        data = new int[capacity];
        top = -1;
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == data.length;
    }

    public void push(int item) throws Exception {
        if (getSize() == data.length) {
            throw new Exception("Stack is Full");
        }
        data[++top] = item;
    }

    public int pop() throws Exception {
        if (getSize() == 0) {
            throw new Exception("Stack is Empty");
        }
        return data[top--];
    }

    public int peek() throws Exception {
        if (getSize() == 0) {
            throw new Exception("Stack is Empty");
        }
        return data[top];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
