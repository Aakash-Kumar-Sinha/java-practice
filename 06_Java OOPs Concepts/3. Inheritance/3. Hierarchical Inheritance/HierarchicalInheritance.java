public class HierarchicalInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.speak();
        s.study();

        t.speak();
        t.teach();
    }
}

class Person {
    void speak() {
        System.out.println("Person speaks");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches");
    }
}