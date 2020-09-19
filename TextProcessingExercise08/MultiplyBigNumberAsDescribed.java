package TextProcessingExercise08;

import java.util.Scanner;

public class MultiplyBigNumberAsDescribed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String bigNumber = scan.nextLine();
        int digit = Integer.parseInt(scan.nextLine());
        if (digit == 0) {
            System.out.println(0);
            return;
        }
        while (bigNumber.charAt(0) == '0') {
            bigNumber = bigNumber.substring(1);
        }
        int reminder = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int numberOfBigNumber = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int result = digit * numberOfBigNumber + reminder;
            reminder = 0;
            if (result > 9) {
                reminder = result / 10;
                result = result % 10;
            }
            sb.append(result);
        }

        if (reminder != 0) {
            sb.append(reminder);
        }
        System.out.println(sb.reverse().toString());
    }
}
