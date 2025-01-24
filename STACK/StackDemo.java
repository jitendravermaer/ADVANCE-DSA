
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("C++");
        books.push("Java");
        books.push("Python");

        System.out.println(books);
        System.out.println("Top book: " + books.peek());
        System.out.println("Number of books: " + books.size());
    }
}
