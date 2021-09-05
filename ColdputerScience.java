// Kattis problem
// Name: Cold-puter Science
// Difficulty: 1.3
// Status: Solved


import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Number of temps to be entered by user
        int numTemps = input.nextInt();

        int belowZeroCount = 0;

        
        for (int i = 0; i < numTemps; i++) {
            int temp = input.nextInt();
            if (temp < 0)
                belowZeroCount++;
        }

        System.out.println(belowZeroCount);

    }
    
}
