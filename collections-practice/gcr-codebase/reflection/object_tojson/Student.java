package reflection.object_tojson;

// Model class
// Stores student data
public class Student {

    private String name;
    private int age;
    private String course;

    // Empty constructor
    public Student() {
    }

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

