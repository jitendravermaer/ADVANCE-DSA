
import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.addLast(8);
        list.add(2, 15);
        System.err.println(list);
        System.err.println(list.toString());

        List<Integer> list2 = new ArrayList<>();
        list.add(25);
        list2.addAll(list);
        System.err.println(list2);
    }
}
