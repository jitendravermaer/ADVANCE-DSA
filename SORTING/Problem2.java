// Given an array of names of the fruits; you are supposed to sort the fruitay in lexicographical order using the selection sort algorithm.

// Input = {"Apple", "Banana", "Kiwi", "Mango", "Pineapple", "Orange", "Grapes", "Strawberry", "Peach", "Watermelon"};
// Output = {"Apple", "Banana", "Grapes", "Kiwi", "Mango", "Orange", "Peach", "Pineapple", "Strawberry", "Watermelon"};
public class Problem2 {

    public static void sortFruits(String[] fruits) {
        for (int i = 0; i < fruits.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = fruits[minIndex];
            fruits[minIndex] = fruits[i];
            fruits[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Pineapple", "Orange", "Grapes", "Strawberry", "Peach", "Watermelon"};
        System.out.println("Original fruits : ");
        System.out.print("[ ");

        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
        System.out.println("]");

        sortFruits(fruits);
        System.out.println("Sorted fruits : ");  // Output: {"Apple", "Banana", "Grapes", "Kiwi", "Mango", "Orange", "Peach", "Pineapple", "Strawberry", "Watermelon"}  // Lexicographical order is maintained.
        System.out.print("[ ");
        for (String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
        System.out.println("]");
    }
}
