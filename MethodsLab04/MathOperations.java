package MethodsLab04;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNum = Integer.parseInt(scan.nextLine());

        double result = calculate(firstNum, operator, secondNum);
        System.out.print((int) result);

    }

    private static double calculate(int firstNum, String operator, int secondNum) {
        double result = 0;
        switch (operator) {
            case "/":
                result = firstNum*1.0 / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
        }
        return result;
    }
}
