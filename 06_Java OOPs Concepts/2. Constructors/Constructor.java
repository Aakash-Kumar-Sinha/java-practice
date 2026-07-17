public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.student();

        Student s2 = new Student(20);

        Student s3 = new Student("Rahul", 20);
        Student s4 = new Student("Aman", 22);

        System.out.println("Hi i am " + s3.name + ", age is " + s3.age);
        System.out.println("Hi i am " + s4.name + ", age is " + s4.age);
    }
}


class Student {
    String name;
    int age;

    Student() {
        System.out.println("Hi i am a Constructor");
    }

    void student() {
        System.out.println("Hi i am a Method");
    }

    Student(int age) {
        System.out.println("Hi i am Parameterized Constructor " + age);
    }

    Student(String n, int a) {
        name = n;
        age = a;

        System.out.println("Hi i am " + n + " from constructor, age is " + a);
    }
}