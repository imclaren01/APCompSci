package Ch8Classes.IainMcLarenGroceryList;

public class IainMcLarenGroceryListClient {
    public static void main(String[] args){
        IainMcLarenGroceryList cookies = new IainMcLarenGroceryList();
        cookies.addItem(new IainMcLarenGroceryItem("Cookies", 11, 10.99));
        System.out.println("Initial: " + cookies);
        cookies.addItem(new IainMcLarenGroceryItem("Salt", 7, 32.99));
        cookies.addItem(new IainMcLarenGroceryItem("Bleach", 202, 94.99));
        System.out.println("New: " + cookies);
        System.out.println("Total Cost: $" + cookies.getTotalCost());

    }
}
