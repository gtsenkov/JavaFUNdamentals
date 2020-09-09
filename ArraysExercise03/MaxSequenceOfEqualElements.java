package ArraysExercise03;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputLine = scan.nextLine().split(" ");
        int longestEqual = 0;
        int longestEqualIndex = 0;
        for (int i = 0; i < inputLine.length - 1; i++) {
            int equalInLine = 0;
            while (inputLine[i].equals(inputLine[i + 1]) && i < inputLine.length - 1) {
                if (inputLine[i].equals(inputLine[i + 1])) {
                    equalInLine++;
                }
                if (equalInLine > longestEqual) {
                    longestEqual = equalInLine;
                    longestEqualIndex = i;
                }
                if (i >= inputLine.length - 2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        for (int i = 0; i <= longestEqual; i++) {
            System.out.print(inputLine[longestEqualIndex] + " ");
        }
    }
}
