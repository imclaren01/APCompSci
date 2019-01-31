package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));//Scanners for files
        Scanner input2 = new Scanner(new File("text2.txt"));
        ArrayList<String> list1 = uniqueWords(input1);
        ArrayList<String> list2 = uniqueWords(input1);
        System.out.println(overlap(list1, list2));
    }
    public static ArrayList<String> uniqueWords(Scanner input){ //Returns arraylist of strings containing unique wprds
        ArrayList<String> allWords = new ArrayList<>();         //Accepts Scanner
        while(input.hasNext()){                                 //Uses file to find all words and then parses the unique ones
            allWords.add(input.next().toLowerCase());
        }
        Collections.sort(allWords);
        ArrayList<String> uniq = new ArrayList<>();
        if(allWords.size()>0){
            uniq.add(allWords.get(0));
        }//Fencepost
        for(int i=1; i<allWords.size(); i++){//Unique
            if(!(allWords.get(i).equals(allWords.get(i-1)))){
                uniq.add(allWords.get(i));
            }
        }
        return uniq;
    }
    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2){
        int i1 = 0;
        int i2 = 0;
        ArrayList<String> matches = new ArrayList<>();
        while(i1<list1.size()&&i2<list2.size()){
            int compareInt;
            compareInt = list1.get(i1).compareTo(list2.get(i2));
            if(compareInt==0){
                matches.add(list1.get(i1));
                i1++;
                i2++;
            } else if(compareInt<0){
              i1++;
            }else{
                i2++;
            }
        }
        return matches;
    }
}
