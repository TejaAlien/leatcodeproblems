package Sumleatcode.longestprefix;

import java.util.Scanner;

public class Longestpref {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        String[] str = new String [size];
        for (int i =0;i< str.length;i++){
            str[i] = st.next();
        }
        for(String f: str){
            System.out.println(f);
        }
       // Longestcommonprefix(str);
        String prefixanswer = Longestcommonprefix(str);
        System.out.println(prefixanswer);
    }
    public static String Longestcommonprefix(String[] stringarray){
        if(stringarray.length==0){
            return "";
        }
        String prefix = stringarray[0];
        for(int i =1;i< stringarray.length;i++) {


            while (stringarray[i].indexOf(prefix)!=0) {
prefix = prefix.substring(0,prefix.length()-1);//flowe not same as flow again decerase the lenth flow same as flow
                //so zero while loop terminated checks with the other string flight with prefix :flow
            }
        }
        return prefix;
    }
}
//prefix: Flower
//["flower","flow","flight"]
//
// we are looping from index1 means["flow","flight"]
// at first prefix.lenght-1 removes r from the flower
//so prefix is flowe
//stringarray[i] is flow not the same begining
//so refix is flow now matches to the flow so while loop terminated and checks with other string
//flower(prefix) ->flowe->flow->same as flow whileloop terminated
/*
flow flower(prefix) not equal/er not there
        flow flowe(prefix) not getEqual/e is not there
        flow and flow(prefix) equal returns 0 while loop terminated
next string flight and flow(prefix) not equal /ow not there
flight and flo (prefix) not equal /o not there
flight and fl(prefix) matches first occurance so return fl;*///fl is there
