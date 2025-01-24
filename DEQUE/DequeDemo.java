
import java.util.ArrayDeque;

public class DequeDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(15);
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offer(30);

        System.out.println("Dequeued elements from front: " + dq);
        System.out.println("Peek at the front: " + dq.peekFirst());
        System.out.println("Peek at the rear: " + dq.peekLast());
        System.out.println("Removed element from front: " + dq.pollFirst());
        System.out.println("Dequeued elements from front: " + dq);
        System.out.println("Removed element from rear: " + dq.pollLast());
        System.out.println("Dequeued elements from front: " + dq);

    }
}
