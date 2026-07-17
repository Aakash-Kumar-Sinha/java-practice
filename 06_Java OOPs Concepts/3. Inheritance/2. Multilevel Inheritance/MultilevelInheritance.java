public class MultilevelInheritance {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();

        g.speak();      // Grandparent
        g.study();      // Parent
        g.research();   // Own
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

class GraduateStudent extends Student {
    void research() {
        System.out.println("Graduate student researches");
    }
}