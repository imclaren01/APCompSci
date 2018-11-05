import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class IainMcLarenSum {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sum.txt"));
        while(sc.hasNextLine()) {
            System.out.println(sumFind(sc));
            sc.nextLine();
        }
    }
    public static String sumFind(Scanner sc){
        int[] ar = new int[25];
        int[] sumAr = new int[25];
        int i = 0;
        while(sc.hasNextInt()){
            ar[24-i] = sc.nextInt();
            i++;
        }
       return(Arrays.toString(ar));
    }
}
