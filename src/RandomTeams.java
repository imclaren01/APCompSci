public class RandomTeams {
    public static void main(String[] args){
        int[] history = new int[8];
        teamGen(history);
    }
    public static void teamGen(int[] history){
        //step 1: random num between 1 and 8
        int team1 = (int)(Math.random()*9) +1;
        int team2 = (int)(Math.random()*9) +1;
        while(team2 == team1){
            team2 = (int)(Math.random()*9) +1;
        }
        for(int i = 0; i<=history.length-1; i++){
            if(history[i]==0){
                history[i] = team1;
                history[i+1] = team2;
            }
        }
        System.out.println(team1 +", " + team2);

    }
}
