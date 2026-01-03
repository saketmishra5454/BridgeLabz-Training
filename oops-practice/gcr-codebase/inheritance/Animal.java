// Base class
public class Animal {
    public void sound() {            // method to be overridden
        System.out.println("Animal sound is: ");
    }

    public static void main(String[] args) {                   // main method   
        Animal myDog = new dog();   
        Animal myCat = new cat();
        Animal myBird = new bird();
        myDog.sound();
        myCat.sound();  
        myBird.sound();

    }
}

    class dog extends Animal {           // derived class
              
        public void sound() {          // overriding method
            super.sound();
            
        System.out.println("dog sound: bark");       // specific implementation
    }
    }
    class cat extends Animal {        // derived class
        public void sound() { 
            super.sound();
        System.out.println("cat sound: meow");
    }
}
    class bird extends Animal {    // derived class
        public void sound() {
            super.sound();
            System.out.println("bird sound: chirp");
        }
    }

    

