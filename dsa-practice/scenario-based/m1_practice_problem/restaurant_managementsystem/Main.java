package collections.restaurant_managementsystem;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        System.out.println("Enter the Number of Operations: ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("1.Add Item\n2.Remove Item\n3.Add Ratings\n4.Calculate Average Rating\n5.DisplayMenu");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter the Item want to Add as - (ItemName,Price):");
                    String name = sc.nextLine();
                    double price = sc.nextDouble();
                    restaurant.addItem(name, price);
                    break;

                case 2:
                    System.out.println("Enter the Item want to remove:");
                    restaurant.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Enter the name of Item want to add Ratings as - (ItemName, Rating)");
                    String itemName = sc.nextLine();
                    int rating = sc.nextInt();
                    restaurant.addRating(itemName, rating);
                    break;

                case 4:
                    System.out.println("Enter the name of the Item want to Calculate the AverageRating:");
                    restaurant.calculateAverageRating(sc.nextLine());
                    break;

                case 5:
                    System.out.println("This the Menu: ");
                    System.out.println();
                    restaurant.displayMenu();
                    break;
            }
        }

        sc.close();
    }
}