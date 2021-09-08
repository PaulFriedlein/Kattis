// Kattis problem
// Name: Tri
// Difficulty: 1.6
// Status: Solved


import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[3];

        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();

        if (numbers[0] + numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "+" + numbers[1] + "=" + numbers[2]);
        }
        else if (numbers[1] + numbers[2] == numbers[0]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "+" + numbers[2]);
        }
        else if (numbers[0] - numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "-" + numbers[1] + "=" + numbers[2]);
        }
        else if (numbers[1] - numbers[2] == numbers[0]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "-" + numbers[2]);
        }
        else if (numbers[0] * numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "*" + numbers[1] + "=" + numbers[2]);
        }
        else if (numbers[1] * numbers[2] == numbers[0]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "*" + numbers[2]);
        }
        else if (numbers[0] / numbers[1] == numbers[2]) {
            System.out.println(numbers[0] + "/" + numbers[1] + "=" + numbers[2]);
        }
        else if (numbers[1] / numbers[2] == numbers[0]) {
            System.out.println(numbers[0] + "=" + numbers[1] + "/" + numbers[2]);
        }
        
    }
}
