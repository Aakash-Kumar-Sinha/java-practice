import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}


// Output:
// Enter first number: 10
// Enter second number: 20

// After swapping:
// a = 20
// b = 10