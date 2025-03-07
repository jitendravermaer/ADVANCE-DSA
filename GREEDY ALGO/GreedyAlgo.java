public class GreedyAlgo {

    static int GreedyAlgo(int[] A) {
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
        System.out.println(GreedyAlgo(A));
    }
}
