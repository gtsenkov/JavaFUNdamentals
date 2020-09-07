package DataTypesAndVariables02Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        for (int i = start; i <= end ; i++) {
            char ascii = (char) i;
            System.out.print(ascii + " ");
        }
    }
}
