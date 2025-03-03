
public class BucketSort {
    static void bucketSort(double[] arr) {

    }

    static void displayArr(double[] arr) {
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] arr = { 0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51 };
        System.out.println("Bucket Sorting:");

        System.out.println("Before sorting:");
        displayArr(arr);
        System.out.println("After sorting:");
        bucketSort(arr);
        displayArr(arr);
    }
}
