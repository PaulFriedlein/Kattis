// Kattis problem
// Name: SMIL

import java.util.Scanner;

public class SMIL {
    
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        String data = input.nextLine();

        for (int i = 0; i < data.length() - 1; i++) {
            if (data.charAt(i) == ':' || data.charAt(i) == ';') {
                if (data.charAt(i+1) == '-' && i+2 < data.length()) {
                    if (data.charAt(i+2) == ')') {
                        System.out.println(i);
                    }
                }
                if (data.charAt(i+1) == ')') {
                    System.out.println(i);
                }
            }
        }
    }
}
