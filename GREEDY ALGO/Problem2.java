// Given an array of N integers.

// Find the highest product by multiplying 3 elements.

// Constraints:
//     3 <= N <= 5e5

// Input: [1, 2, 3, 4]
// Ex: 2 * 3 * 4 = 24
// Output: 24

// Input: [0, -1, 10, 7, 5]
// Ex: 5 * 7 * 10 = 350
// Output: 350

public class Problem2 {
    
    static int findHighestProduct(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }

            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(findHighestProduct(arr)); // 24

        int[] arr2 = { 0, -1, 10, 7, 5 };
        System.out.println(findHighestProduct(arr2)); // 350
    }
}
