import java.util.Arrays;
import java.util.Scanner;


/*This program takes in values the user says have been the high temperatures have been for the last few days(of their choice)
 and find and print the average
of those temperatures,as well as print the amount of days that are over the average.
*/
public class IainMcLarenWeatherAnalysis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int totDays=input.nextInt();//initializes the total days variable used in other methods
        int[] dayList = arrayGen(totDays, input); //array filled with all days' high temps
        double avgVar= avg(dayList, totDays); //variable for average high temp
        double overAvg = overAvg(dayList, avgVar);  //how many days went over the average
        System.out.println("Average temp = " + Math.round(avgVar*10)/10.);
        System.out.println((int)overAvg + " days were above average.");
        System.out.println("\nTemperatures: " + Arrays.toString(dayList)); //print entire array
        Arrays.sort(dayList);
        //System.out.println(Arrays.toString(dayList));
        System.out.println("Two coldest days: " + dayList[0] + ", " + dayList[1]); //print coldest day values
        System.out.println("Two hottest days: " + dayList[dayList.length-1] + ", " + dayList[dayList.length-2]); //print hottest day values
    }
    public static int[] arrayGen(int totDays, Scanner input){ //creates the array of all days high temps
        int[] dayList = new int[totDays]; //create array
        for (int i = 0; i <= totDays-1; i++) {
            int tempDay = i + 1;
            System.out.print("Day " + tempDay + "'s high temp: ");
            dayList[i]= input.nextInt();
        }
        return dayList;
    }
    public static double avg(int[] dayList, int totDays){ //generates average based on a sum of all numbers in array
        int sum = 0;
        for(int i =0; i <=dayList.length - 1; i++) {
            sum += dayList[i];
        }
        double avg = (double) sum / totDays; //find the average as a double of the sum of all days divided by the number of days
        return avg;
    }
    public static int overAvg(int[] dayList, double avgVar) {
        int overAvg = 0;
        for (int i = 0; i <= dayList.length - 1; i++) { //uses array to find the the amount of days over the average found earlier
            if (avgVar < dayList[i]) {
                overAvg++;
            }
        }
        return overAvg;
    }

}