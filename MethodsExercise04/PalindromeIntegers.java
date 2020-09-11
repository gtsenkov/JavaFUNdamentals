package MethodsExercise04;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")) {
            boolean isPalindrome = findPalindrome(input);
            System.out.println(isPalindrome);
            input = scan.nextLine();
        }

    }

    private static boolean findPalindrome(String input) {
        boolean isPalindrome = false;
        if (input.length() > 1) {
            int j = input.length() - 1;
            for (int i = 0; i <= input.length() / 2; i++) {
                if ((input.charAt(i) + "").equals(input.charAt(j) + "")) {
                    j--;
                }
                if (j == input.length() - 1) {
                    break;
                }
                if (j == input.length() / 2) {
                    isPalindrome = true;
                }
            }
        }
        else {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
