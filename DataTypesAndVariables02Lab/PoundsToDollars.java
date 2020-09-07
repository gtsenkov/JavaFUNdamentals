package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pound = Double.parseDouble(scan.nextLine());
        double convertToDollar = pound * 1.31;
        System.out.printf("%.3f", convertToDollar);
    }
}
