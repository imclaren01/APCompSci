import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array = {5,2,4,1,3};
        //oliverAlgo reverses array by using a temp array
        oliverAlgo(array);
    }
    public static void oliverAlgo(int[] oa){
        int[] temp = new int[oa.length];
        for(int i = 0; i >= oa.length-1; i++){
            temp[i] = oa[oa.length-1];
        }
        System.out.println(Arrays.toString(temp));

    }
}
