package TextProcessingExercise08;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder encrypted = new StringBuilder();


        for (int i = 0; i < input.length() ; i++) {
            char current = input.charAt(i);

            encrypted.append((char) (current + 3));

        }
        System.out.println(encrypted);
    }
}
