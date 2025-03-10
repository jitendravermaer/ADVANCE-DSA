
public class StackUsingArrayMain {

    public static void main(String[] args) throws Exception {

        // StackUsingArray stack = new StackUsingArray();
        StackUsingArray stack = new StackUsingArray(5);
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60);
            stack.push(70);
            stack.push(80);

            stack.display();
            System.out.println(stack.pop());
            stack.display();
            System.out.println(stack.peek());
            stack.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while (!stack.isEmpty()) {
            int top = stack.peek();
            System.out.println(top);
            stack.pop();
        }

        stack.display();

    }
}
