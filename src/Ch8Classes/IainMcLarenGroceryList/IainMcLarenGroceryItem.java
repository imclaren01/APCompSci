package Ch8Classes.IainMcLarenGroceryList;

public class IainMcLarenGroceryItem {
    private String name;
    private int quantity;
    private double ppu;

    //Constructor
    public IainMcLarenGroceryItem(String name, int quantity, double ppu){
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }
    //Getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPpu() {
        return ppu;
    }
    //Setters
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Behaviors
    public double getCost(){
        return quantity * ppu;
    }

    @Override
    public String toString() {
        return "IainMcLarenGroceryItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", ppu=" + ppu +
                '}';
    }
}
