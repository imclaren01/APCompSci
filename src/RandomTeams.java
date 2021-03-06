import java.util.Arrays;
import java.util.Scanner;

public class RandomTeams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many teams will be competing?");
        int length = input.nextInt();
        int[] history = new int[length]; //create array
        for (int i = 0; i < length/2; i++) { //for loop to run thru all teams
            teamGen(history, length);
        }
        System.out.println(Arrays.toString(history));
    }

    public static void teamGen(int[] history, int length) {
        //step 1: random num between 1 and length
        int team1 = (int) (Math.random() * length) + 1;
        for (int i = 0; i < history.length; i++) {
            while (history[i] == team1) {
                team1 = (int) (Math.random() * length) + 1;
                i = 0;
            }
            if (history[i] == 0) {
                history[i] = team1;
                i = history.length;
            }
        }
        int team2 = team2(history, length);
        System.out.println("Team " + team1 + " against Team " + team2);
    }

    public static int team2(int[] history, int length) {
        int team2 = (int) (Math.random() * length) + 1;
        for (int i = 0; i < history.length; i++) {
            while (history[i] == team2) {
                team2 = (int) (Math.random() * length) + 1;
                i = 0;
            }
            if (history[i] == 0) {
                history[i] = team2;
                i = history.length;
            }
        }
        return team2;
    }
}
