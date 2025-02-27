// Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note: You must do this in-place without making a copy of the array.

// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Time Complexity: O(n^2)
// Space Complexity: O(1)
public class Problem1 {

    public static void moveZeroes(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int[] arr = {0, 1, 0, 3, 12};
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

        System.out.println("Array before moving zeroes to the end:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        moveZeroes(arr);
        System.out.println("Array after moving zeroes to the end:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
