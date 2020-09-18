package TextProcessingLab08;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)) {
                System.out.print(current);
            }
        }
        System.out.println();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isAlphabetic(current)) {
                System.out.print(current);
            }
        }
        System.out.println();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!Character.isAlphabetic(current) && !Character.isDigit(current)) {
                System.out.print(current);
            }
        }
    }
}


