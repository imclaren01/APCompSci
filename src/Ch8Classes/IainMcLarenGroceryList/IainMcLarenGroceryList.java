package Ch8Classes.IainMcLarenGroceryList;

public class IainMcLarenGroceryList {
    //State fields
    private IainMcLarenGroceryItem[] list = new IainMcLarenGroceryItem[0];
    private int numItems;

    //Constructor
    public IainMcLarenGroceryList(){
        //Nothing
    }
    //Behaviors
    public void addItem(IainMcLarenGroceryItem item){
        IainMcLarenGroceryItem[] listTemp = new IainMcLarenGroceryItem[list.length + 1];
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
    public String toString() {
        String prnt = "";
        for(int i = 0; i < list.length;  i++){
            prnt += list[i].getName() + "\n$" + list[i].getCost() + "\n\n";
        }
        return prnt;
    }
}
