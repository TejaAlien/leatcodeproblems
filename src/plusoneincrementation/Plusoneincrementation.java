package plusoneincrementation;

import java.util.Scanner;

public class Plusoneincrementation {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        int[] input = new int[size];
        for(int i=0;i<input.length;i++){
            input[i]=st.nextInt();

        }
Plusoneincrementation plusoneincrementation = new Plusoneincrementation();
      int[] re
        =plusoneincrementation.plusOne(input);
      System.out.println(re);

    }
    public int[] plusOne(int[] digits){
      int n = digits.length;
      for(int k = n-1;k>=0;k--){
if(digits[k]<9){
    digits[k]=digits[k]+1;
    return digits;
}
digits[k]=0;
      }
      int[] new_number = new int[n+1];
      new_number[0]=1;
      return new_number;
}}
