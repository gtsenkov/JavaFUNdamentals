package Lab01;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int i = -1;
        for (int j = 1; j <= n; j++ ) {
            i += 2;
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d", sum   );
    }
}
