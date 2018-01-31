package w18comp1008s3jan31;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Jan31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This is a generic ArrayList, the type is not defined so 
        //any type of object can be added to it
        ArrayList stuff = new ArrayList();
        stuff.add("Canadian winters are great");
        stuff.add(99.9);
        stuff.add(100);
        
        String weather = "fantastic";
        
        for (Object item : stuff)
            System.out.printf("%s is of type %s %n",item.toString(),
                                                    item.getClass());
        
        //This ArrayList will hold String objects only.  We can set this up
        //by using the < String > identifier
        ArrayList<String> ideas = new ArrayList<>();
        ideas.add("go skiing");
        ideas.add("play Monster Hunter");
        ideas.add("don't play video games, play with Java ;-)");
        
        System.out.printf("Our arrayList contains %s%n", ideas);
        
        //to remove items from the ArrayList, just use the remove() method
        ideas.remove(ideas.size()-1);
        System.out.printf("Our arrayList now contains %s%n", ideas);
        
        //ArrayList can look for items
        if (ideas.contains("play Monster Hunter"))
            System.out.println("Wow, it figured out that Monster Hunter was there");
    }
    
}
