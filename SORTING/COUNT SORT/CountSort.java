public class CountSort {
    static void countSort(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
            }
        }

    }

    static void displayArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 121, 11, 45, 66, 23, 11, 90 };
        int arr[] = { 4, 2, 2, 8, 3, 3, 1, 5, 8, 8, 5, 4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int n = arr.length;
        System.out.println("Given array is");
        displayArr(arr);
        System.out.println("Sorted array is");
        countSort(arr, n);
        displayArr(arr);
    }
}
