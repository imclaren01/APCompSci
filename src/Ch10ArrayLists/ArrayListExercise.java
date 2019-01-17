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
}
