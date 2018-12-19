package Ch8Classes;

public class IainMcLarenStock {
    //State fields
    private String symbol;
    private int totalShares;
    private int shares;
    private double shareCost;
    //Constructors
    public IainMcLarenStock(String symbol, int totalShares, int shares, double shareCost){
        this.symbol = symbol;
        this.totalShares = totalShares;
        this.shares = shares;
        this.shareCost = shareCost;
    }
    //Behaviors
    public String buy(int shares, String symbol){
        if (this.symbol == symbol){
            return "Fails to match stock name";
        }else{
            this.shares+=shares;
            return "Success!";
        }
    }
    public String stock(String symbol){
        if(this.symbol == symbol) return "Number of shares owned: " + shares + "\nShare cost: " + shareCost + "\nTotal price of shares: " + shares * shareCost;
        else return "Invalid symbol.";
    }
    public double profit(double originalVal){
        return shares * (shareCost - originalVal);
    }
    public String toString(){
        return "Stock: " + symbol + "\nOwned shares: " + shares + "\nShares on market: " + totalShares + "\nPrice of each share: " + shareCost;
    }
}
