package w18comp1008s3jan31;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class Challenge {
    public static void main(String[] args)
    {
        ArrayList<String> favGames = new ArrayList<>();
        favGames.add("Need for Speed");
        favGames.add("BorderLands");
        favGames.add("World of Warcraft");
        
        System.out.printf("My fav games are: %s%n", favGames);
        
        for (String game:favGames)
            System.out.println(game);
        
    }
    
    
}
