package reflection.custom_objectmapper;

// Model class
// Used to store student data
public class Student {
    private String name;
    private int age;

    // Empty constructor (needed for Reflection)
    public Student() {
    }
    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
