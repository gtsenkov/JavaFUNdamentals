package MethodsExercise04;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);
        String result = printFollowing (start, end);
        System.out.println(result);
    }

    private static String printFollowing(char start, char end) {
        String result = "";
        if (start < end) {
            for (int i = start + 1; i < end; i++) {
                result += (char) i + " ";
            }
        } else if (end < start) {
            for (int i = end + 1; i < start; i++) {
                result += (char) i + " ";
            }
        }
        return result;
    }
}
