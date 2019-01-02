package Ch8Classes.IainMcLarenMovieCollection;

import java.text.DecimalFormat;
import java.util.Arrays;

public class IainMcLarenDVDCollection {
    //State Fields
    private IainMcLarenDVD[] collection = new IainMcLarenDVD[0];
    private int count;
    private double totalCost;

    //Behaviors
    public void addDVD(String title, String director, int year, double cost, boolean blueray){
        IainMcLarenDVD item = new IainMcLarenDVD(title, director, year, cost, blueray);
        IainMcLarenDVD[] colTemp = new IainMcLarenDVD[collection.length + 1];
        increaseSize(item);
        count++;
        totalCost+=cost;
        collection[collection.length-1] = item;
    }
    private void increaseSize(IainMcLarenDVD item){
        IainMcLarenDVD[] colTemp = new IainMcLarenDVD[collection.length + 1];
        for(int i = 0; i < collection.length; i++){
            colTemp[i] = collection[i];
        }
        collection = colTemp;
    }
    @Override
    public String toString() {
        String list = "";
        for (int i = 0; i < collection.length; i++){
            list += collection[i] + "\n";
        }
        DecimalFormat df = new DecimalFormat("###.##");
        return "My DVD Collection" +
                "\n\nNumber of DVD's: " + count + "\nTotal cost: $" + df.format(totalCost) + "\nAverage cost: $" +df.format(totalCost/count) +
                "\n\nDVD List:\n\n" + list;
    }
}
