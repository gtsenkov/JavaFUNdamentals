package TextProcessingExercise08;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = scan.nextLine();
        int power = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == '>') {
                sb.append('>');
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            } else if (power == 0) {
                sb.append(current);
            } else {
                power--;
            }
        }
        System.out.println(sb);
    }
}
