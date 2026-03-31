package inheritance;
//Restaurant Management System using Inheritance and Interfaces
interface Worker{              //Interface
    void performDuties();
}


class Person {               //Base Class
    String name;
    int id;
    public Person(String name, int id){             //Parameterized Constructor
        this.name = name;
        this.id = id;
    }
    public void displayPersonDetails() {          //Method to display person details
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }


}

class Chef extends Person implements Worker{         //Derived Class
    public Chef(String name,int id){
        super(name,id);

    }
    public void performDuties(){
        System.out.println("Chef " + name + " is preparing meals.");
    }

}


class Waiter extends Person implements Worker{           //Derived Class
    public Waiter(String name,int id){
        super(name,id);

    }
    public void performDuties(){             //Implementing method from Worker interface
        System.out.println("Waiter " + name + " is serving customers.");
    }

}

public class RestaurantManagement {             //Main Class
    public static void main(String[] args){
        Chef chef = new Chef("Saket Mishra", 101);
        Waiter waiter = new Waiter("Abhishek", 201);

        chef.displayPersonDetails();        //Displaying chef details
        chef.performDuties();

        System.out.println();

        waiter.displayPersonDetails();      //Displaying waiter details
        waiter.performDuties();
    }
}   