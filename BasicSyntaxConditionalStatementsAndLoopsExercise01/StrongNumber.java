package BasicSyntaxConditionalStatementsAndLoopsExercise01;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int inputAsNumber = Integer.parseInt(number);
        int cycles = number.length();
        int sum = 0;
        for (int i = 0; i < cycles ; i++) {
            String num = String.valueOf(number.charAt(i));
            int singularNum = Integer.parseInt(num);
            if (singularNum == 0 || singularNum == 1){
                sum += 1;
                continue;
            }
            int multiplicand = singularNum -1;
            int result = singularNum * multiplicand;
            for (int j = singularNum-2; j > 0 ; j--) {
               result = result * (j);
            }
            sum += result;
        }
        if (inputAsNumber == sum){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
