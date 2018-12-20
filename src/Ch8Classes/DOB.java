package Ch8Classes;

public class DOB {
    //State fields
    private int day;
    private int month;
    private int year;
    //Constructors

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //Setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
//toString
    public String toString() {
        return "Date of Birth:" +
                "\nDay: " + day +
                "\nMonth: " + month +
                "\nYear: " + year;
    }
}
