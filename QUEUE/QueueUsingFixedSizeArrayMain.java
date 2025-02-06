
public class QueueUsingFixedSizeArrayMain {

    public static void main(String[] args) {
        try {
            QueueUsingFixedSizeArray Q = new QueueUsingFixedSizeArray(5);
            Q.enqueue(10);
            Q.enqueue(20);
            Q.enqueue(30);
            Q.enqueue(40);
            Q.enqueue(50);

            Q.display();

            System.out.println(Q.dequeue());
            System.out.println(Q.dequeue());

            Q.display();

            System.out.println(Q.front());
            System.out.println(Q.size());
            System.out.println(Q.isEmpty());
            System.out.println(Q.isFull());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
