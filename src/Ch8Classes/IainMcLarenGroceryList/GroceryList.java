package Ch8Classes.IainMcLarenGroceryList;

import java.util.Arrays;

public class GroceryList {
    //State fields
    private GroceryItemOrder[] list = new GroceryItemOrder[0];
    private int numItems;

    //Constructor
    public GroceryList(){
        //Nothing
    }
    //Behaviors
    public void addItem(GroceryItemOrder item){
        GroceryItemOrder[] listTemp = new GroceryItemOrder[list.length + 1];
        for(int i = 0; i < list.length; i++){
            listTemp[i] = list[i];
        }
        list = listTemp;
        list[list.length-1] = item;
    }
    public double getTotalCost(){
        double sum = 0;
        for(int i = 0; i < list.length;  i++){
            sum+= list[i].getCost();
        }
        return sum;
    }
    //toString
    @Override
    public String toString() {
        String prnt = "";
        for(int i = 0; i < list.length;  i++){
            prnt += list[i].getName() + "\n$" + list[i].getCost() + "\n\n";
        }
        return prnt;
    }
}
