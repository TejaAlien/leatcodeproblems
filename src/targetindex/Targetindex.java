package targetindex;

import java.util.Scanner;

public class Targetindex {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int size = st.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = st.nextInt();
        }
        for (Integer j : input) {
            System.out.print(j + " ");
        }
        Targetindex targetindex = new Targetindex();
        int target = st.nextInt();
        int result = targetindex.searchInsert(input, target);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == target) {
                System.out.println(k);
            } else if (nums[k] < target && target < nums[k + 1]) {
                System.out.println("Inserting at index:" + (k + 1));
            }

                }
        return 0;
    }
}
