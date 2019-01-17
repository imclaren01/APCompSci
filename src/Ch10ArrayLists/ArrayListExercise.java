package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class ArrayListExercise {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileRead = new Scanner(new File("data.txt"));
        ArrayList<String> blarp = new ArrayList<String>();
        while(fileRead.hasNextLine()){
            blarp.add(fileRead.nextLine());
        }
        System.out.println(blarp);
        ArrayList<String> ywrf = new ArrayList<String>();
        for(int i = 1; i < blarp.size(); i++){
            ywrf.add(blarp.get(blarp.size()-i));
            System.out.println(ywrf);
        }
        System.out.println(ywrf);
    }
}
