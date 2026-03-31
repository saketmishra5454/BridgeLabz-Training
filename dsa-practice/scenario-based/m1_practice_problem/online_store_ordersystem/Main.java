package collections.online_store_ordersystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	OnlineStore store = new OnlineStore();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Operations you want");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("1.Add Customer\n2.Remove Customer\n3.Add Order\n4.calculate Total Spending\n5.Find TopSpender\n6.Display CustomerDetails");

            int choice = sc.nextInt();


            switch (choice) {

                case 1:

                    System.out.println("Enter the Customer Details like (name)");
                    String name = sc.next();
                    
                    store.addCustomer(name);
                    break;


                case 2:
                    System.out.println("Enter the Customer Name you want to Delete");

                    store.removeCustomer(sc.nextLine());
                    break;


                case 3:

                    System.out.println("Enter the Customer Name You want to add Rating for it like (Name, Amount)");

                    store.addOrder(sc.next(), sc.nextInt());
                    break;

                case 4:

                    System.out.println("Enter the Customer Name you want the Average Rating of it like (CustomerName)");

                    store.calculateTotalSpending(sc.next());
                    break;

                case 5:

                    store.findTopSpender();
                    break;

                case 6:
                    System.out.println("These are the Details of Movies");

                    store.displayCustomers();

                    System.out.println("-------------------------------------------");
                    break;


                default:
                    System.out.println("Invalid Entry No.");
                    break;
            }

        }
        sc.close();
    }
}


