
class Person {

    // instance variables
    String name;
    int age;

    // parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;                 // assigning values from parameters
       
    }

    // copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
        // data copied from existing object
    }

    // method to display person details
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();                    // just space
    }

    // main method
    public static void main(String[] args) {

        // original object
        Person p1 = new Person("Rahul", 20);
        System.out.println("Original Person:");
        p1.display();

        // cloned object using copy constructor
        Person p2 = new Person(p1);
        System.out.println("Copied Person:");
        p2.display();
    }
}

