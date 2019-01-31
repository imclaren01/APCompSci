import java.util.ArrayList;

public class LimitFinder {
    ArrayList<Double> num = new ArrayList<>();
    ArrayList<Double> denum = new ArrayList<>();
    double xApp;

    public LimitFinder(ArrayList<Double> num, ArrayList<Double> denum, double xApp ) {
        num = this.num;
        denum = this.num;
        xApp = this.xApp;
    }
    public LimitFinder(String numS, String denumS, double xApp ) {
        for(int i = 0; i < denumS.length(); i++){
            if(numS.charAt(i-1)=='^'){
              //  num.add(n);
            }
        }
        denum = this.num;
        xApp = this.xApp;
    }
}
