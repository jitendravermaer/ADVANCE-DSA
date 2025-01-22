
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(Integer.valueOf(1));
        arr.add("Scaler");
        System.out.println(arr);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2, 3);
        System.out.println(list);

        arr.addAll(list);
        System.out.println(arr);

        list.remove(1);
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        if (arr.contains(3)) {
            System.out.println("3 is present in the list");
        }

        list.toArray();
        System.out.println(list);

        arr.toArray();
        System.out.println(arr);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
