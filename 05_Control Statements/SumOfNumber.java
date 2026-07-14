import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of number = " + sum);

        sc.close();
    }
}


// Output:
// Enter a number: 123
// Sum of number = 6