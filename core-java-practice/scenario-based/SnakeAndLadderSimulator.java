import java.util.Random;

public class SnakeAndLadderSimulator {

    public static void main(String[] args) {

        Random rand = new Random();          //Random number generator

        int player1Position = 0;
        int player2Position = 0;

        int diceCount = 0;
        boolean player1Turn = true;

        while (player1Position != 100 && player2Position != 100) {     //Game continues until one player reaches 100

            int die = rand.nextInt(6) + 1;      //  Roll the die (1-6)
            diceCount++;

            int option = rand.nextInt(3); // 0=No Play, 1=Ladder, 2=Snake

            if (player1Turn) {                          //Player 1's turn
                System.out.println("Player 1 rolls: " + die);
                int previousPosition = player1Position;

                if (option == 0) {
                    System.out.println("Option: No Play");
                } 
                else if (option == 1) {
                    System.out.println("Option: Ladder");
                    player1Position += die;
                } 
                else {
                    System.out.println("Option: Snake");
                    player1Position -= die;
                }

                // Handle boundaries
                if (player1Position < 0) {          //Cannot go below 0
                    player1Position = 0;
                }
                if (player1Position > 100) {            //Cannot go above 100
                    player1Position = previousPosition;
                }

                System.out.println("Player 1 position: " + player1Position);
                System.out.println("--------------------------------");

                // If not Ladder, change turn
                if (option != 1) {
                    player1Turn = false;
                }

            } else {                    //Player 2's turn
                System.out.println("Player 2 rolls: " + die);
                int previousPosition = player2Position;

                if (option == 0) {
                    System.out.println("Option: No Play");
                } 
                else if (option == 1) {
                    System.out.println("Option: Ladder");
                    player2Position += die;
                } 
                else {
                    System.out.println("Option: Snake");
                    player2Position -= die;
                }

                // Handle boundaries
                if (player2Position < 0) {              //Cannot go below 0
                    player2Position = 0;
                }
                if (player2Position > 100) {      //Cannot go above 100
                    player2Position = previousPosition;
                }

                System.out.println("Player 2 position: " + player2Position);
                System.out.println("--------------------------------");

                // If not Ladder, change turn      
                if (option != 1) {                        //Switch turn to Player 1
                    player1Turn = true;
                }
            }
        }

        // Declare winner
        if (player1Position == 100) {                          //Player 1 wins
            System.out.println("Player 1 WON the game!");
        } else {
            System.out.println("Player 2 WON the game!");           //Player 2 wins
        }

        System.out.println("Total dice rolls: " + diceCount);          //Total number of dice rolls
    }
}
