package lenthoflastword;

import java.util.Scanner;

public class Lenghtoflastword {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String input = st.next();
Lenghtoflastword lenghtoflastword = new Lenghtoflastword();
System.out.println(lenghtoflastword.lenghtolastword(input));
    }
    public int lenghtolastword(String s ){
      //  String[] split = s.split(" ");

    //   return split.length==0?0: (split[split.length-1].length());
return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
