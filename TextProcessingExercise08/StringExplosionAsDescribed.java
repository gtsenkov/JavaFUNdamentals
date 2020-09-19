package TextProcessingExercise08;

import java.util.Scanner;

public class StringExplosionAsDescribed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '>') {
                sb.append(input.charAt(i));
            } else {
                int forward = 0;
                sb.append(input.charAt(i));
                int bombIndex = i;
                int power = Integer.parseInt(input.charAt(i + 1) + "");
                forward = bombIndex + power;

                for (int j = bombIndex + 1; j <= forward; j++) {
                    if (input.charAt(j) == '>') {
                        sb.append(input.charAt(j));
                        bombIndex = j;
                        forward = j + Integer.parseInt(input.charAt(j + 1) + "");
                        for (int k = bombIndex + 1; k <=forward ; k++) {
                            if (input.charAt(k) == '>') {
                                sb.append(input.charAt(k));
                                bombIndex = k;
                                forward = k + Integer.parseInt(input.charAt(k + 1) + "");
                            }
                        }
                    }
                }
                i = forward;
            }
        }
        System.out.println(sb);

    }
}
