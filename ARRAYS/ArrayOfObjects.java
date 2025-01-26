
import java.util.Arrays;

class Book {

    int isbn;
    String name;
    int price;

    public Book(int isbn, String name, int price) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{"
                + "isbn=" + isbn
                + ", name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}

public class ArrayOfObjects {

    public static void main(String[] args) {
        Book b = new Book(4, "C", 50);
        Book[] books = new Book[4];
        books[0] = new Book(1, "Java", 100);
        books[1] = new Book(2, "Python", 400);
        books[2] = new Book(3, "C++", 300);
        books[3] = b;

        for (Book book : books) {
            System.out.println("ISBN: " + book.isbn + " Name: " + book.name + " Price: " + book.price);
        }
        System.out.println(Arrays.toString(books));
        System.out.println(books);

        Arrays.sort(books, (b1, b2) -> b1.price - b2.price);
        System.out.println(Arrays.toString(books));
    }
}
