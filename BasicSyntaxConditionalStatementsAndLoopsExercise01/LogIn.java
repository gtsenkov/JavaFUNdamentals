package BasicSyntaxConditionalStatementsAndLoopsExercise01;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        String password = "";
        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }
        int trials = 0;
        String trial = scan.nextLine();
        while (!trial.equals(password)) {
            trials++;
            if (trials > 3) {
                System.out.printf("User %s blocked!", userName);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            trial = scan.nextLine();
        }
        System.out.printf("User %s logged in.", userName);
    }
}
