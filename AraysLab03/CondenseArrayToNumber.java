package AraysLab03;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums [] = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        for (int i = nums.length - 1 ; i >= 1 ; i--) {
            int[] condensed = new int [nums.length - 1];
            for (int j = 0; j < condensed.length ; j++) {
                condensed [j] = nums [j] + nums [j + 1];
            }
            nums = condensed;
        }
        System.out.println(nums[0]);
    }
}