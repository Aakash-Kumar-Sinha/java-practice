public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Aakash");

        m.showDetails();
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    String name;

    Manager(String name) {
        super(name); // calls parent constructor
        this.name = "Manager " + name;
    }

    void showDetails() {
        System.out.println(this.name);       // current class variable
        System.out.println(super.name);     // parent class variable

        super.work(); // calls parent method
    }
}