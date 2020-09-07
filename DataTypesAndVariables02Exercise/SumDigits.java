package DataTypesAndVariables02Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while ( input > 0) {
            sum += input % 10;
            input = input / 10;
        }
        System.out.println(sum);
    }
}
