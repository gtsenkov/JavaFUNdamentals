package TextProcessingExercise08;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] trials = scan.nextLine().split(", ");
        for (int i = 0; i < trials.length ; i++) {
            String trial = trials[i];

            if (containsValidSymbols(trial) && hasRightLength(trial)) {
                System.out.println(trial);
            }

        }
    }

    private static boolean hasRightLength(String trial) {
        if (trial.length() <= 16 && trial.length() >= 3) {
            return true;
        }
        return false;
        }


    private static boolean containsValidSymbols(String trial) {
        for (int j = 0; j < trial.length() ; j++) {
            char letter = trial.charAt(j);
            if (!Character.isDigit(letter) && !Character.isAlphabetic(letter) && !(letter == '_') && !(letter == '-')) {
                return false;
            }
            } return true;
    }
}
