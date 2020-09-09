package ArraysExercise03;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine1 = scan.nextLine();
        String [] wordsLine1 = inputLine1.split(" ");
        String inputLine2 = scan.nextLine();
        String [] wordsLine2 = inputLine2.split(" ");

        for (int i = 0; i < wordsLine2.length; i++) {
            for (int j = 0; j < wordsLine1.length ; j++) {
                if(wordsLine2[i].equals(wordsLine1[j])){
                    System.out.print(wordsLine2[i] + " ");
                }
            }
        }
    }
}
