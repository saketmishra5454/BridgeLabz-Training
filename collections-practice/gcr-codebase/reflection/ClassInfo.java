package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking class name from user
        System.out.print("Enter class name (example: java.util.ArrayList): ");
        String className = sc.nextLine();
        try {
            // Loading class using Class.forName()
            Class<?> cls = Class.forName(className);

            System.out.println("\nClass Name: " + cls.getName());

            // Getting all declared methods
            Method[] methods = cls.getDeclaredMethods();

            System.out.println("\n----- Methods -----");

            for (Method m : methods) {

                System.out.println(m.getName());
            }
            // Getting all declared fields
            Field[] fields = cls.getDeclaredFields();

            System.out.println("\n----- Fields -----");
            for (Field f : fields) {

                System.out.println(f.getName());
            }
            // Getting all constructors
            Constructor<?>[] cons = cls.getDeclaredConstructors();

            System.out.println("\n----- Constructors -----");
            for (Constructor<?> c : cons) {

                System.out.println(c.getName());
            }
        } catch (ClassNotFoundException e) {
            // If class is not found
            System.out.println("Class not found. Please enter correct name.");
        }
        // Closing scanner
        sc.close();
    }
}


