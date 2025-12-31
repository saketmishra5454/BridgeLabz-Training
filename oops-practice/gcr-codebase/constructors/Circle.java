
class Circle {

    // radius of circle
    double radius;

    // default constructor
    Circle() {
        radius = 1.0;             // default radius
      
    }

    // parameterized constructor
    Circle(double r) {
        this();                   // calling default constructor first
        radius = r;
                             // radius updated with user value
    }

    // method to display radius
    void display() {
        System.out.println("Radius of Circle: " + radius);
    }

    // main method
    public static void main(String[] args) {

        // object using default constructor
        Circle c1 = new Circle();
        System.out.println("Circle using Default Constructor:");
        c1.display();

        // object using parameterized constructor
        Circle c2 = new Circle(5.5);
        System.out.println("Circle using Parameterized Constructor:");
        c2.display();
    }
}
