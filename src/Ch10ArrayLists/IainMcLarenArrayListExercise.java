package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class IainMcLarenArrayListExercise {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        addStars(list);
        Integer[] list1 = {1,4,8,9,11,15,17,28,41,59};
        Integer[] list2 = {4,7,11,17,19,20,23,28,37,59,81};
        ArrayList<Integer> aList1 = new ArrayList<>(Arrays.asList(list1));
        ArrayList<Integer> aList2 = new ArrayList<>(Arrays.asList(list2));
        intersect(aList1, aList2);

        Scanner fileRead = new Scanner(new File("data.txt"));
        ArrayList<String> blarp = new ArrayList<String>();
        while (fileRead.hasNextLine()) {
            blarp.add(fileRead.nextLine());
        }
        System.out.println(blarp);
        ArrayList<String> ywrf = new ArrayList<String>();
        for (int i = 0; i < blarp.size(); i++) {
            ywrf.add(blarp.get(blarp.size() - i - 1));
        }
        System.out.println(ywrf);
        for (int i = 0; i < blarp.size(); i++) {
            int lngth = blarp.get(i).length() - 1;
            if (blarp.get(i).charAt(lngth) == 's') {
                blarp.set(i, blarp.get(i).substring(0, lngth) + blarp.get(i).substring(lngth).toUpperCase());
            }
        }
        System.out.println(blarp);
        ArrayList<String> plog = new ArrayList<>();
        for (int i = 0; i < blarp.size(); i++) {
            if (!(blarp.get(i).charAt(blarp.get(i).length() - 1) == 'S')) {
                plog.add(i, blarp.get(i));
            }
        }
        System.out.println(plog);
    }
    public static void addStars(ArrayList<String> list){
        int size = list.size();
        for(int i = 0; i <= size+2; i+=2){
            list.add(i+1, "*");
        }
        System.out.println(list);
    }
    public static void intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> finalList = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            if(list2.contains(list1.get(i))){
                finalList.add(list1.get(i));
            }
        }
        System.out.println(finalList);
    }
}
