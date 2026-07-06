public class DataType {
    public static void main(String[] args) {
        byte age = 25;                  // Range: -128 to 127
        short year = 2025;              // Range: -32,768 to 32,767
        int salary = 50000;             // Range: -2,147,483,648 to 2,147,483,647
        long population = 1400000000L;  // Range: -2^63 to 2^63-1
        float price = 99.99f;           // Range: ±1.4E-45 to ±3.4E38
        double pi = 3.1415926535;       // Range: ±4.9E-324 to ±1.8E308
        char grade = 'A';               // Range: 0 to 65,535 (Unicode)
        boolean isPassed = true;        // Values: true or false
        String name = "Aakash";         // Reference type (no fixed size/range)

        System.out.println(age);
        System.out.println(year);
        System.out.println(salary);
        System.out.println(population);
        System.out.println(price);
        System.out.println(pi);
        System.out.println(grade);
        System.out.println(isPassed);
        System.out.println(name);
    }
}