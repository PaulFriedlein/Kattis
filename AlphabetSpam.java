// Kattis problem
// Name: Alphabet Spam

import java.util.*;

class AlphabetSpam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String data = input.nextLine();

        ratios(data);

        input.close();

    }//main

    public static void ratios(String d) {
        double whiteSpaces = 0;
        double lowerLetters = 0;
        double upperLetters = 0;
        double symbols = 0;

        int length = d.length();
        int current;

        for (int i = 0; i < length; i++) {
            current = d.charAt(i);
            if (current == 95)
                whiteSpaces++;
            else if (current > 96 && current < 123)
                lowerLetters++;
            else if (current > 64 && current < 91)
                upperLetters++;
            else
                symbols++;
        }

        System.out.println(whiteSpaces/length);
        System.out.println(lowerLetters/length);
        System.out.println(upperLetters/length);
        System.out.println(symbols/length);
      
    }//ratios
}