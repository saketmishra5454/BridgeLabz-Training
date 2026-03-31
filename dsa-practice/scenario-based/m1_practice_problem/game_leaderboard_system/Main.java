package collections.game_leaderboard_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GamePlatform game = new GamePlatform();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Operations you want:");
        int n = sc.nextInt();

        for(int i = 0; i<n;i++){
        	System.out.println("************************************************");
        System.out.println("1.Add Player\n2.Remove Player\n3.Add Scores\n4.Calculate Average Of the Player\n5.Find the TopScorer\n6.Display the Players");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the Player Want to Add like (Name)");
                 //   String name = sc.nextLine();
                    game.addPlayer(sc.next());
                    break;

                case 2:
                    System.out.println("Enter the Player Name want to Remove like (Name)");

                    game.removePlayer(sc.next());
                    break;

                case 3:
                    System.out.println("Enter the Player and their Score you want to add like (Name,Score)");

                    game.addScore(sc.next(),sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter the Player for Calculate the Average like (Name)");

                    game.calculateAverageScore(sc.next());
                    break;

                case 5:
                    System.out.println("The Top Scorer is:");
                    game.findTopPlayer();
                    break;

                case 6:
                    System.out.println("These are the Players Data");
                    System.out.println();
                    game.displayPlayers();
                    break;

                default:
                    System.out.println("Invalid Entry!! Please Enter the Valid Number");
            }
        }
        sc.close();
    }

}
