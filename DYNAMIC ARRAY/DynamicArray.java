
import java.util.Arrays;

public class DynamicArray {

    private int arr[];
    private int currentSize;
    private int capacity;
    private static final int DEFAULT = 10;

    public DynamicArray() {
        arr = new int[DEFAULT];
        currentSize = 0;
        capacity = DEFAULT;
    }

    public DynamicArray(int cap) {
        arr = new int[cap];
        currentSize = 0;
        capacity = cap;
    }

    public void add(int element) {
        if (currentSize == capacity) {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }
        arr[currentSize++] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        currentSize--;
    }

    public int get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return currentSize;
    }
}
