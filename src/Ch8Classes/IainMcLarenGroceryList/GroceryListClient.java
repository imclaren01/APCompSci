package Ch8Classes.IainMcLarenGroceryList;

public class GroceryListClient {
    public static void main(String[] args){
        GroceryList cookies = new GroceryList();
        cookies.addItem(new GroceryItemOrder("Cookies", 11, 10.99));
        System.out.println("Initial: " + cookies);
        cookies.addItem(new GroceryItemOrder("Salt", 7, 32.99));
        cookies.addItem(new GroceryItemOrder("Bleach", 202, 94.99));
        System.out.println("New: " + cookies);
        System.out.println("Total Cost: $" + cookies.getTotalCost());

    }
}
