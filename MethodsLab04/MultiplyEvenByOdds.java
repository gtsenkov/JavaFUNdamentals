package MethodsLab04;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Math.abs(Integer.parseInt(scan.nextLine()));
        int result = multipliedSumsOfEvenAndOdds(input);
        System.out.println(result);
    }

    public static int multipliedSumsOfEvenAndOdds(int n) {
        int evenSum = getSumOfEvenNum(n);
        int oddSum = getSumOfOddNum(n);

        return evenSum * oddSum;
    }

    private static int getSumOfOddNum(int n) {
        int oddsSum = 0;
        while (n > 0) {
            int singleDigit = n % 10;
            if (singleDigit % 2 != 0) {
                oddsSum += singleDigit;
            }
            n /= 10;
        }
        return oddsSum;
    }

    private static int getSumOfEvenNum(int n) {
        int evensSum = 0;
        while (n > 0) {
            int singleDigit = n % 10;
            if (singleDigit % 2 == 0) {
                evensSum += singleDigit;
            }
            n /= 10;
        }
        return evensSum;
    }
}
