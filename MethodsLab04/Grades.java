package MethodsLab04;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        printInWords(grade);

    }

    private static void printInWords(double grade) {
        String gradeInWords = "";
        if (grade >= 2 && grade <= 2.99) {
            gradeInWords = "Fail";
        } else if (grade >= 3 && grade <= 3.49) {
            gradeInWords = "Poor";
        } else if (grade >= 3.5 && grade <= 4.49) {
            gradeInWords = "Good";
        } else if (grade >= 4.5 && grade <= 5.49) {
            gradeInWords = "Very good";
        }else if (grade >= 5.5 && grade <= 6){
            gradeInWords = "Excellent";
        }
        System.out.println(gradeInWords);
    }

    private static void grade(double grade) {

    }
}
