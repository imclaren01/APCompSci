package Ch8Classes.AllClassesAPCSHW;



public class IainMcLarenApple {

    //STATE FIELDS:

    private String color;

    private String type;

    private double weight;

    private double price;

    private boolean organic;

    private String bestByDate;

    private boolean hasWorm;



    //GETTERS:

    public String getColor() {

        return color;

    }

    public String getType() {

        return type;

    }

    public double getWeight() {

        return weight;

    }

    public double getPrice() {

        return price;

    }

    public boolean isOrganic() {

        return organic;

    }

    public String getBestByDate() {

        return bestByDate;

    }

    public boolean isHasWorm() {

        return hasWorm;

    }



    //CONSTUCTORS:

    public IainMcLarenApple(String color, String type, double weight, double price, boolean organic, String bestByDate, boolean hasWorm) {

        this.color = color;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.organic = organic;
        this.bestByDate = bestByDate;
        this.hasWorm = hasWorm;

    }

    public String toString(){
        return "Color: " + color + "\nType: " + type + "\nPrice: " + price + "\nOrganic: " + organic +  "\nBest By Date: " + bestByDate;
    }

}