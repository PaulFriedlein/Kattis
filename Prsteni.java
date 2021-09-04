import java.util.Scanner;

public class Prsteni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] rings = new int[n];

        for (int i = 0; i < n; i++) {
            rings[i] = input.nextInt();
        }

        double previous = 1;
        for (int i = 0; i < n - 1; i++) {
          
            //multiply
            double current = rings[i] * previous;

            //divide
            previous = current / rings[i+1];

            //display
            System.out.println(previous);

        }

        input.close();
    }
    
}
