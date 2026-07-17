public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay();

        p = new UPIPayment();
        p.pay();
    }
}

class Payment {
    void pay() {
        System.out.println("Making a payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using UPI");
    }
}