package DataTypesAndVariables02Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int capacity = 255;
        int sum = 0;
        int fillLiters = Integer.parseInt(scan.nextLine());
        sum += fillLiters;
        if (sum >= capacity) {
            System.out.println("Insufficient capacity!");
            sum -= fillLiters;
        }
        for (int i = 0; i < n-1; i++) {
            fillLiters = Integer.parseInt(scan.nextLine());
            sum += fillLiters;
            if (sum > capacity) {
                System.out.println("Insufficient capacity!");
                sum -= fillLiters;
            }
        }
        System.out.println(sum);

    }
}
