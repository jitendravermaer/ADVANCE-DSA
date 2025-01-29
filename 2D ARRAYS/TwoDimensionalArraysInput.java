
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArraysInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        sc.close();

        System.out.println(Arrays.deepToString(arr));
    }
}
