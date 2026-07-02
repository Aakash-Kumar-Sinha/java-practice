public class TypeCasting {
    public static void main(String[] args) {

        // Implicit casting (small to big)
        int a = 10;
        double b = a;

        System.out.println("Implicit Casting: " + b);

        // Explicit casting (big to small)
        double x = 9.78;
        int y = (int) x;

        System.out.println("Explicit Casting: " + y);
    }
}