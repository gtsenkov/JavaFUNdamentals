package TextProcessingExercise08;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = scan.nextLine();
        char base = input.charAt(0);
        sb.append(base);

        for (int i = 1; i < input.length() ; i++) {
            char currentChar = input.charAt(i);
            if (base != currentChar) {
                sb.append(currentChar);
                base = currentChar;

            }

        }
        System.out.println(sb);

    }

}
