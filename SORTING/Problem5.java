// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

// Input: [0, 2, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2, 2]

public class Problem5 {
    static void sortArray(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0 -> count0++;
                case 1 -> count1++;
                case 2 -> count2++;
            }
        }

        int i = 0;
        while (count0 > 0) {
            arr[i++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[i++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[i++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 1, 2, 1, 0, 2, 1 };
        System.out.println("Sorted array: ");
        sortArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
