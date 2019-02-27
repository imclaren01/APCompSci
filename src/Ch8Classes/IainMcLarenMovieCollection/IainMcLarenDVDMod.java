package Ch8Classes.IainMcLarenMovieCollection;
/**<h1>DVD Class</h1>
 * Class to create DVD objects
 * @author Iain McLaren
 */
public class IainMcLarenDVDMod {
    //State fields
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;
    //Constructors

    /**
     * Constructor
     * @param title
     * @param director
     * @param year
     * @param cost
     * @param blueray
     */
    public IainMcLarenDVDMod(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    //toString
    @Override
    public String toString() {
        if(blueray){
            return "$" +  cost + "\t" + year + "\t" + title + "\t\t" + director + "\tBlu-Ray";
        } else{
        return "$" +  cost + "\t" + year + "\t" + title + "\t" + director;
    }   }
}
