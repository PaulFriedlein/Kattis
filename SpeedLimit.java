// Kattis problem
// Name: Speed Limit

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Track number of data sets (bounds: 1<=n<=10)
        int count = 0;
        
        // Create array to hold milage for each set
        int[] miles = new int[10];

        // Variable to track the previous time elapsed
        int previous = 0;

        while (count <= 10) {
            int speed;
            int time;

            // Take user input for the number of entries for the set
            int numSets = input.nextInt();

            // If -1 is enter, break out of loop and display results
            if (numSets == -1)
                break;

            // Calculate milage for the set
            for (int i = 0; i < numSets; i++) {
                speed = input.nextInt();
                time = input.nextInt();
                miles[count] += (time - previous) * speed;
                previous = time;
            }
            
            // reset previous to zero for next set
            previous = 0;

            count++;
        }

        // Display results
        for (int i = 0; i < count; i++)
            System.out.println(miles[i] + " miles");
    }
    
}
