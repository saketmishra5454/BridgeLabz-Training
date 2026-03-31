package collections.product_inventory_system;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        System.out.println("Enter the number of Operation:");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
        	
        	System.out.println("1.Add Product\n2.Remove Product\n3.Find Product\n4.Display All Products");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                	System.out.println("Enter the productName you want to add like (id,name,price)");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    double price = sc.nextDouble();
                    store.addProduct(new Product(id,name,price));
                    break;

                case 2:
                	System.out.println("Enter the ProductName you want to Removed");
                    store.removeProduct(sc.nextInt());
                    break;

                case 3:
                	System.out.println("Enter the ProductId Want to find:");
                    store.findProduct(sc.nextInt());
                    break;

                case 4:
                	System.out.println("These are the Details of All Products:");
                    store.displayProducts();
                    break;
            }
        }
    }
}
