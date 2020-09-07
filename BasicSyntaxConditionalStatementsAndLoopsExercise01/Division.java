package BasicSyntaxConditionalStatementsAndLoopsExercise01;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        if (num % 10 == 0) {
            System.out.println("The number is divisible by 10");
            return;
        }
        if (num % 7 == 0) {
            System.out.println("The number is divisible by 7");
            return;
        }
        if (num % 6 == 0) {
            System.out.println("The number is divisible by 6");
            return;
        }
        if (num % 3 == 0) {
            System.out.println("The number is divisible by 3");
            return;
        }
        if (num % 2 == 0) {
            System.out.println("The number is divisible by 2");

        }
        else {
            System.out.println("Not divisible");
        }
    }
}