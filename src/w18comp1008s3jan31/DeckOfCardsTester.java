
package w18comp1008s3jan31;

import java.security.SecureRandom;

/**
 *
 * @author JWright
 */
public class DeckOfCardsTester {
    public static void main(String[] args)
    {
        DeckOfCards deck = new DeckOfCards();
        //deck.shuffle();
        deck.displayDeck();
        System.out.printf("Dealing the top card: %s%n", deck.dealTopCard());
        
        System.out.println("Here is the deck AFTER dealing the top card");
        deck.displayDeck();
       
    }
}
