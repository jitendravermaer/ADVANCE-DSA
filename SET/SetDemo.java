
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(10);
        s.add(30);
        s.add(20);
        s.add(15);
        s.add(78);
        s.add(15);

        System.out.println("Set: " + s);
        System.out.println(s.contains(15));

    }
}
