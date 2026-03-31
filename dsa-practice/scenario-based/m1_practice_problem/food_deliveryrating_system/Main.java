package collections.food_deliveryrating_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FoodDelivery foodDelivery = new FoodDelivery();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("****************************************");
            System.out.println("1.Add Restaurant\n2.Remove Restaurant\n3.Add Rating\n4.Calculate Average Rating\n5.Find Top Rated Restaurant\n6.Display Restaurants");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter RestaurantId and Name");
                    foodDelivery.addRestaurant(sc.nextInt(),sc.next());
                    break;
                    
                case 2:
                	System.out.println("Enter the RestaurantId");
                	foodDelivery.removeRestaurant(sc.nextInt());
                	break;

                case 3:
                    System.out.println("Enter RestaurantId and Rating");
                    foodDelivery.addRating(sc.nextInt(),sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter RestaurantId");
                    foodDelivery.calculateAverageRating(sc.nextInt());
                    break;

                case 5:
                    foodDelivery.findTopRatedRestaurant();
                    break;

                case 6:
                    foodDelivery.displayRestaurants();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}