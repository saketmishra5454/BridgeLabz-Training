import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        // creating deck using suits and ranks
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        // shuffling using swapping logic
        for (int i = 0; i < n; i++) {

            // generating random index between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // swapping cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // method to distribute n cards to x players
    public static String[][] distributeCards(String[] deck, int n, int players) {

        // check if distribution possible
        if (n % players != 0) {
            System.out.println("Cards cannot be equally distributed.");
            return null;
        }

        int cardsPerPlayer = n / players;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;

        // distributing cards
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }

        return playerCards;
    }

    // method to print players and their cards
    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // shuffle deck
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        // distribute cards
        String[][] distributed = distributeCards(deck, n, players);

        // print result
        if (distributed != null) {
            printPlayers(distributed);
        }

        sc.close();
    }
}
