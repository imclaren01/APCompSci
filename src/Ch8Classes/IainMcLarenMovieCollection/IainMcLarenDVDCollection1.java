package Ch8Classes.IainMcLarenMovieCollection;

import java.text.DecimalFormat;
import java.util.Arrays;

public class IainMcLarenDVDCollection1 {
    //State Fields
    private IainMcLarenDVD[] collection = new IainMcLarenDVD[0];
    private int count;
    private double totalCost;

    //Behaviors
    public void addDVD(String title, String director, int year, double cost, boolean blueray){  //Method to add DVD by adding one IainMcLarenDVD object to the arrau
        IainMcLarenDVD item = new IainMcLarenDVD(title, director, year, cost, blueray);
        increaseSize(item);
        count++;
        totalCost+=cost;
        collection[collection.length-1] = item;
    }
    private void increaseSize(IainMcLarenDVD item){ //Increases size of an array when an addition is made
        IainMcLarenDVD[] colTemp = new IainMcLarenDVD[collection.length + 1];
        for(int i = 0; i < collection.length; i++){
            colTemp[i] = collection[i];
        }
        collection = colTemp;
    }
    //toString method
    public String toString() {
        String list = "";
        for (int i = 0; i < collection.length; i++){ //Put all DVD objects into one String
            list += collection[i] + "\n";
        }
        DecimalFormat df = new DecimalFormat("###.##");
        return "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMy DVD Collection" +
                "\n\nNumber of DVD's: " + count + "\nTotal cost: $" + df.format(totalCost) + "\nAverage cost: $" +df.format(totalCost/count) +
                "\n\nDVD List:\n\n" + list;
    }
}
