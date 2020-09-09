package AraysLab03;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] parts = scan.nextLine().split(" ");

        for (int i = 0; i < parts.length / 2; i++) {

            String temp = parts[i];
            parts [i] = parts[parts.length - i - 1];
            parts[parts.length - i - 1] = temp;
        }
        System.out.println(String.join(" ", parts));
    }
}
