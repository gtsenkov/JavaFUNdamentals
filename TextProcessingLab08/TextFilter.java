package TextProcessingLab08;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] banWords = scan.nextLine().split(", ");
        String text = scan.nextLine();
        
        for (int i = 0; i < banWords.length ; i++) {
            if (text.indexOf(banWords[i]) != -1) {
                String replacement = repeatStr("*", banWords[i].length());
                text = text.replaceAll(banWords[i], replacement);
            }
        }
        System.out.println(text);
    }

    private static String repeatStr(String str, int length) {
        String replacement = "";
        for (int i = 0; i < length ; i++) {
            replacement += str;
        }
        return replacement;
    }
}
