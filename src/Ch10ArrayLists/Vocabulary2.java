package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("lear.txt"));//Scanners for files
        Scanner input2 = new Scanner(new File("moby.txt"));
        ArrayList<String> list1 = uniqueWords(input1);
        ArrayList<String> list2 = uniqueWords(input2);
        ArrayList<String> overlap = overlap(list1, list2);
        System.out.println(percCalc(overlap, list1));
        System.out.println(percCalc(overlap, list2));
    }
    public static double percCalc(ArrayList<String> overlap, ArrayList<String> list1){
        return overlap.size()*100.0/list1.size();
    }
    public static ArrayList<String> uniqueWords(Scanner input){ //Returns arraylist of strings containing unique wprds
        input.useDelimiter("[^a-zA-Z']+");
        ArrayList<String> allWords = new ArrayList<>();         //Accepts Scanner
        while(input.hasNext()){                                 //Uses file to find all words and then parses the unique ones
            String word = input.next();
            allWords.add(word.toLowerCase());
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
        System.out.println(uniq);
        return uniq;
    }
    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2){
        int i1 = 0;
        int i2 = 0;
        ArrayList<String> matches = new ArrayList<>();
        while((i1<list1.size()) && (i2<list2.size())){
            int compareInt = list1.get(i1).compareTo(list2.get(i2));
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
        System.out.println(matches);
        return matches;
    }
}
