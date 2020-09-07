package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= num; i++) {
            boolean isSpecial = false;
            int sum = 0;
            int current = i;
            while (current != 0) {
                sum += current % 10;
                current = current / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");

            }
        }

    }
}
