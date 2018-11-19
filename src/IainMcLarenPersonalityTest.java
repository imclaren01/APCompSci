import java.util.Scanner;

public class IainMcLarenPersonalityTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Input file name: ");
        }catch {
            String fileIn = input.next();
        }
        System.out.print("Output file name: ");
        String fileOut=input.next();
    }
}
