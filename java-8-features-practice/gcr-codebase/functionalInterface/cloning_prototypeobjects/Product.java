package functionalInterface.cloning_prototypeobjects;

// Cloneable marker interface used
class Product implements Cloneable {

    String name;
    int price;

    Product(String name, int price) {

        this.name = name;
        this.price = price;
    }

    // Cloning method
    public Object clone()
            throws CloneNotSupportedException {

        return super.clone();
    }
}
