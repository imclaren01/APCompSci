
public class AdvancedArrayPractice {
    public static void main(String[] args){
        System.out.println(LIAMmostFrequentDigit(100*i +235934));
    }
    public static int LIAMmostFrequentDigit(int pass){
        int[] arr = new int[10];
        for(int i = 0; pass > 0; i++){ //for as long as the number is above 0
            arr[pass%10] +=1 ;//set index of the digit found to be one higher
            pass = pass/10;//get rid of past digits
        }
        int max = -1;
        int loco = -1;
        for(int i = 0; i<10; i++){
            if(arr[i]>max){ //if the max number of one digit is is less than the number of digits at an index of i
                max = arr[i];// set the max = the value in index i
                loco = i;
        }
        }
        return loco;
    }
}