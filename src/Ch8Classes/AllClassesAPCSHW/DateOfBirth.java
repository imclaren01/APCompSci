package Ch8Classes.AllClassesAPCSHW;

public class DateOfBirth {
    //State fields
    private int day;
    private int month;
    private int year;
    //Constructors

    public DateOfBirth(int day, int month, int year) {
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

//toString
    public String toString() {
        return "Date of Birth:" + month + "/" + day + "/" + year;
    }
}
