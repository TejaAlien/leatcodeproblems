package removeelementes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*sample input:3,2,2,3 , val =3
output: 2,2,_,_*/
public class Removeelements {
    public static void main(String[] args) {
Scanner st = new Scanner(System.in);
int size = st.nextInt();
System.out.println("Give the size of the array:"+ size);
int[] input = new int[size];

for(int i=0;i<size;i++){
    input[i]= st.nextInt();
}
int value = st.nextInt();
System.out.println("Give the value you want to remove: "+ value);
System.out.println("Final Result:");
removeelements(input,value);
    }
    public static int removeelements(int[] nums , int val){
        List<Integer> removelist = new ArrayList<>();
        List<Integer> addedlist = new ArrayList<>();
        for(int j =0;j<nums.length;j++){
            if(nums[j]==val){
                removelist.add(nums[j]);
            }
            else{
                addedlist.add(nums[j]);
            }
        }
        addedlist.forEach(u->System.out.println(u));
        return 0;
    }
}
