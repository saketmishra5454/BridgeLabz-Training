package collections.movie_recommendation_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MoviePlatform moviePlatform = new MoviePlatform();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("****************************************");
            System.out.println("1.Add Movie\n2.Remove Movie\n3.Add Rating\n4.Calculate Average Rating\n5.Display Top Rated Movies\n6.Display Movies");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter MovieId and Name");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    moviePlatform.addMovie(id,name);
                    break;
                    
                case 2:
                	System.out.println("Enter the MovieId");
                	moviePlatform.removeMovie(sc.nextInt());
                	break;

                case 3:
                    System.out.println("Enter MovieId and Rating");
                    moviePlatform.addRating(sc.nextInt(),sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter MovieId");
                    moviePlatform.calculateAverageRating(sc.nextInt());
                    break;

                case 5:
                    moviePlatform.displayTopRatedMovies();
                    break;

                case 6:
                    moviePlatform.displayMovies();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}