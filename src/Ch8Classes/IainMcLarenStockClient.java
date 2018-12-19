package Ch8Classes;

public class IainMcLarenStockClient {
    public static void main(String[] args){
        IainMcLarenStock facebook = new IainMcLarenStock("fb", 999999, 6, 200.00);
        System.out.println(facebook);
        facebook.buy(10, "fb");
        facebook.buy(10, "appl");
        System.out.println(facebook.stock("fb"));
        System.out.println(facebook);
        System.out.println("Profit: " + facebook.profit(150.00));
    }
}
