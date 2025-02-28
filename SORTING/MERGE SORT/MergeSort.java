// Time space for Merge Sort is O(nlogn) and O(n) respectively.
// Merge Sort is a divide and conquer algorithm.

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {
        int i, j, k;

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);

    }

    static void displayArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 1, 4};
        // int[] arr = {12, 11, 13, 5, 6, 7};
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        System.out.print("Unsorted array is: ");
        displayArr(arr);

        mergeSort(arr, 0, n - 1);
        System.out.print("Sorted array is: ");
        displayArr(arr);

    }
}
