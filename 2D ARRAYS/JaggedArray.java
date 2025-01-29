
import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        // Jagged array is an array of arrays where each row can have different number of columns
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            System.out.println("Enter the elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The jagged array is: ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        sc.close();
        System.err.println(Arrays.deepToString(arr));
    }
}
