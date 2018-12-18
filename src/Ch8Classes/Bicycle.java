package Ch8Classes;



public class Bicycle {

    private double price;

    private boolean isPurchased;

    private String condition;

    private double psi;

    private int wheels;

    private int gears;

    private int ageRange;

    private String color;

    private double RPM;

    private boolean isBraking;

    private boolean isInInmotion;



    public Bicycle (double price, boolean isPurchased, String condition, int ageRange, String color) {



    }



    public Bicycle (double price, boolean isPurchased, String condition, int ageRange, String color, int gears) {



    }



    public double getPrice() {

        return price;

    }



    public boolean isPurchased() {

        return isPurchased;

    }



    public String getCondition() {

        return condition;

    }



    public double getPsi() {

        return psi;

    }



    public int getWheels() {

        return wheels;

    }



    public int getGears() {

        return gears;

    }



    public int getAgeRange() {

        return ageRange;

    }



    public String getColor() {

        return color;

    }



    public double getRPM() {

        return RPM;

    }



    public boolean isBraking() {

        return isBraking;

    }



    public boolean isInInmotion() {

        return isInInmotion;

    }



    public void setPrice(double price) {

        this.price = price;

    }



    public void isPurchased(boolean isPurchased) {

        this.isPurchased = isPurchased;

    }



    public void setCondition(String condition) {

        this.condition = condition;

    }



    public void setPsi(double psi) {

        this.psi = psi;

    }



    public void setColor(String color) {

        this.color = color;

    }



    public void isBraking(boolean isBraking) {

        this.isBraking = isBraking;

    }



    public void isInInmotion(boolean inInmotion) {

        this.isInInmotion = inInmotion;

    }



    public String toString() {

        return "Price: " + price  + "\nCondition: " + condition + "\nGears: " + gears + "\nColor: " + color + "\nRPM: " + RPM;

    }



}