package TextProcessingLab08;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");

        for (String word : words) {
            StringBuilder result = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                result.append(word);
            }
            System.out.print(result);

        }

    }
}
