package ArraysExercise03;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();
        for (int i = 0; i < array.length - 1; i++) {
            int top = array[i];
            boolean isTop = true;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] <= array[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(top + " ");
            }
        }
        System.out.println(array[array.length-1]);
    }
}
