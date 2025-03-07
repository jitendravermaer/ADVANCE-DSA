// Given N bulbes, either on (1) or off (0).
// Turning on ith bulb causes all remaining bulbs to turn on the right to flip.

// Find the minimum number of switches to turn on all the bulbs.

// Constraints:
//     1 <= N <= 1e5
//     A[i] = {0, 1}

public class Problem1 {

    static int minSwitches(int[] A) {
        int count = 0;
        int state = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == state) {
                count++;
                state = 1 - state;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 0, 1 };
        System.out.println(minSwitches(A));
    }

}