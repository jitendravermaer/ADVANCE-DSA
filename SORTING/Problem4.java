// Given an array of positive and negative integers, segregate them in linear time and constant space. Output should print all negative numbers followed by all positive numbers.

// Input: [12, 11, -13, -5, 6, -7, 5, -3, -6]
// Output: [-13, -5, -7, -3, -6, 12, 11, 6, 5]

public class Problem4 {

    static void partition(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] < 0 && l < r) {
                l++;
            }
            while (arr[r] > 0 && l < r) {
                r--;
            }
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
        partition(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
