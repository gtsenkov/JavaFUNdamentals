package MethodsExercise04;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int result = smallest(first, second, third);
        System.out.println(result);

    }

    private static int smallest(int first, int second, int third) {
        int smallest = Integer.min(first, second);
        smallest = Integer.min(smallest, third);

        return smallest;
    }
}
