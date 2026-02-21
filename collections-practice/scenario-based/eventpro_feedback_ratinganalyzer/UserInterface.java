//package eventpro_feedback_ratinganalyzer;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class userInterface {
//    public static void main(String[] args) {
//
//        FeedbackService service = new FeedbackService();
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter number of feedback entries");
//        int n = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Enter feedback details {in the format (eventId:rating)}");
//        for(int i = 0; i<n;i++) {
//            String input = sc.nextLine();
//
//            String[] data = input.split(":");
//            if (data.length != 2) {
//                System.out.println("Invalid input format. Use eventId:rating");
//                continue;
//            }
//
//
//            try {
//                service.addRating(data[0], Integer.parseInt(data[1]));
//            } catch (InvalidRatingException e) {
//                System.out.println(e.getMessage());
//                i--;
//            }
//        }
//
//            System.out.println("Enter eventId to check average");
//            String id = sc.nextLine();
//
//            //Average Rating for event
//        if (!service.eventExists(id)) {
//            System.out.println("Event not found.");
//        } else {
//            System.out.println("Average rating for " + id + " is " + service.getAverageRating(id));
//        }
//            //top rated events
//
//        List<String> topEvents = service.getTopRatedEvents();
//        if (topEvents == null || topEvents.isEmpty()) {
//            System.out.println("No top rated events available.");
//        } else {
//            System.out.println("\nTop Rated Events");
//            for (String top : topEvents) {
//                System.out.println(top);
//            }
//        }
//
//    }
//}

package eventpro_feedback_ratinganalyzer;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        FeedbackService service = new FeedbackService();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Add Rating");
            System.out.println("2. Check Average Rating");
            System.out.println("3. Show Top Rated Events");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Enter feedback details:");

                    System.out.println("------------------------------------------");

                    System.out.println("Enter the number of Events");

                    int n = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter feedback details {in the format (eventId:rating)}");
                    for (int i = 0; i < n; i++) {
                        String input = sc.nextLine();
                        String[] data = input.split(":");


                        if (data.length != 2) {
                            System.out.println("Invalid input format. Use eventId:rating");
                            break;
                        }

                        try {
                            service.addRating(data[0], Integer.parseInt(data[1]));
                            System.out.println("Rating added successfully!");
                        } catch (InvalidRatingException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                        break;

                        case 2:
                            System.out.println("Enter eventId to check average:");
                            String id = sc.nextLine();

                            if (!service.eventExists(id)) {
                                System.out.println("Event not found.");
                            } else {
                                System.out.println("Average rating for " + id +
                                        " is " + service.getAverageRating(id));
                            }
                            break;

                        case 3:
                            List<String> topEvents = service.getTopRatedEvents();

                            if (topEvents == null || topEvents.isEmpty()) {
                                System.out.println("No top rated events available.");
                            } else {
                                System.out.println("\nTop Rated Events:");
                                for (String top : topEvents) {
                                    System.out.println(top);
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Exiting program...");
                            break;

                        default:
                            System.out.println("Invalid choice. Please select 1-4.");
                    }

            }
            while (choice != 4) ;

            sc.close();
        }
    }