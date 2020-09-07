package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class ConvertMetersToKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = Integer.parseInt(scan.nextLine());
        double km = meters*1.0 / 1000;

        System.out.printf("%.2f", km);

    }
}
