import java.util.*;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) return null;
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int players = sc.nextInt();
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] distributed = distributeCards(deck, n, players);
        if (distributed == null) {
            System.out.println("Cards cannot be distributed evenly among players.");
        } else {
            printPlayers(distributed);
        }
    }
}
