package sortingin_ecommerce;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ECommerceSort {
    public static void main(String[] args) {

        //creating a list of Products
        List<Product> list = new ArrayList<>();

        // Adding products
        list.add(new Product("Laptop", 60000, 4.5, 10));
        list.add(new Product("Mobile", 20000, 4.2, 15));
        list.add(new Product("Headphones", 3000, 4.8, 20));
        list.add(new Product("Tablet", 25000, 4.1, 5));

        Scanner sc = new Scanner(System.in);

        System.out.println("Sorted by:");
        System.out.println("1. Price\n2. Rating\n3. Discount");

        int choice = sc.nextInt();

      // Using lambda with comparator
        if(choice == 1){
            Collections.sort(list,(p1,p2)->
                Double.compare(p1.price, p2.price)
            );

        }
        else if(choice == 2){
            Collections.sort(list,(p1,p2)->
                Double.compare(p1.rating,p2.rating));
        }

        else if(choice == 3){
            Collections.sort(list,(p1,p2)->
                    Double.compare(p1.discount,p2.discount));
        }

        else{
            System.out.println("Invalid choice");
            return;
        }

        ///Display sorted Products
        System.out.println("Sorted Products:");

        for(Product p : list){
            p.display();
        }
    }
}
