package DataTypesAndVariables02Lab;

import java.util.Scanner;

public class ContactName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.printf("%s%s%s", firstName, delimiter, lastName);

    }
}
