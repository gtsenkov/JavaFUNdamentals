package ArraysExercise03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] digits = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(i -> (Integer.parseInt(i)))
                .toArray();
        int leftSum = 0;
        int rightSum = 0;
        boolean isEqual = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits.length == 1){
                System.out.println("0");
                return;
            }
            for (int j = i + 1; j < digits.length; j++) {
                rightSum += digits[j];
            }
            if (i >= 1) {
                for (int j = i - 1; j >= 0; j--) {
                    leftSum += digits[j];
                }
            }
            if ( leftSum == rightSum ){
                System.out.println(i);
                isEqual = true;
            }
            leftSum = 0;
            rightSum = 0;
        }
        if(!isEqual) {
            System.out.println("no");
        }
    }
}
