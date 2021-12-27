package Sumleatcode;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        int[] passvalues = new int[size];
        for (int i =0; i<size;i++){
            passvalues[i]=st.nextInt();
        }
       // System.out.println(passvalues);this one is actually returniing the address
 /*       for(int k =0;k<size;k++)
            System.out.println(passvalues[k]);*/
        int targ = st.nextInt();
        System.out.println("Target given for the int[] is "+targ);
            returning(passvalues,targ);

    }

   /* static int[] returning(int[] get , int target){
        int result =0;
        for(int m=0; m<get.length;m++){
            //System.out.println(get[m]+"index is:"+m);
            result=result+get[m];
            if(String.valueOf(target).equals(String.valueOf(result))){
                System.out.println("It's matched "+"index is "+m+" value:"+get[m]+" and"+"index: "+(m-1)+"value"+get[m-1]+"Sum:"+(get[m]+get[m-1]));
            }
        }
        return null;
    }*/
    static int[] returning(int[] get , int target){
        for (int s = 0; s<get.length;s++){
            for(int a=s+1;a<get.length;a++){
                if(get[a]==(target-(get[s]))){
                    return new int[] {s,a};
                }
            }
        }
        return null;
    }
}
