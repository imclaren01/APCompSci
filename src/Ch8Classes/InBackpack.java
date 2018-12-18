package Ch8Classes;
//Simulates a checker to view the current contents of a backpack. Allows some updates due to things occurring through the day, but not others (Allows user to change the amount of pencils they have but not the amount of notebooks)
public class InBackpack {
    private int pencils;
    private int notebooks;
    private int binders;
    private boolean lunch;
    private String color;
    private String brand;
    private boolean waterBottle;
    private boolean hasLaptop;
    public InBackpack(int pencils, int notebooks, int binders, boolean lunch, String color, String brand, boolean waterBottle, boolean hasLaptop){
        this.pencils = pencils;
        this.notebooks = notebooks;
        this.binders = binders;
        this.lunch =lunch;
        this.color = color;
        this.brand = brand;
        this.waterBottle = waterBottle;
        this.hasLaptop = hasLaptop;
    }
    public InBackpack(String color, String brand){
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
}
