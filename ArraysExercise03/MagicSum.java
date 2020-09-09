package ArraysExercise03;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numArray = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(i-> Integer.parseInt(i))
                .toArray();
        int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numArray.length - 1 ; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == sum){
                    System.out.print(numArray[i] + " ");
                    System.out.print(numArray[j] + " ");
                    System.out.println();
                }
            }
        }
    }
}
