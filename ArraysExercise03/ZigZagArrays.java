package ArraysExercise03;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String [] array1 = new String[n];
        String [] array2 = new String [n];
        for (int i = 0; i < n; i++) {
            String [] dynamicArray = (scan.nextLine()).split(" ");
            if (i % 2 != 0) {
                array2[i] = dynamicArray[1];
                array1[i] = dynamicArray[0];
            } else {
                array2[i] = dynamicArray[0];
                array1[i] = dynamicArray[1];
            }
        }
        for (String s : array2) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : array1) {
            System.out.print(s + " ");
        }
    }
}
