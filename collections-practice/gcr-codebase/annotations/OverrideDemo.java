package annotations;

// Parent class
class Animal {

    // Method in parent class
    public void makeSound() {

        System.out.println("Animal makes some sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding parent method
    @Override
    public void makeSound() {

        System.out.println("Dog barks: Bow Bow");
    }
}

// Main class
public class OverrideDemo {

    public static void main(String[] args) {

        // Creating object of Dog class
        Dog d = new Dog();

        // Calling overridden method
        d.makeSound();
    }
}

