import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IainMcLarenSum{
    public static int DIG = 25;
    public static void main(String[] args) throws FileNotFoundException {
        reader();//Runs file thru program
    }
    public static void reader() throws FileNotFoundException {

        int j = 0;//act as for loop with an unknown end and will be used to print the total lines at the end
        Scanner in = new Scanner(new File("sum.txt"));
        while (in.hasNextLine()) { //classic file processing
            int[] totSum = new int[DIG]; //array acts as the final sum
            String eSign = "";//empty string that will be used to hold each line of the additions in the output
            String line = in.nextLine();
            Scanner tokens = new Scanner(line);
            j++;
            while (tokens.hasNext()) {
                int[] num = new int[DIG]; //Acts as current int being added
                String n = tokens.next(); //holds the current int as a string
                if(tokens.hasNext()) //tests whether there is another int after the current one to stop adding an extra "+" at the end of each line
                    eSign += n + " + ";
                else
                    eSign += n;
                String[] chng = new String[n.length()]; //makes an array with the length of the int we are using (which is being stored as a String)
                for(int i = 0; i<n.length(); i++)
                    chng[i]="" + n.charAt(i); //populates array with the string
                //System.out.println(Arrays.toString(chng)); (debug)

                for (int i = 0; i < chng.length; i++) {
                    num[i] += Integer.parseInt(chng[i]);//thanks google! (essentially converts each number in the String array into an int and then populates our original temporary array with them)
                }
                num = order(num, chng.length);
                totSum = addNums(num, totSum); //passes current line total sum array as well as the one we are currently working with


            }
            String sum = stringify(totSum);
            System.out.println(eSign + " = " + sum);

        }
        System.out.println("\nTotal lines = " + j);
    }
    public static int[] addNums(int[] num, int[] addUp) {
        for (int i = DIG-1; i>=0; i--) {
            addUp[i] += num[i];  //add each value of the current array to each of the sum array in the currect places (1s and 1s, 10s and 10s, etc)
            if (addUp[i]>9) { //Adds to the next digit if the added numbers go over 10
                addUp[i] = addUp[i]%10;
                addUp[i-1]++;
            }
        }
        return addUp;
    }
    public static int[] order(int[] upCount, int lngth) {
        for(int i = 0; i<DIG-lngth; i++) {//25 or whatever amnt of digits - the length of array holding one int from one file line
            for(int j = DIG-2; j>=0; j--) { //no out of bounds here... took a while though
                upCount[j+1] = upCount[j]; //each iteration takes the ints and moves them to the end of the array BUT DOESN'T SWITCH THE ORDER!!!
            }
            upCount[i] = 0;
        }
        return(upCount);

    }

    public static String stringify(int[] totSum) {
        String sumStr = "";
        boolean numHasStarted = false;
        for (int i = 0; i<DIG; i++) {
            if(totSum[i] != 0) {
                numHasStarted = true;
                sumStr += totSum[i]; //sets a string to the variables of our sum
            }
            else if(numHasStarted){
                sumStr += totSum[i];
            }
        }
        if(sumStr.equals(""))  //Because the string relies on there having been a number in the first place to start accepting numbers, if there isn't anything in the string we know the correct value is 0
            sumStr = "0";

        return sumStr;
    }
}

