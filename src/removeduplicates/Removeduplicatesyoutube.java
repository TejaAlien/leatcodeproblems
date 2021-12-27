package removeduplicates;

import java.util.Scanner;

public class Removeduplicatesyoutube {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        int [] input = new int[size];
        for(int i =0; i<size;i++){
            input[i]=st.nextInt();
        }
int output = removeDuplicates(input);
        System.out.println(output);
    }
    public static int removeDuplicates (int[] nums){
        int j =1;
        for(int k =0;k<nums.length-1;k++){
            if(nums[k]!=nums[k+1]){
                nums[j] = nums[k+1];
                j++;
            }
        }
       return j;
    }
}
