
import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i + j;
            }
        }

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] a : arr2) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
