
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:" + Arrays.toString(arr));

        //Read N numbers and print then in reverse order
        int N;
        System.out.println("Enter the number of elements:");
        N = sc.nextInt();

        int[] numbers = new int[N];
        System.out.print("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
