package Sumleatcode.romantointeger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Romantointjavabrain {
    public static void main(String[] args) {

Romantointjavabrain romantointjavabrain = new Romantointjavabrain();
int ans = romantointjavabrain.romantoint("XC");
System.out.println(ans);
    }
    // creating this class which returns the result of the input string we provided
    public int romantoint(String s){
        Map<Character,Integer>  map = new HashMap<>();
        // we added all the roman characters and ssign the values to it using hashmap
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        // we are looping to that input string
        int result =0;
        //s.charAt(i) will give the character at that index and finding the value of that particular key character
        //using map.get(key)key in the sense s.charAt(i)
        // 248 in roman CCXLVIII the should be decreaasing
        //100 100 10 50 5 1 1 1 here 50 is greater than the previous one
        //100
        //100
        //10 i-1
        //50 i here i is greater than i-1 so we should substract i-1 twice because it added once so undo it and substract
        //again from the previous one
        //5
        //1
        //1
        //1
        //Example 90 is XC means 10 100 so we undo 10 first and subtract the 90 again from 100 to get 90 in the if condition
        for(int i =0; i<s.length();i++){
            if(i>0 && map.get(s.charAt(i))> map.get(s.charAt(i-1))){
                result = result+ (map.get(s.charAt(i))-(2*map.get(s.charAt(i-1))));//2times substract one for undo one for substract the previous
            }
            result=result+map.get(s.charAt(i));
        }
return result;
    }
}
