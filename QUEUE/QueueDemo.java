
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();

        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);

        System.out.println("Queue: " + Q);
        System.out.println("First element: " + Q.peek());

        Q.poll();
        System.out.println("Queue after removing first element: " + Q);
        System.out.println("Queue size: " + Q.size());
        System.out.println(Q.isEmpty());

        while (!Q.isEmpty()) {
            Q.poll();
        }
        System.out.println("Queue after removing all elements: " + Q);

    }
}
