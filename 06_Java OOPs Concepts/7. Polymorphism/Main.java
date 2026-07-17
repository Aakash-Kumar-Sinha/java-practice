/*
 * JAVA POLYMORPHISM - COMPLETE REVISION
 *
 * Polymorphism = One interface, many forms
 *
 * Types:
 * 1. Compile-time Polymorphism -> Method Overloading
 * 2. Runtime Polymorphism      -> Method Overriding
 *
 * Concepts covered:
 * ✔ Inheritance
 * ✔ Method Overriding
 * ✔ Upcasting
 * ✔ Dynamic Method Dispatch
 * ✔ Runtime Polymorphism
 * ✔ Downcasting
 * ✔ instanceof
 */

public class Main {
    public static void main(String[] args) {

        // -----------------------------
        // 1. Compile-time Polymorphism (Method Overloading)
        // -----------------------------
        PaymentCalculator calculator = new PaymentCalculator();

        calculator.pay(500);                 // Cash
        calculator.pay(500, "UPI");          // UPI
        calculator.pay("Credit Card", 500);  // Credit Card

        System.out.println("---------------------");

        // -----------------------------
        // 2. Runtime Polymorphism
        // -----------------------------

        // Upcasting
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay();

        payment = new UPIPayment();
        payment.pay();

        payment = new CashPayment();
        payment.pay();

        System.out.println("---------------------");

        // -----------------------------
        // 3. Dynamic Method Dispatch
        // -----------------------------
        processPayment(new CreditCardPayment());
        processPayment(new UPIPayment());
        processPayment(new CashPayment());

        System.out.println("---------------------");

        // -----------------------------
        // 4. Downcasting
        // -----------------------------
        Payment p = new CreditCardPayment();

        if (p instanceof CreditCardPayment) {
            CreditCardPayment cc = (CreditCardPayment) p;
            cc.rewardPoints();
        }

        System.out.println("---------------------");

        // -----------------------------
        // 5. Invalid Downcasting
        // -----------------------------
        Payment p2 = new UPIPayment();

        // CreditCardPayment cc = (CreditCardPayment) p2;
        // ❌ Runtime Error:
        // java.lang.ClassCastException
    }

    static void processPayment(Payment payment) {
        payment.pay(); // Runtime decides which pay() to execute
    }
}

// ======================================
// Parent Class
// ======================================
class Payment {

    void pay() {
        System.out.println("Generic Payment");
    }
}

// ======================================
// Child Classes (Method Overriding)
// ======================================
class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using Credit Card");
    }

    void rewardPoints() {
        System.out.println("Reward points added.");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using UPI");
    }
}

class CashPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment using Cash");
    }
}

// ======================================
// Compile-time Polymorphism
// ======================================
class PaymentCalculator {

    void pay(int amount) {
        System.out.println("Cash Payment: ₹" + amount);
    }

    void pay(int amount, String mode) {
        System.out.println(mode + " Payment: ₹" + amount);
    }

    void pay(String mode, int amount) {
        System.out.println(mode + " Payment: ₹" + amount);
    }
}