package RegularExpressions09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        String text = scan.nextLine();

        Pattern myPattern = Pattern.compile(regex);
        Matcher myMatcher = myPattern.matcher(text);

        while (myMatcher.find()) {
            System.out.print(myMatcher.group() + " ");
        }
    }
}
