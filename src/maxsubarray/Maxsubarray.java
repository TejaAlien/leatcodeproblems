package maxsubarray;

import java.util.Map;
import java.util.Scanner;

public class Maxsubarray {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        int queries = st.nextInt();
        int size = st.nextInt();
        int[] input = new int[size];
        for(int g=0;g<queries;g++){


        for(int i =0; i<input.length;i++) {
            input[i] = st.nextInt();
        }
            Maxsubarray maxsubarray = new Maxsubarray();
            System.out.println( maxsubarray.maxsubarray(input));}


        }


    public int maxsubarray(int[] nums){
        int sum = 0;
        for(int j =0; j<nums.length;j++){
            sum = sum+nums[j];
        }
        return sum;

    }
}
