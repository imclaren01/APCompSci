package Ch8Classes;

public class PointClientV3 {
    public static void main(String[] args) {
        //instantiate a point object at (0,0)
        PointV3 p2 = new PointV3();
        //p1 is an object of the type PointP7V1

        //I'm instantiating an object p1 of the type PointV3
        PointV3 p1 = new PointV3(5,7);
        System.out.println("P1: " + p1); //after toString() method
        p1.x = 5;
        p1.y = 7;
        System.out.println("P1': " + p1); //after toString() method








    }
}