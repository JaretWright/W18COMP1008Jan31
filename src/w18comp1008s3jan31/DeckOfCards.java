package w18comp1008s3jan31;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JWright
 */
public class DeckOfCards {
    private ArrayList<Card> cards;
    
    /**
     * This is a 0 argument constructor, it will build a deck of cards
     * with cards 2-10, Jack, Queen, King and Ace for the suits of Spades, 
     * Hearts, Clubs and Diamonds
     */
    public DeckOfCards()
    {
        cards = new ArrayList<>();
        
        String[] faceNames =  {"2","3","4","5","6","7","8","9","10","Jack",
                                    "Queen","King","Ace"};
        String[] suits = {"spades","hearts","diamonds","clubs"};
        
        for (String suit:suits){
            for (String faceName:faceNames)
                cards.add(new Card(faceName, suit));
        } 
    }
    
    /**
     * This method will display all the cards in the deck to the console
     */
    public void displayDeck()
    {
        for (Card card:cards)
            System.out.println(card);
    }
    
    /**
     * This method will shuffle the order of the cards in the deck
     */
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
}
