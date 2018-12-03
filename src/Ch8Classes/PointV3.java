package Ch8Classes;

public class PointV3 {
    //state fields for the Point class
    //Synonyms: state, state fields, fields, instance variables
    public int x;
    public int y;

    public PointV3(int xinitial,int yinitial){
        x = xinitial;
        y = yinitial;
    }
    //default constructor
    public PointV3(){
        x = 0;
        y = 0;
    }
    //behaviors for the Point class (methods)
    //Synonyms: behaviors, methods, object methods

    //translate and setLocation are mutators(setters)
    //translates a Point to a new location
    public void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    //sets the location to a coordinate
    public void setLocation(int xNew, int yNew) {
        x = xNew;
        y = yNew;
    }

    //distance and distanceFromOrigin are accessor(setters)
    public double distance(PointV3 other) {
        int dx = x-other.x;
        int dy = y-other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance(PointV3 first, PointV3 second) {
        int dx = first.x-second.x;
        int dy = first.y-second.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return ("(" + x + ", " + y + ")");
    }

    /*
    public double distanceFromOrigin(PointP7V1 other) {

    }
    */
}