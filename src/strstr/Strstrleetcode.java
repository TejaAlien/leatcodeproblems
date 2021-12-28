package strstr;

import java.util.Scanner;

public class Strstrleetcode {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String haystack = st.next();
        String needle = st.next();
System.out.println(strstr(haystack,needle));
    }
    public static int strstr(String haystack , String needle){
        if(needle.length()==0){
            return 0;
        }
        for(int j =0;j<haystack.length();j++){
            int k =0;
            for(;k<needle.length()&&(j+k)<haystack.length();k++){
                if(haystack.charAt(j+k)==needle.charAt(k)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(k==needle.length()){
                return j;
            }
            return -1;
        }
        return 0;
    }
}
