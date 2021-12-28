package squarerootleetcoe;

import java.util.Scanner;

public class Squarerootleetcode {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int squareroofof = st.nextInt();
Squarerootleetcode squarerootleetcode = new Squarerootleetcode();
int result = squarerootleetcode.mysqrtr(squareroofof);
System.out.println(result);
    }
    public int mysqrtr(int sqr){ // 5 //6
        int left =1 ; int right =sqr;
        while (left<=right){
            int mid = ((left)-(right-left)/2);//same as left+right/2 //1+5/2 = 3 ///3
            if(mid<sqr/mid) left= mid+1; //3<2 false //3<3false
            else if (mid>sqr/mid) right = mid-1;//3>2 true = 3-1 = 2//3>3 false
            else return mid; //3
        }
        return right;
    }
}
