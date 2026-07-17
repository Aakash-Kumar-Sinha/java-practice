// final keyword: Variable + Method + Class (Real-world Example)

// Final class -> Cannot be inherited
final class BankSecurity {

    // Final variable -> Constant value
    final String BANK_NAME = "State Bank";

    // Final method -> Cannot be overridden
    final void authenticateUser() {
        System.out.println("User authenticated using bank security rules.");
    }

    void displayBank() {
        System.out.println("Bank: " + BANK_NAME);
    }
}

// ❌ Compile-time Error
// class MySecurity extends BankSecurity { }

public class Main {
    public static void main(String[] args) {

        BankSecurity security = new BankSecurity();

        security.displayBank();
        security.authenticateUser();

        // ❌ Cannot change final variable
        // security.BANK_NAME = "HDFC";
    }
}