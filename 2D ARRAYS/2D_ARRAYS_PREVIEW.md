## 2D ARRAYS

### JaggedArray.java
```java
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
```

### TwoDimensionalArrays.java
```java
import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = &#123;&#123;1, 2, 3&#125;, &#123;4, 5, 6&#125;, &#123;7, 8, 9&#125;&#125;;

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
```

### TwoDimensionalArraysInput.java
```java
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
```
