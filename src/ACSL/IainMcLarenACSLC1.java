package ACSL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IainMcLarenACSLC1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("1int-sampledata-1129.txt");
        Scanner fileScan = new Scanner(file);
        while(fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            int dig = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
            line = line.substring(0, line.indexOf(" "));
            //System.out.println(line);
            int sum = 0;
            Scanner token = new Scanner(line);
            //for(int i = 0; i<line.length(); i++){
            while(token.hasNext()){
                String digits = "";
                for(int j = 0; j < dig; j++){
                    digits += token.next();//line.charAt(j) + "";
                }
                line=line.substring(dig);
                sum+=Integer.parseInt(digits);
           }
            System.out.println(sum);
        }
    }
}
