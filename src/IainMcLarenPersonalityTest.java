import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IainMcLarenPersonalityTest {
    public static void main(String[] args)throws FileNotFoundException{
        intro();
    }
    public static void intro()throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.print("Input file name: ");
        File fileIn = new File(input.next());
        while (!fileIn.exists()){
            System.out.print("File not found. Try again: ");
            fileIn = new File(input.nextLine());
        }
        Scanner fileScan = new Scanner(fileIn);
        //System.out.println
        System.out.print("Output file name: ");
    }
}
