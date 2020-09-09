package ArraysExercise03;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] train = new int[n];
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scan.nextLine());
            sum += train[i];
        }
        for (int waggon : train) {
            System.out.print(waggon + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
