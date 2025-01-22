
import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void f1() {
        int[] arr = {4, 2, 7, 1, 5, 6, 0, 7, 1, 8, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

    public static void f2() {
        String[] fruits = {"orange", "grapes", "apple", "banana", "mango"};
        Arrays.sort(fruits);
        System.out.println("Sorted Array: " + Arrays.toString(fruits));
        Arrays.sort(fruits, Collections.reverseOrder());
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(fruits));
    }

    public static void f3() {
        Float[] numbers = {(float) 4.3, (float) 5.2, (float) 6.8, (float) 1.2, (float) 3.4, (float) 2.3};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
