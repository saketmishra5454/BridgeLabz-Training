class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display area
    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle: %.4f\n", area);
    }

    // Method to calculate and display circumference
    void displayCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of circle: %.4f\n", circumference);
    }

    // Main method
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        c.displayArea();
        c.displayCircumference();
    }
}
