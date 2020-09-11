package MethodsExercise04;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            boolean isDivisible = divideByEight(i);
            boolean hasOddDigit = atLeastOneOdd (i);
            if (isDivisible && hasOddDigit) {
                System.out.println(i);
            }
        }
    }
    private static boolean divideByEight(int input) {
        boolean isDivisible = false;
        int currentDigit = 0;
        int sum = 0;
        while ( input != 0) {
            currentDigit = input % 10;
            sum += currentDigit;
            input /= 10;
        }
        if (sum % 8 == 0) {
            isDivisible = true;
        }
        return isDivisible;
    }
    private static boolean atLeastOneOdd(int i) {
        boolean hasOdd = false;
        int currentDigit = i;
        while ( currentDigit != 0) {
            currentDigit %= 10;
            if (currentDigit % 2 != 0){
                hasOdd = true;
                break;
            }
            currentDigit /= 10;
        }
        return hasOdd;
    }
}
