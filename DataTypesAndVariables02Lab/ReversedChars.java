package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringOfChars = "";
        for (int i = 0; i < 3 ; i++) {
            char letter = scan.nextLine().charAt(0);
            stringOfChars += letter;

        }
        for (int i = 2; i >= 0 ; i--) {
            System.out.printf("%c ", stringOfChars.charAt(i));

        }
    }
}
