package BasicSyntaxConditionalStatementsAndLoopsExercise01;

import java.util.Scanner;

public class StrongNumberAsShown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int totalSum = 0;
        for (int i = 0; i < number.length(); i++) {
            int singleNum = Integer.parseInt(number.charAt(i) + "");
            int currentSum = 1;
            for (int j = 1; j <= singleNum; j++) {
                currentSum *= j;
            }
            totalSum += currentSum;
        }
        int numberCompare = Integer.parseInt(number);
        if (totalSum == numberCompare){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
