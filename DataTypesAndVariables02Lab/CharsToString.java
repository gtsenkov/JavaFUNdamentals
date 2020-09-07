package DataTypesAndVariables02Lab;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringOfChars = "";
        for (int i = 0; i < 3; i++) {
            char character = scan.nextLine().charAt(0);
            stringOfChars += character;
        }
        System.out.println(stringOfChars);
    }
}
