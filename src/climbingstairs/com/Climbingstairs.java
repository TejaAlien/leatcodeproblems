package climbingstairs.com;

import java.util.Scanner;

public class Climbingstairs {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int climbingposition = st.nextInt();
Climbingstairs climbingstairs = new Climbingstairs();
int noofways = climbingstairs.climbstairs(climbingposition);
System.out.println(noofways);
    }
    public int climbstairs(int n ){
        if(n<=1){
            return 1;//floor and first step only one way
        }
        int[] ways = new int[n+1];//we quit the zero so n+1  //6
        ways[0]=1;//no stairs
        ways[1]=1;//only one stair
        //ways[2] the distinct ways to reach 2 is ways[0]+ways[1]
        //ways[3] will be ways[1]+ways[2]
        for(int i =2;i<=n;i++){                //6
            ways[i]= ways[i-2]+ways[i-1]; //0->1 1->1 2->2 3->2+1 4->3+2 5->3+4 6->4+5 7->6+5
        }
        return ways[n];
    }
}
