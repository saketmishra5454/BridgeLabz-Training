package functionalInterface.cloning_prototypeobjects;

public class CloneDemo {

    public static void main(String[] args)
            throws Exception {

        Product p1 =
                new Product("Laptop", 50000);

        // Cloning object
        Product p2 =
                (Product) p1.clone();

        System.out.println("Original: "
                + p1.name);

        System.out.println("Cloned: "
                + p2.name);
    }
}
