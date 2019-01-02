package Ch8Classes.IainMcLarenMovieCollection;

import java.text.DecimalFormat;

public class IainMcLarenDVD {
    //State fields
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;
    //Constructors
    public IainMcLarenDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    //toString
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        if(blueray){
            return "$" + df.format(cost) + "\t" + year + "\t" + title + "\t\t" + director + "\t\tBlu-Ray";
        } else{
        return "$" + df.format(cost) + "\t" + year + "\t" + title + "\t\t" + director;
    }   }
}
