package w18comp1008s3jan31;

/**
 *
 * @author JWright
 */
public class GameOfWarLaunch
{
    public static void main(String[] args)
    {
        GameOfWar game = new GameOfWar(); //this creates an instance of the GameOfWar
                                          //Our constructor will initialize the hands of 
                                          //each player
        game.playGame();
    }
}
