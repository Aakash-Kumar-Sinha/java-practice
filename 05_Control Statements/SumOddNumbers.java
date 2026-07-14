public class SumOddNumbers {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i += 2) {
            sum = sum + i;
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}


// Output:
// Sum of odd numbers = 2500