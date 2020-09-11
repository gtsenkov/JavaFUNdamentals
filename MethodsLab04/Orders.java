package MethodsLab04;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        productPricing(product, quantity);

    }

    private static void productPricing(String product, int quantity) {
        double result = 0;
        switch (product) {
            case "coffee":
                result = quantity * 1.5;
                break;
            case "water":
                result = quantity * 1.0;
                break;
            case "coke":
                result = quantity * 1.4;
                break;
            case "snacks":
                result = quantity * 2.0;
                break;
        }
        System.out.printf( "%.2f", result);
    }

}
