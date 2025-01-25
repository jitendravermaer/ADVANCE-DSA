
import java.util.HashSet;
import java.util.Set;

class Book {

    int isbn;
    String title;
    int price;

    public Book(String title, int isbn, int price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{"
                + "isbn=" + isbn
                + ", title='" + title + '\''
                + ", price=" + price
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(isbn);
    }

}

public class CustomClass {

    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book("C++", 1, 2000));
        books.add(new Book("Java", 2, 2001));
        books.add(new Book("Python", 1, 2000));

        System.out.println(books);
        System.out.println(books.contains(new Book("Java", 2, 2001)));
        System.out.println(books.size());
    }
}
