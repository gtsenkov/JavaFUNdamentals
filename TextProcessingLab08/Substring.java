package TextProcessingLab08;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String toFind = scan.nextLine();
        String toReplace = scan.nextLine();


        while (toReplace.contains(toFind)) {
            toReplace = toReplace.replace(toFind, "");
        }
        System.out.println(toReplace);
    }
}
