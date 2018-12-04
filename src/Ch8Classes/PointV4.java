package Ch8Classes;

public class PointV4 {
    //state fields for the Point class
    //Synonyms: state, state fields, fields, instance variables
    private int x;
    private int y;

    public PointV4(int x, int y){
        this.x = x;
        this.y = y;
    }
    //default constructor
    public PointV4(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = y;
    }
    public void setY(int y){
        this.y = y;
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
    public double distance(PointV4 other) {
        int dx = x-other.x;
        int dy = y-other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance(PointV4 first, PointV4 second) {
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