public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Aakash";
        s1.age = 26;

        Student s2 = new Student();

        s2.name = "Juli";
        s2.age = 25;

        s1.introduce();

        s2.introduce();
    }
}


class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi");
        System.out.println("My name is: " + name);
        System.out.println("Age is " + age);
    }
}