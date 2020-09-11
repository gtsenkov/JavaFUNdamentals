package MethodsExercise04;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNum = Double.parseDouble(scan.nextLine());
        double secondNum = Double.parseDouble(scan.nextLine());

        double factorialsDivision = factorial(firstNum) / factorial(secondNum);
        System.out.printf("%.2f", factorialsDivision);
    }

    private static double factorial(double firstNum) {
        if (firstNum == 0){
            firstNum = 1;
        }
        for (double i = firstNum - 1; i > 1 ; i--) {
            firstNum = firstNum*i;
        }
        return firstNum;
    }

}
