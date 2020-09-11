package MethodsExercise04;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scan.nextLine());
        int secondDigit = Integer.parseInt(scan.nextLine());
        int thirdDigit = Integer.parseInt(scan.nextLine());

        int sum = plusOperation(firstDigit, secondDigit);
        int subtracted = subtraction(sum, thirdDigit);

        System.out.println(subtracted);

    }

    private static int plusOperation(int firstDigit, int secondDigit) {
        return firstDigit + secondDigit;
    }

    private static int subtraction(int sum, int third) {
        return sum - third;
    }
}
