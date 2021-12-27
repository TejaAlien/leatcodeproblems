package Sumleatcode.longestprefix;

import java.util.Scanner;

// find the  longest common prefix of the string from the array of two strings
//Input: str = ["flow","flight","flow"]
//output: "fl
//create a string array and take the input from scanner
public class Longestprefix {
    public static void main(String[] args) {
Scanner st = new Scanner(System.in);
int size = st.nextInt();
String [] str  = new String[size];
for(int i=0; i<size;i++){
    str[i] = st.next();
}
for(int k =0;k<str[k].length();k++) {
   char[] ch = str[k].toCharArray();
   for(Character v:ch){
       System.out.println(v);
   }
   System.out.println(" ");
}


}
    }

