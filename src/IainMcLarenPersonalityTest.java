import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class IainMcLarenPersonalityTest {
    public static PrintStream output; //Allows multiple methods to print to the same file
    public static void main(String[] args)throws FileNotFoundException{
        intro();
    }
    public static void intro()throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.print("Input file name: ");
        File fileIn = new File(input.next());
        while (!fileIn.exists()){ //until the user gives a valid file name
            fileIn = new File(input.nextLine());
            if(!fileIn.exists()) //Won't print the time user answers correctly after answering incorrectly previously
                System.out.print("File not found. Try again: ");
        }
        Scanner fileScan = new Scanner(fileIn); //Scanner to view the entire file
        System.out.print("Output file name: ");
        output = new PrintStream(new File(input.next()));
        int i = 1; //Allows differentiation between names and test results by keeping track of what line the program is on
        while(fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            test(line, i); //As long as the file has a next line, send that line as well as the number of the line the program is on
            i++;
        }
    }
    public static void test(String line, int i)throws FileNotFoundException{
        if(i%2 == 1)//If the line number is even or odd (if odd, the line is a name, if even, it holds the test results
            nameOut(line);
        else
           resultsOut(line);
    }
    public static void nameOut(String line)throws FileNotFoundException{
        output.println(line+":"); //prints the name of the test taker
    }
    public static void resultsOut(String line) throws FileNotFoundException{
        line = line.toUpperCase();
        int[] ACount = new int[4];
        int[] BCount = new int[4];
        int counter = 0; //keeps track of the index of the string holding the test resutls
        int[] bPercent = new int[4];
        String type = ""; //will hold the personality type of the test taker
        for (int i = 0; i < 10; i++){
            for(int j = 1; j <= 7; j++){
                if(line.charAt(counter) == 'A'){
                    if(j == 1)                      //All possible test results
                        ACount[0]++;
                    else if(j == 2 || j == 3)
                        ACount[1]++;
                    else if(j == 4 || j == 5)
                        ACount[2]++;
                    else
                        ACount[3]++;
                }else if(line.charAt(counter) == 'B'){
                    if(j == 1)
                        BCount[0]++;
                    else if(j == 2 || j == 3)
                        BCount[1]++;
                    else if(j == 4 || j == 5)
                        BCount[2]++;
                    else
                        BCount[3]++;
                }
                counter++;
            }
        }
        for(int i = 0; i < 4; i++){
            bPercent[i] = (BCount[i] * 100) / (ACount[i] + BCount[i]);  //sets the percent array indexes to the number of answered 'B's times 100 (for percentage) divided by the total questions
            if(i == 0) {                        //All
                if (bPercent[i] > 50)
                    type += "I";
                else if (bPercent[i] == 50)
                    type += "X";
                else
                    type += "E";
            } else if (i == 1){
                if (bPercent[i] > 50)
                    type += "N";
                else if (bPercent[i] == 50)     //Possible
                    type += "X";
                else
                    type += "S";
            }else if(i == 2){
                if (bPercent[i] > 50)
                    type += "F";
                else if (bPercent[i] == 50)     //Test
                    type += "X";
                else
                    type += "T";
            }else{
                if (bPercent[i] > 50)
                    type += "P";
                else if (bPercent[i] == 50)     //Results
                    type += "X";
                else
                    type += "J";
            }
        }
        resultPrinter(ACount, BCount, bPercent,type); //Sends all important objects to another method to print them
    }
    public static void resultPrinter(int[] A, int[] B, int[] bP, String type){
        for(int i = 0; i < A.length; i++){
            output.print(A[i] + "A-" + B[i] + "B "); //For the lengths of the arrays, print to the output file the results (7A-3B...)
        }
        output.print("\n[");
        for(int j = 0; j < A.length-1; j++){
            output.print(+ bP[j] + "%, "); //prints percentages
        }
        output.println(bP[3] + "%]" + " = " + type + "\n");
    }
}
