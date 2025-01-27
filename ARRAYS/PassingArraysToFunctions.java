
import java.util.Arrays;

public class PassingArraysToFunctions {

    public static void doubleMoney(int money) {
        money *= 2;
    }

    public static void doubleMoney(int[] moneyArray) {
        for (int i = 0; i < moneyArray.length; i++) {
            moneyArray[i] = 2 * moneyArray[i];
        }
    }

    public static void main(String[] args) {
        //Passing Arrays vs Primitive to Functions
        int money = 100;
        int[] friendsMoneys = {100, 200, 300};

        doubleMoney(money); // This will not change the value of money
        doubleMoney(friendsMoneys); // This will change the value of friendsMoneys
        System.out.println(money);
        System.out.println(Arrays.toString(friendsMoneys));
    }
}
