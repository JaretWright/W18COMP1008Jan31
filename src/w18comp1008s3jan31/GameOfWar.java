package w18comp1008s3jan31;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class GameOfWar
{
    //step 2 - create instance variables.  Use control-shift i to import classes
    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;
    
    /**
     * step 3 - build the constructor.  Remember, the goal of the
     * constructor is to initialize the instance variables.
     */
    public GameOfWar()
    {
        //create the hands for the players
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();
        
        //create and shuffle the deck of cards
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        
        //deal all the cards to the players
        while (deck.getNumberOfCardsInDeck()>0)
        {
            p1Hand.add(deck.dealTopCard());
            p2Hand.add(deck.dealTopCard());
        }
    }   //end of constructor
    
    /**
     * This method will run continuously until the game is over
     */
    public void playGame()
    {
        while (p1Hand.size()>0 && p2Hand.size()>0)
        {
            ArrayList<Card> warPile = new ArrayList<>();
            playHand(warPile);
        }
        
        if (p1Hand.size()>0)
            System.out.println("Player 1 is the winner!!");
        else
            System.out.println("Player 2 is the winner!!");
    } //end of the playGame() method
    
    /**
     * This method will simulate playing 1 hand in the game
     */
    public void playHand(ArrayList<Card> warPile)
    {
        Card p1Card = p1Hand.remove(0);
        Card p2Card = p2Hand.remove(0);
        
        //player 1 wins
        if (p1Card.getValue() > p2Card.getValue())
        {
            p1Hand.add(p1Card);
            p1Hand.add(p2Card);  //p1 won this card from player 2
            p1Hand.addAll(warPile); //add the warPile
            return;
        }
        //check if player 2 won
        if (p2Card.getValue() > p1Card.getValue())
        {
            p2Hand.add(p1Card);
            p2Hand.add(p2Card);  //p1 won this card from player 2
            p2Hand.addAll(warPile); //add the warPile
            return;
        }
        //Steve yells WAR!!!
        //check if player 1 has enough cards for war.  If not, p2 wins all 
        //the cards
        warPile.add(p1Card);
        warPile.add(p2Card);
        if (p1Hand.size() < 4)
        {
            p2Hand.addAll(warPile);
            p2Hand.addAll(p1Hand);
            p1Hand.clear();
            return;
        }
        //check if p2 has enough cards for war
        if (p2Hand.size() < 4)
        {
            p1Hand.addAll(warPile);
            p1Hand.addAll(p2Hand);
            p2Hand.clear();
            return;
        }
        //both players have enough cards, put the cards in the war pile
        //and play another hand
        
        //each player adds 3 cards to the warPile
        for (int i=1; i<=3 ; i++)
        {
            warPile.add(p1Hand.remove(0));
            warPile.add(p2Hand.remove(0));
        }
        playHand(warPile);      
    }
    
    /**
     * This will return a String showing the current status of the game
     */
    public String getStatus()
    {
        String p1Status = String.format("P1 # of cards: %d card: %s", 
                                        p1Hand.size(), p1Hand.get(0));
        
        String p2Status = String.format("P2 # of cards: %d card: %s", 
                                        p2Hand.size(), p2Hand.get(0));
        
        return p1Status + "   " + p2Status + "\n";
    }
}   //end of the class



