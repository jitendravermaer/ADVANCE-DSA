// Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in linear time. Assume there are no duplicates in the array.

// Input: [7 , 2, 3, 4, 5, 6, 1, 8]
// Output: [1, 2, 3, 4, 5, 6, 7, 8]

public class Problem3 {
    public static void sortArray(int[] arr) {
        int n = arr.length;
        int X = -1, Y = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (X == -1) {
                    X = i;
                } else {
                    Y = i + 1;
                }
            }
        }

        if (X != -1 && Y != -1) {
            int temp = arr[X];
            arr[X] = arr[Y];
            arr[Y] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 2, 3, 4, 5, 6, 1, 8 };
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
