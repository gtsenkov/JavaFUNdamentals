package MethodsExercise04;

import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        printSquare (input);
    }

    private static void printSquare(int input) {

        for (int i = 0; i < input ; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(input + " ");
            }
            System.out.println();
        }

    }
}
