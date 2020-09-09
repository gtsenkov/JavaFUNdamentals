package ArraysExercise03;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] digits = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <  rotations ; i++) {
            String temp = digits [0];
            for (int j = 0; j < digits.length - 1 ; j++) {

                digits[j] = digits [j +1];
            }
            digits[digits.length-1] = temp;
        }
            System.out.print(String.join(" ", digits));
        }
    }
