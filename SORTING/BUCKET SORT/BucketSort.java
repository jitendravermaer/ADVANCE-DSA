
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void bucketSort(double[] arr) {
        int n = arr.length;
        // Buckets
        ArrayList<Double>[] buckets = new ArrayList[n];

        // Create empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Double>();
        }

        // Add elements into the buckets
        for (int i = 0; i < n; i++) {
            int index = (int) (n * arr[i]);
            buckets[index].add(arr[i]);
        }

        // Sort the elements of each bucket
        for (ArrayList<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Get the sorted array
        int index = 0;
        for (ArrayList<Double> bucket : buckets) {
            for (int j = 0; j < bucket.size(); j++) {
                arr[index++] = bucket.get(j);
            }
        }
    }

    static void displayArr(double[] arr) {
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // double[] arr = { 0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51 };
        double[] arr = { 0.8, 0.5, 0.6, 0.2, 0.3, 0.1, 0.4, 0.455, 0.9, 0.7, 0.89, 0.78, 0.67, 0.56, 0.45, 0.34, 0.23, 0.12, 0.11, 0.22, 0.33, 0.44, 0.55, 0.66, 0.77, 0.88, 0.99 };

        System.out.println("Before sorting:");
        displayArr(arr);
        System.out.println("After sorting:");
        bucketSort(arr);
        displayArr(arr);
    }
}
