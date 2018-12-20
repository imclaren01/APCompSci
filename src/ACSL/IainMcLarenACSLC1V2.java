package ACSL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IainMcLarenACSLC1V2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("1int-sampledata-1129.txt");
        Scanner fileScan = new Scanner(file);
        while(fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            int dig = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
            line = line.substring(0, line.indexOf(" "));
            long sum = 0L;
            while(line.length() >= dig){
                sum += Long.parseLong(line.substring(0, dig));
                line = line.substring(1);
            }
            System.out.println(sum);
        }
    }
}
