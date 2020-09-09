package AraysLab03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstNums = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondNums = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int maxLength = Math.max(firstNums.length, secondNums.length);
        int sum = 0;
        for (int i = 0; i < maxLength; i++) {
            sum += firstNums[i];
            if (firstNums[i] != secondNums[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
            if (maxLength -1 == i) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }
    }
}
