import java.util.Arrays;

public class RandomTeams {
    public static void main(String[] args) {
        int[] history = new int[8];
        for (int i = 0; i < 4; i++) {
            teamGen(history);
        }
        System.out.println(Arrays.toString(history));
    }

    public static void teamGen(int[] history) {
        //step 1: random num between 1 and 8
        int team1 = (int) (Math.random() * 8) + 1;
        for (int i = 0; i < history.length; i++) {
            while (history[i] == team1) {
                team1 = (int) (Math.random() * 8) + 1;
                i = 0;
            }
            if (history[i] == 0) {
                history[i] = team1;
                i = history.length;
            }
        }
        int team2 = team2(history);
        System.out.println(team1 + ", " + team2);
    }

    public static int team2(int[] history) {
        int team2 = (int) (Math.random() * 8) + 1;
        for (int i = 0; i < history.length; i++) {
            while (history[i] == team2) {
                team2 = (int) (Math.random() * 8) + 1;
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
