package Lab01;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());


        if (multiplier > 10) {
            int result = number * multiplier;
            System.out.printf("%d X %d = %d%n", number, multiplier, result);
        }
        else {
            for (int i = multiplier; i < 11; i++) {
                int result = number * i;
                System.out.printf("%d X %d = %d%n", number, i, result);
            }
        }
    }
}
