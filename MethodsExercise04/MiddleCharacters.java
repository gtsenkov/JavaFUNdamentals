package MethodsExercise04;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        middlePrint(input);

    }

    private static void middlePrint(String input) {
        int element1 = input.length() / 2;
        if (input.length() % 2 == 0) {
            int element2 = input.length() / 2 - 1;
            System.out.print(input.charAt(element2) + "" + input.charAt(element1));
        } else {
            System.out.print( input.charAt(element1));
        }
    }
}

