// Kattis problem
// Name: Unlock Pattern
// Difficulty: 1.6
// Status: Solved

import java.util.Scanner;

public class unlockPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create empty number pad
        int numPad[][] = new int[3][3];

        // Take input from user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numPad[i][j] = input.nextInt();
            }
        }

        // Initialize values
        double totalDistance = 0;
        int current[] = findPosition(numPad, 1);
        int next[] = new int[2];

        // Calcluate total distance
        for (int i = 2; i < 10; i++) {
            // Find the next position
            next = findPosition(numPad, i);

            /* Calculate the distance between the current and next 
            position and add it to the total distance */
            totalDistance += distance(current, next);

            // Make the current position the next position
            current = next;
        }

        // Display result
        System.out.println(totalDistance);

    }//main
    //--------------------------------------------------------------------------------
    public static int[] findPosition(int[][] pad, int value) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pad[i][j] == value) {
                    return new int[] {i, j};
                }
            }
        }
        // returns -1 for row and col if value is not found
        return new int[] {-1, -1};
    }//findPosition
    //--------------------------------------------------------------------------------
    public static double distance(int[] current, int[] next) { 
        // Returns the distance between two points (Distance formula)
        return Math.sqrt(Math.pow((current[0]-next[0]),2)+Math.pow(current[1]-next[1],2));
    }//distance
    //--------------------------------------------------------------------------------
}