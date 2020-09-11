package MethodsExercise04;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int result = vowelsCont(input);
        System.out.println(result);

    }

    private static int vowelsCont(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            String charToString = current + "";
            if (charToString.equalsIgnoreCase("a") || charToString.equalsIgnoreCase( "e") || charToString.equalsIgnoreCase("i") || charToString.equalsIgnoreCase("o") || charToString.equalsIgnoreCase("u")){
                counter++;
            }
        }
        return counter;
    }
}
