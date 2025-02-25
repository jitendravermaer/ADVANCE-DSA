
public class BubbleSort {

    static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; //has any swapping happened
            for (int j = 0; j < n - i - 1; j++) {
                // last i elements are already sorted
                if (a[j] > a[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    swapped = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!swapped) { // have any swapped happened?
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(a);
        System.out.println("Sorted array");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
