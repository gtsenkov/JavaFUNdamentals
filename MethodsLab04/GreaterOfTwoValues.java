package MethodsLab04;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        switch (command){
            case "int":
                int firstNumber = Integer.parseInt(scan.nextLine());
                int secondNumber = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char first = scan.nextLine().charAt(0);
                char second = scan.nextLine().charAt(0);
                System.out.print(getMax(first, second));
                break;
            case "string":
                String firstS = scan.nextLine();
                String secondS = scan.nextLine();
                System.out.println(getMax(firstS, secondS));
                break;
        }

    }
    static int getMax (int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }
    static char getMax (char first, char second){
        if (first > second){
            return  first;
        }
        return second;
    }
    static String getMax(String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }
}
