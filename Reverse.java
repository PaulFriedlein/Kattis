// Kattis problem
// Name: Reverse

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] nums = new int[n]; 

        for (int i = 0; i < n; i++) {
            nums[n-1-i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }
}
