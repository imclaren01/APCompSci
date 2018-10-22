import java.util.Arrays;

public class Testing {
    public static void main(String[] args){
        int[] ar = new int[]{1,3,5,7,9,11,13,15,17};
        swaps(ar);
    }
    public static void swaps(int[] ar) {
        for(int i =0; i<ar.length-1; i+=2){
            int temp =ar[i];
            ar[i]=ar[i+1];
            ar[i+1] =temp;
        }
        System.out.println(Arrays.toString(ar));
    }
}
