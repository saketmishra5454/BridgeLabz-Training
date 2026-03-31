package collections.movie_ratingsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        MoviePlatform obj = new MoviePlatform();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Operations you want");

        int n = sc.nextInt();

        System.out.println("1.Add Movie\n2.Remove Movie\n3.Add Ratings\n4.Calulate AverageRatings\n5.Find TopRated Movie\n6.Display MoviesDetails");

        for (int i = 0; i < n; i++) {
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.println("Enter the Movie Details like (Movie name, Price)");
                        String name = sc.next();
                        double price = sc.nextDouble();

                        obj.addMovie(name, price);
                        break;


                    case 2:
                        System.out.println("Enter the Movie Name you want to Delete");

                        obj.removeMovie(sc.nextLine());
                        break;


                    case 3:

                        System.out.println("Enter the Movie Name You want to add Rating for it like (MovieName, Rating)");

                        obj.addRating(sc.next(), sc.nextInt());
                        break;

                    case 4:

                        System.out.println("Enter the Movie Name you want the Average Rating of it like (MovieName)");

                        obj.calculateAverageRating(sc.next());
                        break;

                    case 5:

                        obj.findTopRatedMovie();
                        break;

                    case 6:
                        System.out.println("These are the Details of Movies");

                        obj.displayMovies();

                        System.out.println("-------------------------------------------");
                        break;


                    default:
                        System.out.println("Invalid Entry No.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter the without space");
                //break;
            }
        }
        sc.close();

    }
}
