
public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);

        System.out.println("Size: " + arr.size());
        System.out.println("Capacity: " + arr.getCapacity());
        arr.add(110);
        arr.remove(0);
        arr.add(120);

        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
