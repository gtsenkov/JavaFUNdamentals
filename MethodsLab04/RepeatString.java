package MethodsLab04;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        String repeat = toPrint(input, n);
        System.out.println(repeat);
    }
    private  static String toPrint (String input, int n){
        String toPrint = "";
        for (int i = 0; i < n ; i++) {
             toPrint += input;
        }
        return toPrint;
    }
}
