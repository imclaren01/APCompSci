package ACSL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IainMcLarenACSLC2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        while(input.hasNextLine()){
            ArrayList<String> commonStrings = new ArrayList<>();
            while(input.hasNext()){
                String s1 = input.next();
                String s2 = input.next();
                Scanner token = new Scanner (s1);
                Scanner token2 = new Scanner (s2);
                commonStrings.add(commonStringLeft(s1, s2));
                commonStrings.add(commonStringLeft(s2, s1));
                commonStrings.add(commonStringRight(s1,s2));
                commonStrings.add(commonStringRight(s1,s2));
                System.out.println(commonStringFinal(commonStrings));
            }
            if(input.hasNextLine()) {input.nextLine();};
            System.out.println(commonStrings);

        }
    }
    public static String commonStringLeft(String s1, String s2){
        String common = "";
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(s1.charAt(i)+"")&&!common.contains(s1.charAt(i)+"")){
                common+=s1.charAt(i)+"";
                s2.substring(s2.indexOf(s1.charAt(i))+1);
            }
        }
        return common;
    }
    public static String commonStringRight(String s1, String s2){
        String common = "";
        for(int i = s1.length()-1; i >= 0; i--){
            if(s2.contains(s1.charAt(i)+"")&&!common.contains(s1.charAt(i)+"")){
                common+=s1.charAt(i)+"";
                s2.substring(s2.indexOf(s1.charAt(i))+1);
            }
        }
        return common;
    }
    public static String commonStringFinal(ArrayList<String> commonStrings) {
        String common = "";
        for (int i = 0; i < commonStrings.size(); i++) {
            String temp = commonStrings.get(i);
            for (int j = 0; j < temp.length(); j++) {
                for (int k = 0; k < 4; k++) {
                    if (commonStrings.get(k).contains(temp.charAt(j) + "") && k != i && !common.contains(temp.charAt(j) + "")) {
                        common += temp.charAt(j) + "";
                    }
                }
            }
        }
        if (common.equals(""))
            return "NONE";
        return common;
    }
}
