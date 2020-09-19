package TextProcessingExercise08;

import java.util.Scanner;

public class CharacterMultiplierAsDescribed { //IT IS SIMPLER
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputLine = scan.nextLine().split(" ");
        String word1 = inputLine[0];
        String word2 = inputLine[1];


        int min = Math.min(word1.length(), word2.length());
        int max = Math.max(word1.length(), word2.length());
        int sum = 0;

        for (int i = 0; i < max; i++) {
            if (i < min) {
                int letterValue1 = convertToDigit(word1, i);
                int letterValue2 = convertToDigit(word2, i);
                sum += letterValue1 * letterValue2;
            } else if (word1.length() == max) {
                sum += word1.charAt(i);
            } else {
              sum += word2.charAt(i);
            }
        }
        System.out.println(sum);
    }


    private static int convertToDigit(String word, int i) {
        int letterValue = word.charAt(i);

        return letterValue;
    }

}
