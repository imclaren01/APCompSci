import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[]args){
        randomArray();
    }
    public static void randomArray(){
        int[] rand = new int[(int)(Math.random() * 10) + 1]; //creates array with random length
            for(int i = 0; i<rand.length; i++){
                rand[i]=(int)(Math.random() * 10) + 1;
            }
        System.out.println(Arrays.toString(rand));
    }
}
