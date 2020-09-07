package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endNum = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= endNum; i++) {
            int sum = 0;
            int currentNum = i;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");

            }
        }
    }
}
