package TextProcessingExercise08;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputLine = scan.nextLine().split(" ");
        String word1 = inputLine[0];
        String word2 = inputLine[1];

        if (word1.length() == word2.length()) {
            int sum = 0;
            for (int i = 0; i < word1.length(); i++) {
                int letterValue1 = convertToDigit(word1, i);
                int letterValue2 = convertToDigit(word2, i);
                sum += letterValue1 * letterValue2;
            }
            System.out.println(sum);

        } else {
            int sum = 0;
            int min = Math.min(word1.length(), word2.length());
            for (int i = 0; i < min; i++) {
                int letterValue1 = convertToDigit(word1, i);
                int letterValue2 = convertToDigit(word2, i);
                sum += letterValue1 * letterValue2;
            }
            int max = Math.max(word1.length(), word2.length());
            if (word1.length() > word2.length())
                for (int i = min; i < max; i++) {
                    int letterValue = convertToDigit(word1, i);
                    sum += letterValue;
                }
            else {
                for (int i = min; i < max; i++) {
                    int letterValue = convertToDigit(word2, i);
                    sum += letterValue;
                }
            }
            System.out.println(sum);
        }
    }



    private static int convertToDigit(String word, int i) {
        int letterValue = word.charAt(i);

        return letterValue;
    }

}
