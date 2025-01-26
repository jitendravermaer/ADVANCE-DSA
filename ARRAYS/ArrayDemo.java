
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(arr1); // [I@15db9742 Its present the address of the  array
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[10];
        Arrays.fill(arr2, 5);
        Arrays.fill(arr2, 2, 5, 10);
        arr2[6] = 11;
        System.out.println(Arrays.toString(arr2));

        //Traversal
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int num : arr1) {
            System.out.println(num);
        }

    }
}
