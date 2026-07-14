public class FibonacciSeries {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.print(a + "," + b);

        while (true) {
            int c = a + b;

            if (c > 100) {
                break;
            }

            System.out.print("," + c);

            a = b;
            b = c;
        }
    }
}


// Output:
// 0,1,1,2,3,5,8,13,21,34,55,89