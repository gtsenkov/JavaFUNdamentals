package Lab01;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicator = Integer.parseInt(scan.nextLine());

        for (int i = 1; i < 11 ; i++) {
            int result = multiplicator * i;
            System.out.printf("%d X %d = %d%n", multiplicator, i, result);

        }
    }
}
