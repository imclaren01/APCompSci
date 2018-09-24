import java.util.Scanner;

public class WeatherAnalysisV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int totdays = input.nextInt();
        int sum = 0;
        int[] dayList = new int[totdays];
        for (int i = 0; i <= totdays-1; i++) {
            int temp;
            int tempDay = i + 1;
            System.out.print("Day " + tempDay + "'s high temp: ");
            temp = input.nextInt();
            sum += temp;
            dayList[i]= temp;
        }
        double avg=(double)sum/totdays;
        int overAvg = 0;
        for(int i = 0; i <= dayList.length-1; i++) {
            if(avg < dayList[i]){
                overAvg++;
            }
        }
        System.out.println("Average temp = " + Math.round(avg*10)/10.);
        System.out.println(overAvg + " days were above average.");



    }

}