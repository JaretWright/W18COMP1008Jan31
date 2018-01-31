package w18comp1008s3jan31; //This allows other classes in the same package
                            //to "see" each other

/**
 *
 * @author JWright
 */
//This is how we define a class 
public class Card {
    
    //these are "instance" variables.  We make them private so that our
    //class controls how they are modified and accessed
    private String faceName, suit;
    private static final String[] validSuits = 
                                        {"spades","hearts","diamonds","clubs"};
    private static final String[] validFaceNames = 
            {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    /**
     * This is a constructor.  It is automatically called when we create 
     * a new instance of the class.  It's job is to validate and set 
     * the instance variables to ensure we have a valid instance of our
     * class
     * @param faceName
     * @param suit 
     */
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method validates that the facename is defined in the
     * faceName array
     * @param faceName 
     */
    public void setFaceName(String faceName) {
        for (String validFaceName : validFaceNames)
        {
            if (validFaceName.equalsIgnoreCase(faceName)){
                this.faceName=validFaceName;
                return;
            }
        }
        //if none of the names matched, we made it to this line of 
        //code, so we should throw an exception
        throw new IllegalArgumentException("Face names must be 2-10, Jack, Queen"
                + "King or Ace");
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        for (String validSuit: validSuits)
        {
            if (validSuit.equalsIgnoreCase(suit)){
                this.suit=validSuit;
                return;
            }
        }
        throw new IllegalArgumentException("Valid suits are hearts, clubs, "
                + "diamonds and spades");
    }
    
    /**
     * This method will return the value of a card
     */
    public int getValue()
    {
        for (int i=0; i<validFaceNames.length; i++)
        {
            if (faceName.equals(validFaceNames[i]))
                return i+2;
        }
        return 0;
    }
    
    /**
     * This method overrides the parent method of toString.  It will
     * represent a card with the pattern of "faceName of suit"
     */
    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }
    
}
