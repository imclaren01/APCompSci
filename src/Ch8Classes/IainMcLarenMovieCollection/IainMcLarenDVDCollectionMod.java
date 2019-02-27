package Ch8Classes.IainMcLarenMovieCollection;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * <h1>DVD Collection</h1>
 * This program holds a collection of DVD objects in an arrayList and allows a user to add DVDs or print the collection to a String
 * @author  Iain McLaren
 * @since   2019-2-22
 */
public class IainMcLarenDVDCollectionMod {
    //State Fields
    private ArrayList<IainMcLarenDVDMod> collection = new ArrayList<IainMcLarenDVDMod>();
    private int count;
    private double totalCost;

    //Behaviors

    /**
     * Constructor
     * Initializes required variables
     * @param title
     * @param director
     * @param year
     * @param cost
     * @param blueray
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray){  //Method to add DVD by adding one IainMcLarenDVD object to the arrau
        IainMcLarenDVDMod item = new IainMcLarenDVDMod(title, director, year, cost, blueray);
        collection.add(item);
        count++;
        totalCost+=cost;
    }

    /**
     * toString Method
     * Returns a String of all the movies in the collection
     * @return collection
     */
    //toString method
    public String toString() {
        String list = "";
        for (int i = 0; i < collection.size(); i++){ //Put all DVD objects into one String
            list += collection.get(i) + "\n";
        }
        DecimalFormat df = new DecimalFormat("###.##");
        return "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMy DVD Collection" +
                "\n\nNumber of DVD's: " + count + "\nTotal cost: $" + df.format(totalCost) + "\nAverage cost: $" +df.format(totalCost/count) +
                "\n\nDVD List:\n\n" + list;
    }
}
