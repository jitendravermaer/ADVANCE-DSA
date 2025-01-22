
interface PaymentMethod {

    void pay();
}

class DebitCard implements PaymentMethod {

    public void pay() {
        System.out.println("Payment done using Debit Card");
    }
}

class CreditCard implements PaymentMethod {

    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI implements PaymentMethod {

    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class PaymentMethodDemo {

    public static void makePayment(PaymentMethod pm) {
        pm.pay();
    }

    public static void main(String[] args) {
        PaymentMethod pm1 = new DebitCard();
        PaymentMethod pm2 = new CreditCard();
        PaymentMethod pm3 = new UPI();
        makePayment(pm1);
        makePayment(pm2);
        makePayment(pm3);
    }
}
