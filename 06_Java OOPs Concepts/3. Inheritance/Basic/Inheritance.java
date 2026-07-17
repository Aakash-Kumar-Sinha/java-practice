public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aakash";
        s.age = 26;
        s.address = "Patna";

        s.speak();

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.address);
    }
}

class Person {
    String name;
    int age;
    String address;

    Person() {
        System.out.println("Person Constructor");
    }

    void speak() {
        System.out.println("Speaking");
    }
}

class Student extends Person {
    Student() {
        System.out.println("Student Constructor");
    }
}