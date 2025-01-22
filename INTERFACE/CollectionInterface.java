
import java.util.*;

public class CollectionInterface {

    public static void main(String[] args) {
        Collection<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("Python");
        s1.add("C++");

        Collection<String> s2 = new HashSet<>();
        s2.add("A");
        s2.add("B");
        s2.add("C");
        s2.add("D");

        System.out.println(s1);
        System.out.println(s2);

        s1.addAll(s2);
        System.out.println(s1);

    }
}
