import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args) {
        int totDays=0; //initializes the total days variable used in other methods
        int[] dayList = arrayGen(totDays); //array filled with all days' high temps
        double avgVar= avg(dayList, totDays); //variable for average high temp
        double overAvg = overAvg(dayList, avgVar);  //how many days went over the average
        System.out.println("Average temp = " + Math.round(avgVar*10)/10.); //print average temp rounded to the tenth
        System.out.println(overAvg + " days were above average."); //print how many days were over avg

    }
    public static int[] arrayGen(int totDays){ //creates the array of all days high temps
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        totDays = input.nextInt();//user response
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
        for(int i =0; i <=dayList.length-1; i++) {
            sum += dayList[i];
        }
        double avg = (double) sum / totDays; //find the average as a double of the sum of all days divided by the number of days
        return avg;
    }
    public static double overAvg(int[] dayList, double avgVar) { //days that are over avg
        int overAvg = 0;
        for (int i = 0; i <= dayList.length - 1; i++) { //uses array to find the the amount of days over the average found earlier
            if (avgVar < dayList[i]) {
                overAvg++;
            }
        }
        return overAvg;
    }

}