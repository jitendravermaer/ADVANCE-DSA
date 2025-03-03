//Time and Space Complexity: O(nlogn) and O(logn) respectively
//Quick Sort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.

public class QuickSort {

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] < pivot) {
                cnt++;
            }
        }
        int pIndex = start + cnt;
        swap(arr, pIndex, start);

        int i = start, j = end;
        while (i < pIndex && j > pIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pIndex && j > pIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pIndex;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = { 10, 7, 8, 9, 1, 5 };
        int[] arr = { 10, 80, 30, 90, 40, 50, 70, 20, 20, 50, 50 };

        System.out.println("Before Sorting");
        displayArr(arr);
        System.out.println("After Sorting");
        quickSort(arr, 0, arr.length - 1);
        displayArr(arr);
    }
}