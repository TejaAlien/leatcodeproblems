package mergesortedarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mergesortedarray {
    @Override
    public String toString() {
        return "Mergesortedarray{}";
    }

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        int[] array1 = new int[size];
        for(int i =0;i< array1.length;i++){
            array1[i]=st.nextInt();
        }
        int secondarraysize = st.nextInt();
        int[] array2 = new int[secondarraysize];
        for(int j =0;j<array2.length;j++){
            array2[j] = st.nextInt();
        }
        Mergesortedarray mergesortedarray = new Mergesortedarray();
       System.out.println( mergesortedarray.merge(array1,size,array2,secondarraysize));
    }
    public List<Integer> merge (int[] nums1 , int m , int[] nums2 , int n){
    /*    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/
        List<Integer> list1 = new ArrayList<>();
        for(int k=0;k<nums1.length;k++) {


            list1.add(nums1[k]);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int l=0;l< nums2.length;l++){
            list2.add(nums2[l]);
        }
        List<Integer> addsecond= new ArrayList<>(list1);
        addsecond.addAll(list2);
        int [] result = new int[addsecond.size()];
        for(int w=0;w<result.length;w++){
            result[w]=addsecond.get(w);
        }
       return addsecond;
    }
}
