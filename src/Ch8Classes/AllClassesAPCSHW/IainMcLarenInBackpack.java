package Ch8Classes.AllClassesAPCSHW;
//Simulates a checker to view the current contents of a backpack.Allows user to set all values afterwards except physical characteristics of the backpack itself
public class IainMcLarenInBackpack {
    private int pencils;
    private int notebooks;
    private int binders;
    private boolean lunch;
    private String color;
    private String brand;
    private boolean waterBottle;
    private boolean hasLaptop;
    public IainMcLarenInBackpack(int pencils, int notebooks, int binders, boolean lunch, String color, String brand, boolean waterBottle, boolean hasLaptop){
        this.pencils = pencils;
        this.notebooks = notebooks;
        this.binders = binders;
        this.lunch =lunch;
        this.color = color;
        this.brand = brand;
        this.waterBottle = waterBottle;
        this.hasLaptop = hasLaptop;
    }
    public IainMcLarenInBackpack(String color, String brand){
        this.color = color;
        this.brand = brand;
    }
    //GETTERS

    public int getPencils() {
        return pencils;
    }

    public int getNotebooks() {
        return notebooks;
    }

    public int getBinders() {
        return binders;
    }

    public boolean isLunch() {
        return lunch;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isWaterBottle() {
        return waterBottle;
    }

    public boolean isHasLaptop() {
        return hasLaptop;
    }
    //SETTERS


    public void setPencils(int pencils) {
        this.pencils = pencils;
    }

    public void setLunch(boolean lunch) {
        this.lunch = lunch;
    }

    public void setWaterBottle(boolean waterBottle) {
        this.waterBottle = waterBottle;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
    }

    public void setBinders(int binders) {
        this.binders = binders;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }

    //toString
    public String toString(){
        String lunchS;
        String bottleS;
        String laptopS;
        if(lunch){lunchS = "\nLunch? Yes";}else{lunchS = "\nLunch? No";}
        if(waterBottle){bottleS = "\nWater Bottle? Yes";}else{bottleS = "\nWater Bottle? No";}
        if(hasLaptop){laptopS = "\nLaptop? Yes";}else{laptopS = "\nLaptop? No";}

        if(binders!=0)
            return "Number of pencils: " + pencils + "\nNumber of notebooks: " + notebooks + "\nNumber of binders: " + binders + lunchS + "\nBackpack color: " + color + "\nBackpack brand: " + brand + bottleS + laptopS;
        else
            return "Backpack color: " + color + "\nBackpack brand" + brand;
    }
}
