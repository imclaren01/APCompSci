import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IainMcLarenPersonalityTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean fileCorrect = false;
        System.out.print("Input file name: ");
        while(!fileCorrect){
            String fileIn = input.next();
            try{
                Scanner in = new Scanner(new File(fileIn));
                fileCorrect = true;
            }catch (FileNotFoundException f){System.out.println("Invalid file name, try again");}
            }
        System.out.print("Output file name: ");
        String fileOut=input.next();

    }
}
