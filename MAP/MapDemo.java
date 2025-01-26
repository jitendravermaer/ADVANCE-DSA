
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();

        menu.put("Burger", 50);
        menu.put("Pizza", 100);
        menu.put("Coke", 30);
        menu.put("Fries", 20);
        menu.put("Ice Cream", 40);

        System.out.println("Menu: " + menu);

        if (menu.containsKey("Pizza")) {
            System.out.println("Price of Pizza: " + menu.get("Pizza"));
        }

        // Iterating over keys
        //Way-1
        for (String key : menu.keySet()) {
            System.out.println("Item: " + key + ", Price: " + menu.get(key));
        }

        // Iterating over values
        //Way-2
        for (Integer value : menu.values()) {
            System.out.println("Price: " + value);
        }

        // Iterating over keys and values
        //Way-3
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());
        }

        // Removing an item
        menu.remove("Coke");
        System.out.println("Menu after removing Coke: " + menu);
    }
}
