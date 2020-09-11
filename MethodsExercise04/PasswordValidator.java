package MethodsExercise04;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String trial = scan.nextLine();
        boolean lengthIsValid = lengthValidator(trial);
        boolean noSymbolsIsValid = noSymbolsValidator(trial);
        boolean atLeast2Digits = twoDigits(trial);
        if(lengthIsValid && noSymbolsIsValid && atLeast2Digits ) {
            System.out.println("Password is valid");
        }
    }

    private static boolean lengthValidator(String trial) {
        boolean lengthValidation = true;
            if (trial.length() < 6 || trial.length() > 10) {
                System.out.println("Password must be between 6 and 10 characters");
            lengthValidation = false;
        }
        return lengthValidation;
    }
    private static boolean noSymbolsValidator(String trial) {
        boolean noSymbolsValidation = false;
        for (int i = 0; i < trial.length(); i++) {
            if ((trial.charAt(i) >= 97 && trial.charAt(i) <= 122)
                    || (trial.charAt(i) >= 65 && trial.charAt(i) <= 90)
                    || (trial.charAt(i) >= 48 && trial.charAt(i) <= 57)) {
                noSymbolsValidation = true;
            }else {
            System.out.println("Password must consist only of letters and digits");
                noSymbolsValidation = false;
                break;
            }
        }
        return noSymbolsValidation;
    }
    private static boolean twoDigits(String trial) {
        boolean twoDigits = false;
        int digitCounter = 0;
        for (int i = 0; i < trial.length(); i++) {
            if (trial.charAt(i) >= 48 && trial.charAt(i) <= 57) {
                digitCounter++;
                if (digitCounter >= 2){
                twoDigits = true;
                break;
                }
            }
        }
        if (digitCounter < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        return twoDigits;
    }
}